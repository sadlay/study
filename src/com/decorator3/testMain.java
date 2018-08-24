package com.decorator3;

public class testMain {
    
    public static void main(String[] args) {
        Coffee mCoffee = new SimpleCoffee();
        System.out.println("No Any orther coffee:" + mCoffee.getName() + "----price:" + mCoffee.getPrice());
        
        mCoffee = new MilkDecorator(mCoffee);
        System.out.println(mCoffee.getName() + "----price:" + mCoffee.getPrice());
        
        mCoffee = new SugarDecorator(mCoffee);
        System.out.println(mCoffee.getName() + "----price:" + mCoffee.getPrice());
    }
    
}
