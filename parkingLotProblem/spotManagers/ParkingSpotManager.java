package parkingLotProblem.spotManagers;

import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

import parkingLotProblem.entity.ParkingSpot;
import parkingLotProblem.lookupStrategy.ParkingSpotLookupStrategy;

public abstract class ParkingSpotManager {
    private List<ParkingSpot> spots;
    private ParkingSpotLookupStrategy strategy;
    private final ReentrantLock lock = new ReentrantLock(true);

    public ParkingSpotManager(List<ParkingSpot> spots, ParkingSpotLookupStrategy strategy) {
        this.spots = spots;
        this.strategy = strategy;
    }

    public ParkingSpot park() {
        try {
            lock.lock();
            ParkingSpot selectedSpot = strategy.selectSpot(spots);
            if(selectedSpot == null) return null;
            selectedSpot.occupySpot();
            return selectedSpot;
        } finally {
            lock.unlock();
        }
    }

    public void unPark(ParkingSpot spot) {
        try {
            lock.lock();
            spot.releaseSpot();
        } finally {
            lock.unlock();
        }
    }

    public boolean hasFreeSpot() {
        try {
            lock.lock();
            return spots.stream().anyMatch(ParkingSpot::isSpotFree);
        } finally {
            lock.unlock();
        }
    }
}
