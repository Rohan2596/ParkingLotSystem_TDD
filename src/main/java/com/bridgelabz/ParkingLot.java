package com.bridgelabz;

public class ParkingLot {
    public String greetingMessage() {
        return "Welcome";
    }

    private Object vehicle;
    public Boolean parking(Object vehicle) {
        this.vehicle=vehicle;
        return true;
    }

    public Boolean unparking(Object vehicle){
        this.vehicle=null;
        return true;
    }
}
