package com.bridgelabz;

public class ParkingLotOwner  implements SignInformation{

public boolean parking(Object vehicle) throws ParkingLotSystemException {
    try {
        ParkingAttendant parkingAttendant = new ParkingAttendant();
        parkingAttendant.parking(vehicle);
        return true;
    }catch (ParkingLotSystemException ex){
        throw  new ParkingLotSystemException( ParkingLotSystemException.ExceptionTypes.PARKING_LOT_FULL);
    }
}


    public boolean unparking(Vehicle vehicle) throws ParkingLotSystemException {
        try {
            ParkingAttendant parkingAttendant = new ParkingAttendant();
            parkingAttendant.unparking(vehicle);
            return true;
        }catch (ParkingLotSystemException ex){
            throw  new ParkingLotSystemException( ParkingLotSystemException.ExceptionTypes.NOT_FOUND);
        }
}

    public boolean find(Object vehicle) throws ParkingLotSystemException {
        try {
            ParkingAttendant parkingAttendant = new ParkingAttendant();
            parkingAttendant.find(vehicle);
            return true;
        } catch (ParkingLotSystemException e) {
            throw  new ParkingLotSystemException(ParkingLotSystemException.ExceptionTypes.NOT_FOUND);
        }
    }
}
