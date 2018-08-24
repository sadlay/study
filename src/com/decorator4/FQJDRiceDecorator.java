package com.decorator4;

//番茄鸡蛋装饰类
public class FQJDRiceDecorator extends RiceDecorator {
    
    public FQJDRiceDecorator(Rice mRice) {
        super(mRice);
    }
    
    @Override
    public int getPrice() {
        return mRice.getPrice() + 3;//番茄鸡蛋价格是3
    }
    
    @Override
    public String getName() {
        return "番茄鸡蛋 " + mRice.getName();//组合饭名
    }
}
