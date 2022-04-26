package com.bridgelabz.parkinglot;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ParkingLotTest {
    /**
     * @Purpose : Test for parking vehicle UC1 .
     */
    @Test
    public void givenVehicleWhenParked_ShouldReturnTrue() {
        ParkingLotSystem parkingLotSystem = new ParkingLotSystem();
      boolean isParked =  parkingLotSystem.park(new Object());
      Assert.assertTrue(isParked);
    }
}
