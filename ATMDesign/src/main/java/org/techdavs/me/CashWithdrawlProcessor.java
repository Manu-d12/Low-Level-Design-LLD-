package org.techdavs.me;

import java.util.Map;

public abstract class CashWithdrawlProcessor {

    public CashWithdrawlProcessor next;

    public CashWithdrawlProcessor(CashWithdrawlProcessor next) {
        this.next = next;
    }

    public abstract Map<String, Integer> withdraw(int amount, ATMMachine machine);
}
