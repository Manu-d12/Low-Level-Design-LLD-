package DesignPatterns.decoratorDesignPattern;

public class VeggiePizza implements BasePizza {

    @Override
    public void getDescription() {
       System.out.print("Veggie Pizza");
    }

    @Override
    public double getCost() {
        return 250.0;
    }
    
}
    