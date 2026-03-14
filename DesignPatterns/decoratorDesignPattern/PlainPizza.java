package DesignPatterns.decoratorDesignPattern;

public class PlainPizza implements BasePizza {
    @Override
    public void getDescription() {
        System.out.print("Plain Pizza ");
    }

    @Override
    public double getCost() {
        return 200.0;
    }
}
