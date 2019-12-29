package com.bridgelabz;

public class ParkingLotSystem {
    public String greetingMessage() {
        return "Welcome";
    }
    ParkingAttendant parkingAttendant;
    private Object vehicle;

    public Boolean parking(Object vehicle) throws ParkingLotSystemException {
//        this.vehicle=vehicle;

        ParkingLotOwner parkingLotOwner=new ParkingLotOwner();
        try {
            parkingLotOwner.parking(vehicle);
        } catch (ParkingLotSystemException e) {
            throw  new ParkingLotSystemException(ParkingLotSystemException.ExceptionTypes.PARKING_LOT_FULL);
        }
        return true;
    }

    public Boolean unparking(Object vehicle){
        this.vehicle=null;
        parkingAttendant=new ParkingAttendant();
        parkingAttendant.unparking(vehicle);
        return true;
    }


    public boolean find(Object vehicle) throws ParkingLotSystemException {
        parkingAttendant=new ParkingAttendant();
        try {
            parkingAttendant.find(vehicle);
        } catch (ParkingLotSystemException e) {
            throw  new ParkingLotSystemException(ParkingLotSystemException.ExceptionTypes.PARKING_LOT_FULL);
        }
        return true;
    }
}
