package org.techdavs.me;

public class IdleState extends ATMState {

    public IdleState() {
        super(null);
        System.out.println("ATM Machine is Idle..");
    }

    @Override
    public void insertCard(Card card, ATMMachine machine) {
        super.card = card;
        machine.state = new AuthState(card);
    }
}
