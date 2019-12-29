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


}
