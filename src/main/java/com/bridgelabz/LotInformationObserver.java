package com.bridgelabz;

public interface LotInformationObserver {

    default String availabilityParkingSlot(boolean condition){
       if(condition==false){
           return "Parking slots is full";
       }
        return "Parking is Not Full";
    }
}
