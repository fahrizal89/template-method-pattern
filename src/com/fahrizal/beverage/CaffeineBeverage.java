package com.fahrizal.beverage;

public abstract class CaffeineBeverage {
    final void prepareReceipe(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater(){
        System.out.println("Boiling Water");
    }

    void pourInCup(){
        System.out.println("Pouring into cup");
    }


}
