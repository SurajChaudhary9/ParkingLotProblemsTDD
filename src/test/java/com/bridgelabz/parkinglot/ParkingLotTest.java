package com.bridgelabz.parkinglot;

import org.junit.Before;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParkingLotTest {
    ParkingLotSystem parkingLotSystem = null;
    Object vehicle = null;

    @Before
    public void setUp() throws Exception {
        vehicle = new Object();
        ParkingLotSystem parkingLotSystem = new ParkingLotSystem();


    }

    /**
     * @Purpose : Test for parking vehicle UC1 .
     */

    @Test
    public void givenVehicleWhenParked_ShouldReturnTrue() {
        parkingLotSystem.park(vehicle);
        boolean isParked = parkingLotSystem.park(new Object());
        Assert.assertTrue(isParked);
    }
    /**
     * @Purpose : Test for Unpark vehicle UC2 .
     */
    @Test
    public void givenVehicleWhenUnparked_ShouldReturnTrue() {
        parkingLotSystem.park(vehicle);
        boolean isUnparked = parkingLotSystem.unPark(new Object());
        Assert.assertTrue(isUnparked);
    }
    /**
     * @Purpose : Test for previously parked vehicle .
     */
    @Test
    public void givenVehicleWhenAlreadyParked_ShouldReturnFalse() {
        boolean isParked = parkingLotSystem.park(new Object());
        Assert.assertFalse(isParked);
    }
}
