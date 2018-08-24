package com.decorator4;

/**
 * 鱼香肉丝装饰类，继承抽象装饰类RiceDecorator，具体去实现
 * @Description TODO 
 * @ClassName   GBJDRiceDecorator 
 * @Date        2018年8月15日 下午3:49:38 
 * @Author      Zhao.GS
 */
public class YXRSRiceDecorator extends RiceDecorator {
    
    public YXRSRiceDecorator(Rice mRice) {
        super(mRice);
    }
    
    @Override
    public int getPrice() {
        return mRice.getPrice() + 4;//鱼香肉丝价格是4
    }
    
    @Override
    public String getName() {
        return "鱼香肉丝 " + mRice.getName();//组合饭名
    }
    
}
