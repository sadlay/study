package com.strategy;

@PriceRegion(min = 20000, max = 30000)
public class SuperVip implements CalPrice {
    
    @Override
    public double calPrice(double orginPrice) {
        return orginPrice * 0.8;
    }
    
}
