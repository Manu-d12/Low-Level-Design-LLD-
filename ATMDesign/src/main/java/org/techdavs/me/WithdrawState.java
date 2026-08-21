package org.techdavs.me;

import java.util.Scanner;

public class WithdrawState extends ATMState {

    public static Scanner scn = new Scanner(System.in);

    public WithdrawState(Card card) {
        super();
    }

    @Override
    public void withdraw(ATMMachine machine) {
        System.out.println("Enter the amount......");
        int amount = scn.nextInt();
        System.out.println("Done. Please collect cash...");
        machine.state = new IdleState();
    }
}
