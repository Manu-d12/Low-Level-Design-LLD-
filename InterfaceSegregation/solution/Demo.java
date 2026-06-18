package InterfaceSegregation.solution;

public class Demo {
    public static void main(String[] args) {

        Chef chef = new Chef();
        chef.decideMenu();
        chef.prepareFood();

        Waiter waiter = new Waiter();
        waiter.takeOrder();
        waiter.serveFoodAndDrinks();

        
    }
}
