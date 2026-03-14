package DesignPatterns.decoratorDesignPattern;

public abstract class ToppingDecorator implements BasePizza {
    BasePizza basePizza;

    public ToppingDecorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
}
