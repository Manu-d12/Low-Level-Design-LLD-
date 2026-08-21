package org.techdavs.me;

public class IdleState extends ATMState {

    public IdleState() {
        System.out.println("ATM Machine is Idle..");
    }

    @Override
    public void insertCard(Card card, ATMMachine machine) {
        this.card = card;
        machine.state = new AuthState(card);
    }
}
