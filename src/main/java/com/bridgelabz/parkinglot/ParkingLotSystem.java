package com.bridgelabz.parkinglot;

public class ParkingLotSystem {
    private Object vehicle;

    public ParkingLotSystem() {

    }

    /**
     * @Purpose : To park vehicle
     * @Param : obj vehicle
     * @Function :To check for parking lot empty
     * @Return :boolean t/f
     */
    public boolean park(Object vehicle) {
        if (this.vehicle != null)
            return false;
        this.vehicle = vehicle;
        return true;
    }
    /**
     * @Purpose : To un park vehicle
     * @Param : obj vehicle
     * @Function :To unpark vehicle and check status 
     * @Return :boolean t/f
     */
    public boolean unPark(Object vehicle) {
        if (vehicle == null) return false;
        if (this.vehicle.equals(vehicle)) {
            this.vehicle = null;
            return true;
        }
        return false;
    }
}
