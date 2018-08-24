package com.strategy;

@PriceRegion(min = 10000, max = 20000)
public class Vip implements CalPrice {
    
    @Override
    public double calPrice(double orginPrice) {
        return orginPrice * 0.9;
    }
    
}
