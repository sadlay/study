package com.decorator3;

public class MilkDecorator extends Decorator {
    
    public MilkDecorator(Coffee mCoffee) {
        super(mCoffee);
    }
    
    @Override
    public int getPrice() {
        return mCoffee.getPrice() + 10;
    }
    
    @Override
    public String getName() {
        
        return "Milk " + mCoffee.getName();
    }
    
}
