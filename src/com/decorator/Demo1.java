package com.decorator;

public class Demo1 {
    
    public static void main(String[] args) {
        Person person = new Person("小名");
        Sneakers pqx = new Sneakers();
        BigTrouser kk = new BigTrouser();
        Tshirts tx = new Tshirts();
        
        pqx.decorator(person);
        kk.decorator(pqx);
        tx.decorator(kk);
        
        tx.show();
        
    }
    
}
