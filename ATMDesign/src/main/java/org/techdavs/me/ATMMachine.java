package org.techdavs.me;

import java.util.Map;

public class ATMMachine {

    public Map<String, Integer> currentMap = Map.of(
           "TEN", 100,
           "HUNDRED", 500
    );

    public ATMState state = new IdleState();
}