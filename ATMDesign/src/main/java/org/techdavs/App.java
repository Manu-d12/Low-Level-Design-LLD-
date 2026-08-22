package org.techdavs;

import org.techdavs.me.ATMMachine;
import org.techdavs.me.ATMState;
import org.techdavs.me.Card;
import org.techdavs.me.IdleState;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "---------------------" );

        Card card = new Card();


        ATMMachine atm = new ATMMachine();

        ATMState idleState = atm.state;
        idleState.insertCard(card, atm);

        ATMState authState = atm.state;
        authState.authenticate(1234, atm);

        ATMState opState = atm.state;
        opState.chooseOperation(atm);

        ATMState withDState = atm.state;
        withDState.withdraw(atm);

    }
}
