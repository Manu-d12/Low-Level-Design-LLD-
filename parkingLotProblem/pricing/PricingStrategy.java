package parkingLotProblem.pricing;
import parkingLotProblem.entity.Ticket;

public interface PricingStrategy {
    double calculate(Ticket ticket);
}

