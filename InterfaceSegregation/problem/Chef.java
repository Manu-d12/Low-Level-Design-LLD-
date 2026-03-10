package InterfaceSegregation.problem;

public class Chef implements RestaurantEmployee {

    @Override
    public void prepareFood() {
       System.out.println("Cooking food...");
    }

    @Override
    public void decideMenu() {
        System.out.println("Deciding menu...");
    }

    @Override
    public void serveFoodAndDrinks() {
        throw new AssertionError("Cannot serve food & drinks...");
    }

    @Override
    public void takeOrder() {
       throw new AssertionError("cannot take order...");
    }

    @Override
    public void cleanTheKitchen() {
        throw new AssertionError("cannot clean the kitchen");
    }
    
}
