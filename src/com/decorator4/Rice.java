package com.decorator4;

/**
 * 米饭接口  Component
 * @Description TODO 
 * @ClassName   Rice 
 * @Date        2018年8月15日 下午3:36:03 
 * @Author      Zhao.GS
 */
public interface Rice {
    
    /**
     * 获取价格
     * @return
     * @Date        2018年8月15日 下午3:36:45 
     * @Author      Zhao.GS
     */
    public int getPrice();
    
    /**
     * 获取名称
     * @return
     * @Date        2018年8月15日 下午3:37:08 
     * @Author      Zhao.GS
     */
    public String getName();
}
