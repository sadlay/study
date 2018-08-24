package com.decorator4;

/**
 * 基本米饭类，实现米饭接口
 * @Description TODO 
 * @ClassName   BaseRice 
 * @Date        2018年8月15日 下午3:38:48 
 * @Author      Zhao.GS
 */
public class BaseRice implements Rice {
    
    @Override
    public int getPrice() {
        return 5;//只要米饭价格为5
    }
    
    @Override
    public String getName() {
        return "米饭";//返回名称
    }
    
}
