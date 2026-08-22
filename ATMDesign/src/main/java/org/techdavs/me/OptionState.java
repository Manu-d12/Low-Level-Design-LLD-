package org.techdavs.me;

import java.util.Scanner;

public class OptionState extends ATMState {

    public static Scanner scanner = new Scanner(System.in);

    public OptionState(Card card) {
       super(card);
    }

    @Override
    public void chooseOperation(ATMMachine machine) {
        System.out.println("1. Withdraw...");
        System.out.println("2. Check Balance");

        int input = scanner.nextInt();

        if (input == 1) {
            machine.state = new WithdrawState(card);
        } else if(input == 2) {
            machine.state = new DisplayMessage(card);
        }else {
            System.out.println("Invalid Options");
            machine.state = new IdleState();
        }
    }

}
