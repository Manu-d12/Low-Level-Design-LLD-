package org.techdavs.me;

public abstract class ATMState {

    public Card card;

    public void insertCard(Card card, ATMMachine machine) {}
    public void authenticate(int pin, ATMMachine machine) {}
    public void chooseOperation(String op, ATMMachine machine) {}
    public void withdraw(ATMMachine machine) {}
    public void displayBalance(ATMMachine machine) {}
}
