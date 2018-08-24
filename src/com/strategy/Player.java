package com.strategy;

public class Player {
    private Double totalAmount = 0d;
    
    private Double amount = 0d;
    
    private CalPrice calPrice = new Orgin();
    
    public void buy(Double amount) {
        this.amount = amount;
        totalAmount += amount;
        calPrice = CalPriceFactory.getInstance().createCalPrice(this);
    }
    
    public Double calLastAmount() {
        return calPrice.calPrice(amount);
    }
    
    public Double getTotalAmount() {
        return totalAmount;
    }
    
    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }
    
    public Double getAmount() {
        return amount;
    }
    
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    
}
