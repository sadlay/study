package com.strategy;

@PriceRegion(max = 10000)
public class Orgin implements CalPrice {
    
    @Override
    public double calPrice(double orginPrice) {
        return orginPrice;
    }
    
}
