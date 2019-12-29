package com.bridgelabz;

public interface SignInformation {

    default boolean lotSize(Object vehicle) throws ParkingLotSystemException {
        try{
        ParkingLotSystem parkingLotSystem=new ParkingLotSystem();
        parkingLotSystem.parking(vehicle);
        return true;
    }catch (ParkingLotSystemException e){
        throw new ParkingLotSystemException(ParkingLotSystemException.ExceptionTypes.PARKING_LOT_FULL);
    }

}
}
