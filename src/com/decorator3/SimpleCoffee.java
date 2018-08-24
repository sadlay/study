package com.decorator3;

public class SimpleCoffee implements Coffee {
    
    @Override
    public int getPrice() {
        return 10;
    }
    
    @Override
    public String getName() {
        return "coffee";
    }
    
}
