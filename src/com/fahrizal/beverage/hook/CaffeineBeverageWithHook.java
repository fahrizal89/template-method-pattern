package com.fahrizal.beverage.hook;

public abstract class CaffeineBeverageWithHook {
    public void prepareReceipe(){
        boilWater();
        brew();
        pourInCup();
        if(costumerNeedCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater(){
        System.out.println("Boiling Water");
    }

    void pourInCup(){
        System.out.println("Pouring into cup");
    }

    boolean costumerNeedCondiments(){
        return true;
    }
}
