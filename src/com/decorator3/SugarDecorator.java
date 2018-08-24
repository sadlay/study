package com.decorator3;

public class SugarDecorator extends Decorator {
    
    public SugarDecorator(Coffee mCoffee) {
        super(mCoffee);
    }
    
    @Override
    public int getPrice() {
        return mCoffee.getPrice() + 5;
    }
    
    @Override
    public String getName() {
        return "Sugar " + mCoffee.getName();
    }
    
}
