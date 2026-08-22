package org.techdavs.me;

import java.util.Map;
import java.util.Scanner;

public class WithdrawState extends ATMState {

    public static Scanner scn = new Scanner(System.in);

    public CashWithdrawlProcessor processor = new TwoThousandRupeeProcessor(new FiveHundredRupeeProcessor(null));

    public WithdrawState(Card card) {
        super(card);
    }

    @Override
    public void withdraw(ATMMachine machine) {
        System.out.println("Enter the amount......");
        int amount = scn.nextInt();
        int balance = super.card.account.getBalance();
        int atmBalance = machine.currencyMap.get("TWO_THOUSANDS") * 2000 + machine.currencyMap.get("FIVE_HUNDRED") * 500;

        if(amount > balance) {
            System.out.println("Insufficient Balance...");
        } else if(amount > atmBalance) {
            System.out.println("Insufficient Amount..");
        } else {
            Map<String, Integer> withdraw = processor.withdraw(amount, machine);
            if(withdraw != null) {
                System.out.println("Collect Cash...");
                System.out.println("2K Notes Count.." + withdraw.get("TWO_THOUSANDS"));
                System.out.println("500 Notes Count.." + withdraw.get("FIVE_HUNDRED"));

                super.card.account.setBalance(balance - amount);
            } else {
                System.out.println("Enter the multiple of 2000, 500");
            }
        }
        machine.state = new IdleState();
    }
}
