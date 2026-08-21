package org.techdavs.me;

public class DisplayMessage extends ATMState {
    public DisplayMessage(Card card) {
        super();
    }

    public void displayBalance(ATMMachine machine) {
        System.out.println("Making the API call for getting account balance details.....");
        System.out.println("Balance is "+ this.card.pin * 10);
        machine.state = new IdleState();
    }
}
