package org.techdavs.me;

import java.util.HashMap;
import java.util.Map;

public class FiveHundredRupeeProcessor extends CashWithdrawlProcessor {

    public FiveHundredRupeeProcessor(CashWithdrawlProcessor next) {
        super(next);
    }

    @Override
    public Map<String, Integer> withdraw(int amount, ATMMachine machine) {
        int notesCount = machine.currencyMap.get("FIVE_HUNDRED");
        int currentVal = notesCount * 500;

        Map<String, Integer> res = new HashMap<>();

        if(amount == currentVal) {
            res.put("FIVE_HUNDRED", notesCount);
            return res;
        } else if(amount > currentVal) {
            return null;
        } else if(amount % 500 == 0) {
            res.put("FIVE_HUNDRED", amount / 500);
            return res;
        } else {
            return null;
        }
    }
}
