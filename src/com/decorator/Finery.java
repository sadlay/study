package com.decorator;

public class Finery extends Person {
    protected Person component;
    
    //打扮
    public void decorator(Person component) {
        this.component = component;
    }
    
    @Override
    public void show() {
        if (component != null) {
            component.show();
        }
    }
}