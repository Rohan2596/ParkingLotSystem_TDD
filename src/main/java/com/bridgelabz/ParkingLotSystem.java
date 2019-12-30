package com.bridgelabz;

public class ParkingLotSystem {
    public String greetingMessage() {
        return "Welcome";
    }

    public Boolean parking(Object vehicle) throws ParkingLotSystemException {
        ParkingLotOwner parkingLotOwner=new ParkingLotOwner();
        try {
            parkingLotOwner.parking(vehicle);
            return true;
        } catch (ParkingLotSystemException e) {
            throw  new ParkingLotSystemException(ParkingLotSystemException.ExceptionTypes.PARKING_LOT_FULL);
        }
    }

    public Boolean unparking(Vehicle vehicle) throws ParkingLotSystemException {
        ParkingLotOwner parkingLotOwner=new ParkingLotOwner();
        try {
            parkingLotOwner.unparking(vehicle);
            return true;
        } catch (ParkingLotSystemException e) {
            throw  new ParkingLotSystemException(ParkingLotSystemException.ExceptionTypes.NOT_FOUND);
        }

    }


    public boolean find(Object vehicle) throws ParkingLotSystemException {
        ParkingLotOwner parkingLotOwner=new ParkingLotOwner();

        try {
            parkingLotOwner.find(vehicle);
            return true;
        } catch (ParkingLotSystemException e) {
            throw  new ParkingLotSystemException(ParkingLotSystemException.ExceptionTypes.NOT_FOUND);
        }

    }


}
