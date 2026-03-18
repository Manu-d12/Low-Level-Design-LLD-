package parkingLotProblem.parkingLot;

import java.util.Map;
import parkingLotProblem.entity.*;
import parkingLotProblem.enums.*;
import parkingLotProblem.spotManagers.ParkingSpotManager;

public class ParkingLevel {
    private final int levelNumber;
    private Map<VechicleType, ParkingSpotManager> managers;

    public ParkingLevel (int levelNumber, Map<VechicleType, ParkingSpotManager> managers) {
        this.levelNumber = levelNumber;
        this.managers = managers;
    }

    public boolean hasAvailbility(VechicleType type) {
        ParkingSpotManager manager = managers.get(type);
        return manager != null && manager.hasFreeSpot();
    }


    public ParkingSpot park(VechicleType type) {
        ParkingSpotManager manager = managers.get(type);
        if(manager == null) {
            throw new IllegalArgumentException("No parking manager for vechicle type " + type);
        }
        return manager.park();
    }

    public void unPark(VechicleType type, ParkingSpot spot) {
        ParkingSpotManager manager = managers.get(type);
        if (manager != null) {
            manager.unPark(spot);
        }
    }

    public int getLevelNumber() {
        return levelNumber;
    }
}
