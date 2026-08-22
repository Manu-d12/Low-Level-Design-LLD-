package org.techdavs.me;

public class Card {
    public String number;
    public int pin = 1234;
    public BankAccount account = new BankAccount();

    public boolean isValid() {
        // validation logic..
        return true;
    }
}
