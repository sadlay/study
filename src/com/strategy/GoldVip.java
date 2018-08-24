package com.strategy;

@PriceRegion(min = 30000)
public class GoldVip implements CalPrice {
    
    @Override
    public double calPrice(double orginPrice) {
        return orginPrice * 0.7;
    }
    
}
