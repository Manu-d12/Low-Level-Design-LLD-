package DesignPatterns.decoratorDesignPattern;

public class CheeseTopping extends ToppingDecorator {
    public CheeseTopping(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public void getDescription() {
        basePizza.getDescription();
        System.out.print(" with Cheese ");
    }

    @Override
    public double getCost() {
        return basePizza.getCost() + 50.0;
    }

}
