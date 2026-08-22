package org.techdavs.me;

import java.util.Map;

public class ATMMachine {

    public Map<String, Integer> currencyMap = Map.of(
            "TWO_THOUSANDS" , 3,
            "FIVE_HUNDRED", 2
    );

    public ATMState state = new IdleState();
}