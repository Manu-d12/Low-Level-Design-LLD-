package parkingLotProblem.parkingLot;

import parkingLotProblem.entity.Vechicle;
import parkingLotProblem.entity.Ticket;

public class EntranceGate {
    Ticket enter(ParkingBuilding building, Vechicle vechicle) {
        return building.allocate(vechicle);
    }
}
