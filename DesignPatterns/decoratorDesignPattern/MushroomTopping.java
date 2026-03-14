package DesignPatterns.decoratorDesignPattern;

public class MushroomTopping extends ToppingDecorator {
    public MushroomTopping(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public void getDescription() {
        basePizza.getDescription();
        System.out.print(" with Mushroom ");
    }

    @Override
    public double getCost() {
        return basePizza.getCost() + 60.0;
    }
}