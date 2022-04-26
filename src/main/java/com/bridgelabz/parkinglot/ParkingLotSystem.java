package com.bridgelabz.parkinglot;

public class ParkingLotSystem {
    //VARIABLE
    private Object vehicle;

    //DEFAULT CONSTRUCTOR
    public void ParkingLot() {
    }

    //METHOD FOR PARKING VEHICLE
    /**
     * @Purpose : To Park Vehicle
     * @Param : vehicle obj
     * @Function :To check for parking status
     * @Return :boolean t/f
     */
    public void park(Object vehicle) throws ParkingLotException {
        if (this.vehicle != null)
            throw new ParkingLotException(ParkingLotException.ExceptionType.PARKING_FULL, "Parking Lot is Full");
        this.vehicle = vehicle;
    }

    //METHOD FOR UNPARK VEHICLE
    /**
     * @Purpose : To UnPark Vehicle
     * @Param : Vehicle obj ,exception handling
     * @Function :handling runtime errors
     * @Return :t/f
     */
    public void unPark(Object vehicle) throws ParkingLotException {
        if (vehicle == null)
            throw new ParkingLotException(ParkingLotException.ExceptionType.NO_SUCH_VEHICLE, "No Such Vehicle");
        if (this.vehicle != null)
            this.vehicle = null;
    }

    //METHOD FOR CHECK VEHICLE PARKED
    /**
     * @Purpose :To check for park status
     * @Param : vehicle obj
     * @Function :check for parking
     * @Return :t/f
     */
    public boolean isParked(Object vehicle) {
        if (this.vehicle != null)
            return false;
        return true;
    }

    //METHOD FOR CHECK VEHICLE UNPARKED
    /**
     * @Purpose : To unpark
     * @Param : veh obj
     * @Function :Unpark
     * @Return :t/f
     */
    public boolean isUnParked(Object vehicle) {
        if (this.vehicle.equals(vehicle))
            return true;
        return false;
    }
}
