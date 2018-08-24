package com.proxy;

public class testMain {
    
    public static void main(String[] args) {
        SchoolGirl mm = new SchoolGirl();
        mm.setName("lyn");
        Proxy proxy = new Proxy(mm);
        proxy.giveDolls();
        proxy.giveFlowers();
        proxy.giveChocolate();
    }
    
}
