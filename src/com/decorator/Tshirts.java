package com.decorator;

public class Tshirts extends Finery {
    @Override
    public void show() {
        System.out.println("大体恤  ");
        super.show();
    }
}
