package com.decorator2;

public class demoMain {
    
    public static void main(String[] args) {
        DecoratorDao decoratorDao = new DecoratorDaoImpl();
        DecoratorDao decorator = new Decorator(decoratorDao);
        DecoratorDao decorator2 = new Decorator(decorator);
        decorator2.getNumber();
        
    }
}
