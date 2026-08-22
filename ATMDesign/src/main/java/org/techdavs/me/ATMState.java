package org.techdavs.me;

public abstract class ATMState {

    public Card card;

    public ATMState(Card card) {
        this.card = card;
    }

    public void insertCard(Card card, ATMMachine machine) {}
    public void authenticate(int pin, ATMMachine machine) {}
    public void chooseOperation(ATMMachine machine) {}
    public void withdraw(ATMMachine machine) {}
    public void displayBalance(ATMMachine machine) {}
}
