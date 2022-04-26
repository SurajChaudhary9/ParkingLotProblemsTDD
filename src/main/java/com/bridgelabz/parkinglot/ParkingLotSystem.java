package com.bridgelabz.parkinglot;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class ParkingLotSystem implements IParkingLotSystem {
    int parkingLotCapacity = 2;
    private LinkedHashMap<String, Object> parkingMap = new LinkedHashMap<String, Object>();
    private List<ParkingObserver> observers = new ArrayList<>();

    //DEFAULT CONSTRUCTOR
    public ParkingLotSystem() {
    }

    //METHOD FOR ADD OBSERVER
    public void addObserver(ParkingObserver observer) {
        this.observers.add(observer);
    }

    //METHOD FOR PARKING VEHICLE
    /**
     * @Purpose : To Park Vehicle
     * @Param : vehicle obj
     * @Function :To check for parking status
     * @Return :boolean t/f
     */
    public void park(Vehicle vehicle) throws ParkingLotException {
        if (this.parkingMap.size() <= parkingLotCapacity) {
            parkingMap.put(vehicle.getId(), vehicle);
        } else if (parkingMap.size() == parkingLotCapacity)
            throw new ParkingLotException(ParkingLotException.ExceptionType.PARKING_FULL, "Parking Lot is Full");
        if (parkingMap.size() == parkingLotCapacity)
            notifyObservers("Parking Full");
    }

    //METHOD FOR UNPARK VEHICLE
    /**
     * @Purpose : To UnPark Vehicle
     * @Param : Vehicle obj ,exception handling
     * @Function :handling runtime errors
     * @Return :na
     */
    public void unPark(Vehicle vehicle) throws ParkingLotException {
        if (vehicle == null)
            throw new ParkingLotException(ParkingLotException.ExceptionType.NO_SUCH_VEHICLE, "No Such Vehicle");
        if (parkingMap.containsKey(vehicle.getId())) {
            parkingMap.remove(vehicle.getId());
        }
    }

    //METHOD FOR NOTIFY OBSERVERS
    //Overide methods
    @Override
    public void notifyObservers(String message) {
        for (ParkingObserver list : observers) {
            list.update(message);
        }
    }

    //METHOD FOR CHECK VEHICLE PARKED
    /**
     * @Purpose : To check Parked Vehicle
     * @Param : Vehicle obj
     * @Function :map
     * @Return :t/f
     */
    public boolean isParked(Vehicle vehicle) {
        if (parkingMap.containsKey(vehicle.getId()))
            return true;
        return false;
    }

    //METHOD FOR CHECK VEHICLE UNPARKED
    /**
     * @Purpose : To check UnParked Vehicle
     * @Param : Vehicle obj
     * @Function :map
     * @Return :t/f
     */
    public boolean isUnParked(Vehicle vehicle) {
        if (!parkingMap.containsKey(vehicle.getId()))
            return true;
        return false;
    }
}