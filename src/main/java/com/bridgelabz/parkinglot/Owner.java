package com.bridgelabz.parkinglot;

public class Owner implements ParkingObserver {
    private String status;

    @Override
    public void update(String message) {
        this.status = message;
    }

    public String getStatus() {
        return status;
    }
}