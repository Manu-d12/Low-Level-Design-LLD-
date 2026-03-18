package parkingLotProblem.parkingLot;

import java.util.List;
import parkingLotProblem.entity.*;

public class ParkingBuilding {
    private List<ParkingLevel> parkingLevels;

    public ParkingBuilding (List<ParkingLevel> parkingLevels) {
        this.parkingLevels = parkingLevels;
    }

    public Ticket allocate(Vechicle vechicle) {
        for(ParkingLevel level : parkingLevels) {
            if(level.hasAvailbility(vechicle.getVechicleType())) {
                ParkingSpot spot = level.park(vechicle.getVechicleType());
                Ticket ticket = new Ticket(vechicle, level, spot);
                return ticket;
            }
        }
        return null;
    }

    public void release(Ticket ticket) {
       ticket.getLevel().unPark(ticket.getVehicle().getVechicleType(), ticket.getSpot());
    }
}
