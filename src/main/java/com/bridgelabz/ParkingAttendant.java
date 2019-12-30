package com.bridgelabz;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Map;

public class ParkingAttendant {
    private static int lots=2;

    public void allocation(Object vehicle) throws ParkingLotSystemException {
        Slots slots=Slots.getSlots();
        if(lots !=2){
        slots.getMap().put("1",vehicle);
        parking(vehicle);
        lots=2;
            System.out.println("Parking att:-"+ slots.getCount());
        }
        else{
            slots.getMap().put("2",vehicle);
        parking(vehicle);
            System.out.println("Parking att:-"+ slots.getCount());

            lots=1;}

   }

    public boolean parking(Object vehicle) throws ParkingLotSystemException {

        Slots slots=Slots.getSlots();

        if(slots.getCount()!=10) {

            slots.getMap().put("1", vehicle);
            slots.setCount();
            System.out.println(slots.getCount());
            return true;
        }
        System.out.println(slots.getCount());

        throw  new ParkingLotSystemException(ParkingLotSystemException.ExceptionTypes.PARKING_LOT_FULL);
    }

    public boolean unparking(Vehicle vehicle) throws ParkingLotSystemException {
        Slots slots=Slots.getSlots();
        System.out.println(Slots.getSlots().toString());
        while (slots.getMap().containsKey("1")) {
            System.out.println(slots.getMap().containsValue(vehicle));
            charging(true,vehicle.getDateTime());
            slots.getMap().remove(vehicle);

            return true;
        }
        throw  new ParkingLotSystemException(ParkingLotSystemException.ExceptionTypes.NOT_FOUND);
    }

    private int charging(boolean conditions, LocalDateTime time) {
        int value=0;
        if(conditions==true){
            int time1=LocalDateTime.now().getSecond();
            int time2=time.getSecond()+10;
            System.out.println(time1+" "+time2);
            value=2*(Math.abs(time1-time2));
            System.out.println(value);
            return value;
        }

        return -1;
    }

    public void display(Map<String, Object> map){
        for(int i=0;i<5;i++){
            System.out.println(map.get(i).toString());
        }
    }

    public boolean find(Object vehicle) throws ParkingLotSystemException {
        Slots slots=Slots.getSlots();

        for(int i=0;i<5;i++){
            slots.getMap().remove("1",vehicle);
            System.out.println(slots.getMap().get(i));

            if(slots.getMap().get(i).equals(vehicle))return true;
        }
        throw  new ParkingLotSystemException(ParkingLotSystemException.ExceptionTypes.NOT_FOUND);
    }
}
