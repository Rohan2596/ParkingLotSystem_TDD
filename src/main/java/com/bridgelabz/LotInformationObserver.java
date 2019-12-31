package com.bridgelabz;

public interface LotInformationObserver {

    default String availabilityParkingSlot(boolean condition){
       if(condition==false){
           return "Parking slots is full";
       }
        System.out.println("Parking is not full");
        return "Parking is Not Full";
    }
}
