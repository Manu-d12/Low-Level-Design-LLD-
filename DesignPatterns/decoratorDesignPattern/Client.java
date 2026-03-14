package DesignPatterns.decoratorDesignPattern;

public class Client {
   public static void main(String[] args) {
       BasePizza pizza = new PlainPizza();
       System.out.println(pizza.getCost());
       pizza.getDescription();
       System.out.println();


       BasePizza pizzaWithExtraCheese = new CheeseTopping(pizza);
       System.out.println(pizzaWithExtraCheese.getCost());
       pizzaWithExtraCheese.getDescription();


       BasePizza pizzaWithExtraCheeseAndExtraMushroom = new MushroomTopping(new CheeseTopping(new PlainPizza()));
       pizzaWithExtraCheeseAndExtraMushroom.getDescription();
       System.out.println();
       System.out.println(pizzaWithExtraCheeseAndExtraMushroom.getCost());
   } 
}
