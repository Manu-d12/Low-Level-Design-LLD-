package parkingLotProblem.pricing;

import parkingLotProblem.entity.Ticket;


public class FixedPricingStrategy implements PricingStrategy {

    @Override
    public double calculate(Ticket ticket) {
        return 100;
    }
}

