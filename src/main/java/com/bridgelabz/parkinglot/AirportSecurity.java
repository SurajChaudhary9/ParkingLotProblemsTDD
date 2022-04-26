package com.bridgelabz.parkinglot;

public class AirportSecurity implements ParkingObserver {
    private String status;

    @Override
    public void update(String message) {
        this.status = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}