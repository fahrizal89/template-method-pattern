# template-method-pattern

The Template Method Pattern

Defines the skeleton of an algorithm in a method, deferring some methods to subclasses. Template method lets subclass redefine concept of an algorithm without changing the algorithm's culture.

Yes, Redefine concept of an algorithm without changing the algorithm's culture!

Create abstract class
```
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

    boolean costumerNeedCondiments(){     //<-- Hook
        return true;
    }
}
```

Create implementation class
```
public class CoffeeWithHook extends CaffeineBeverageWithHook {

    @Override
    void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    @Override
    public boolean costumerNeedCondiments(){
        return false; //<-- set false
    }
}
```

Test it!
```
public static void main(String[] args) {
    // write your code here
    CoffeeWithHook coffeeWithHook = new CoffeeWithHook();
    coffeeWithHook.prepareReceipe();
}
```

# Result
```
Boiling Water
Dripping coffee through filter
Pouring into cup
```

If we set true 
```
@Override
public boolean costumerNeedCondiments(){
    return true;
}
```

or no need to override!
```
Boiling Water
Dripping coffee through filter
Pouring into cup
Adding sugar and milk
``
