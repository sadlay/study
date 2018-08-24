
package com.strategy;

import java.io.File;
import java.io.FileFilter;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public class CalPriceFactory {
    private static final String PACKAGE_LOCATION = "com.strategy";
    
    private List<Class<? extends CalPrice>> calPriceList; //策略列表
    
    private ClassLoader classloader = getClass().getClassLoader();
    
    //扫描包的class文件
    private File[] getResource() {
        try {
            File file = new File(classloader.getResource(PACKAGE_LOCATION.replace(".", "/")).toURI());
            return file.listFiles(new FileFilter() {
                
                @Override
                public boolean accept(File pathname) {
                    if (pathname.getName().endsWith(".class")) {
                        return true;
                    }
                    return false;
                }
            });
        }
        catch (URISyntaxException e) {
            e.printStackTrace();
            throw new RuntimeException("未找到相关资源");
        }
    }
    
    public CalPriceFactory() {
        init();
    }
    
    //加载策略列表
    @SuppressWarnings("unchecked")
    private void init() {
        calPriceList = new ArrayList<Class<? extends CalPrice>>();
        File[] resouce = getResource();
        Class<CalPrice> calPriceClazz = null;
        try {
            calPriceClazz = (Class<CalPrice>)classloader.loadClass(CalPrice.class.getName());
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("class not fount");
        }
        for (int i = 0; i < resouce.length; i++) {
            try {
                Class<?> clazz = classloader.loadClass(PACKAGE_LOCATION + "." + resouce[i].getName().replace(".class", ""));
                if (CalPrice.class.isAssignableFrom(clazz) && clazz != calPriceClazz) {
                    calPriceList.add((Class<? extends CalPrice>)clazz);
                }
            }
            catch (ClassNotFoundException e) {
                e.printStackTrace();
                throw new RuntimeException("class not fount");
            }
        }
    }
    
    public CalPrice createCalPrice(Player customer) {
        for (Class<? extends CalPrice> clazz : calPriceList) {
            PriceRegion validRegion = clazz.getAnnotation(PriceRegion.class);
            if (customer.getTotalAmount() > validRegion.min() && customer.getTotalAmount() < validRegion.max()) {
                try {
                    return clazz.newInstance();
                }
                catch (InstantiationException | IllegalAccessException e) {
                    e.printStackTrace();
                    throw new RuntimeException("instance exception");
                }
            }
        }
        return null;
    }
    
    public static CalPrice getCalPrice(Player customer) {
        if (customer.getTotalAmount() > 30000) {//3000则改为金牌会员计算方式
            return new GoldVip();
        }
        else if (customer.getTotalAmount() > 20000) {//类似
            return new SuperVip();
        }
        else if (customer.getTotalAmount() > 10000) {//类似
            return new Vip();
        }
        else {
            return new Orgin();
        }
    }
    
    public static CalPriceFactory getInstance() {
        return CalPriceInstance.instance;
    }
    
    private static class CalPriceInstance {
        private static CalPriceFactory instance = new CalPriceFactory();
    }
}
