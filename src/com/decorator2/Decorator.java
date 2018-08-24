package com.decorator2;

public class Decorator implements DecoratorDao {
    private DecoratorDao decoratorDao;
    
    public Decorator(DecoratorDao decoratorDao) {
        super();
        this.decoratorDao = decoratorDao;
    }
    
    @Override
    public int getNumber() {
        System.out.println("before");
        System.out.println(decoratorDao.getNumber());
        System.out.println("after");
        return 0;
    }
    
}
