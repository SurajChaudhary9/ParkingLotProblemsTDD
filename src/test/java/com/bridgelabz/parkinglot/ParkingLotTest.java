package com.bridgelabz.parkinglot;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ParkingLotTest {

    public ParkingLotSystem parkingLot = null;
    Object vehicle = null;

    @Before
    public void set() {
        parkingLot = new ParkingLotSystem();
        vehicle = new Object();
    }

    @Test
    public void givenVehicle_WhenParked_ShouldReturnTrue() {
        boolean isParked = parkingLot.isParked(new Object());
        Assert.assertTrue(isParked);
    }
//UC3 : Parking Full Status
    /**
     * @Purpose :To Give Parking Full Status
     */
    @Test
    public void givenVehicle_WhenAlreadyParked_ShouldReturnFalse() {
        try {
            parkingLot.park(vehicle);
            boolean isParked = parkingLot.isParked(vehicle);
            Assert.assertFalse(isParked);
        } catch (ParkingLotException e) {
            Assert.assertEquals(ParkingLotException.ExceptionType.PARKING_FULL, e.type);
        }
    }

    @Test
    public void givenVehicle_WhenUnParked_ShouldReturnTrue() throws ParkingLotException {
        parkingLot.park(vehicle);
        boolean isUnParked = parkingLot.isUnParked(vehicle);
        Assert.assertTrue(isUnParked);
    }

    @Test
    public void givenVehicle_WhenUnParked_ShouldReturnFalse() {
        try {
            parkingLot.park(vehicle);
            parkingLot.unPark(null);
            boolean isUnParked = parkingLot.isUnParked(vehicle);
            Assert.assertFalse(isUnParked);
        } catch (ParkingLotException e) {
            Assert.assertEquals(ParkingLotException.ExceptionType.NO_SUCH_VEHICLE, e.type);
        }
    }
}