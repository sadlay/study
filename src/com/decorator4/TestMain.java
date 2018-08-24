package com.decorator4;

public class TestMain {
    
    public static void main(String[] args) {
        Rice mRice = new BaseRice();//一碗白米饭
        mRice = new GBJDRiceDecorator(mRice);//对米饭进行加菜-宫保鸡丁（装饰）
        mRice = new YXRSRiceDecorator(mRice);//继续对米饭进行加菜-鱼香肉丝（装饰）
        mRice = new FQJDRiceDecorator(mRice);//继续加菜-番茄鸡蛋
        System.out.println("饭名：" + mRice.getName() + "\t价格：" + mRice.getPrice());
    }
    
}
