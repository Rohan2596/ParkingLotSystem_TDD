package com.bridgelabz;

import java.util.Arrays;
import java.util.Map;

public class ParkingAttendant {

    public boolean parking(Object vehicle) throws ParkingLotSystemException {
        Slots slots=Slots.getSlots();
        if(slots.getCount()!=2) {
            slots.getMap().put("1", vehicle);
            slots.setCount();
            System.out.println(slots.getCount());
            return true;
        }
        System.out.println(slots.getCount());

        throw  new ParkingLotSystemException(ParkingLotSystemException.ExceptionTypes.PARKING_LOT_FULL);
    }

    public boolean unparking(Object vehicle) throws ParkingLotSystemException {
        Slots slots=Slots.getSlots();
        while (slots.getMap().equals(vehicle)) {
            slots.getMap().remove(vehicle);
            return true;
        }
        throw  new ParkingLotSystemException(ParkingLotSystemException.ExceptionTypes.NOT_FOUND);
    }

    public void display(Map<String, Object> map){
        for(int i=0;i<5;i++){
            System.out.println(map.get(i));
        }
    }

    public boolean find(Object vehicle) throws ParkingLotSystemException {
        Slots slots=Slots.getSlots();

        for(int i=0;i<5;i++){
            slots.getMap().remove("1",vehicle);

            if(slots.getMap().get(i).equals(vehicle))return true;
        }
        throw  new ParkingLotSystemException(ParkingLotSystemException.ExceptionTypes.NOT_FOUND);
    }
}
