package org.techdavs.me;

public class AuthState extends ATMState {

    public AuthState(Card card) {
        super(card);
    }

    @Override
    public void authenticate(int pin, ATMMachine machine) {
        if(this.card.isValid() && this.card.pin == pin) {
            System.out.println("Pin Verified...");
            machine.state = new OptionState(card);
        }
    }
}
