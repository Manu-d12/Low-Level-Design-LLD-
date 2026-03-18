package parkingLotProblem.lookupStrategy;

import java.util.List;
import parkingLotProblem.entity.ParkingSpot;

public interface ParkingSpotLookupStrategy {
    ParkingSpot selectSpot(List<ParkingSpot> spots);    
}