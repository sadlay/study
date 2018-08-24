package com.arithmetic;

public abstract class Arithmetic {
    protected double numberA;
    
    protected double numberB;
    
    public abstract double reNum();
    
    public double getNumberA() {
        return numberA;
    }
    
    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }
    
    public double getNumberB() {
        return numberB;
    }
    
    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }
    
}
