package com.arithmetic;

public class ArithmeticContext {
    private Arithmetic arithmetic;
    
    public ArithmeticContext(String name) {
        switch (name) {
            case "加法":
                arithmetic = new Add();
                break;
            case "减法":
                arithmetic = new Sub();
                break;
        }
    }
    
    public double getResult(double a, double b) {
        arithmetic.setNumberA(a);
        arithmetic.setNumberB(b);
        return arithmetic.reNum();
    }
}
