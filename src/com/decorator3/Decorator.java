package com.decorator3;

public abstract class Decorator implements Coffee {
    Coffee mCoffee;
    
    public Decorator(Coffee mCoffee) {
        this.mCoffee = mCoffee;
    }
    
    @Override
    public abstract int getPrice();
    
    @Override
    public abstract String getName();
    
}
