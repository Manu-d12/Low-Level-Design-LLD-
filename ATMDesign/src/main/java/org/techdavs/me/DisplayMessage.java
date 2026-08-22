package org.techdavs.me;

public class DisplayMessage extends ATMState {
    public DisplayMessage(Card card) {
        super(card);
    }

    public void displayBalance(ATMMachine machine) {
        System.out.println("Making the API call for getting account balance details.....");
        System.out.println("Balance is "+ this.card.account.getBalance());
        machine.state = new IdleState();
    }
}
