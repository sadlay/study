package com.decorator;

public class Sneakers extends Finery {
    @Override
    public void show() {
        System.out.println("破球鞋  ");
        super.show();
    }
}
