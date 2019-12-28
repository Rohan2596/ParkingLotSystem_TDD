package com.bridgelabz;

public class AirportSecurity {
    public boolean lotSize(Object vehicle) {
        ParkingLotSystem parkingLotSystem=new ParkingLotSystem();
        boolean conditions=parkingLotSystem.parking(vehicle);
        if(conditions==true){return true;}
        return false;
    }

    public boolean lotEmpty(Object vehicle) {
        ParkingLotSystem parkingLotSystem=new ParkingLotSystem();
        boolean conditions=parkingLotSystem.unparking(vehicle);
        if(conditions==true){return true;}
        return false;

    }
}
