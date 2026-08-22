package org.techdavs.me;

import java.util.Map;

public class TwoThousandRupeeProcessor extends CashWithdrawlProcessor {

    public TwoThousandRupeeProcessor(CashWithdrawlProcessor next) {
        super(next);
    }

    @Override
    public Map<String, Integer> withdraw(int amount, ATMMachine machine) {
        int notesCount = machine.currencyMap.get("TWO_THOUSANDS");
        int currentVal = notesCount * 2000;

        if(amount == currentVal) {
            return Map.of("TWO_THOUSANDS", notesCount);
        } else if(amount > currentVal) {
            Map<String, Integer> mp = super.next.withdraw(amount - currentVal, machine);
            if(mp != null) {
                mp.put("TWO_THOUSANDS", notesCount);
                return mp;
            }
            return null;
        } else {
            int toGiveCount = amount / 2000;
            int coverAmount = toGiveCount * 2000;
            int remainingAmount = amount - coverAmount;

            if(remainingAmount == 0) {
                return Map.of("TWO_THOUSANDS", toGiveCount);
            }

            Map<String, Integer> mp = this.next.withdraw(remainingAmount, machine);
            if(mp != null) {
                mp.put("TWO_THOUSANDS", toGiveCount);
                return mp;
            }
            return null;
        }
    }

}
