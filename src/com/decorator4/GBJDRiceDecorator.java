package com.decorator4;

/**
 * 宫保鸡丁装饰类，继承抽象装饰类RiceDecorator，具体去实现
 * @Description TODO 
 * @ClassName   GBJDRiceDecorator 
 * @Date        2018年8月15日 下午3:49:38 
 * @Author      Zhao.GS
 */
public class GBJDRiceDecorator extends RiceDecorator {
    /**
     * 传递引用对象，实现类的包装
     * @param mRice
     */
    public GBJDRiceDecorator(Rice mRice) {
        super(mRice);
    }
    
    /**
     * 核心：对功能的拓展和装饰（对价格和名称进行累积）
     */
    @Override
    public int getPrice() {
        int price = 5;//宫保鸡丁价格为5
        int totalPrice = mRice.getPrice() + price;//叠加价格（装饰）
        return totalPrice;
    }
    
    @Override
    public String getName() {
        return "宫保鸡丁 " + mRice.getName();//组合饭名
    }
    
}
