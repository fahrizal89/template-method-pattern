package com.fahrizal.beverage.hook;

public class CoffeeWithHook extends CaffeineBeverageWithHook {

    @Override
    void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

//    @Override
//    public boolean costumerNeedCondiments(){
//        return false;
//    }
}
