package com.decorator4;

/**
 * 米饭装饰类，继承了Rice基类
 * @Description TODO 
 * @ClassName   RiceDecorator 
 * @Date        2018年8月15日 下午3:43:39 
 * @Author      Zhao.GS
 */
public abstract class RiceDecorator implements Rice {
    
    Rice mRice;
    
    //定义Rice基类的对象，通过构造器引用传递进来的对象
    public RiceDecorator(Rice mRice) {
        this.mRice = mRice;
    }
    
    //将具体的行为（方法）放到子类中去实现
    @Override
    public abstract int getPrice();
    
    @Override
    public abstract String getName();
    
}
