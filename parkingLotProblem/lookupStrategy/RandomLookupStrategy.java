package parkingLotProblem.lookupStrategy;

import java.util.List;

import parkingLotProblem.entity.ParkingSpot;

public class RandomLookupStrategy implements ParkingSpotLookupStrategy{
    @Override
    public ParkingSpot selectSpot(List<ParkingSpot> spots) {
        for(ParkingSpot spot : spots) {
            if(spot.isSpotFree()) return spot;
        }
        return null;
    }
}
