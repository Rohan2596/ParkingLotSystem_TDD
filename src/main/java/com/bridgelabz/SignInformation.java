package com.bridgelabz;

public interface SignInformation {

    default boolean lotSize(Object vehicle) {
        ParkingLotSystem parkingLotSystem=new ParkingLotSystem();
        boolean conditions=parkingLotSystem.parking(vehicle);
        if(conditions==true){return true;}
        return false;
    }

}
