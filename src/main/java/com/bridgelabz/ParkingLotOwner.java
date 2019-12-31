package com.bridgelabz;

import java.time.LocalDateTime;
import java.util.Map;

public class ParkingLotOwner  implements LotInformationObserver {
    private static int lots=3;
    public boolean isFull=true;
    public void allocation(Object vehicle) throws ParkingLotSystemException {
        Slots slots=Slots.getSlots();
        display(slots.getMap());
        if(lots !=2){
            slots.getMap().put(1,vehicle);
            parking(vehicle);
            lots=2;
            System.out.println("Parking att:-"+ slots.getCount());
        }
        else{
            slots.getMap().put(2,vehicle);
            parking(vehicle);
            System.out.println("Parking att:-"+ slots.getCount());

            lots=1;}

    }

    public  boolean parking(Object vehicle) throws ParkingLotSystemException {
        Slots slots=Slots.getSlots();

        if (isFull==true &&slots.getCount()!=2) {
            slots.getMap().put(slots.getCount(), vehicle);
            slots.setCount();
            System.out.println(slots.getCount());
            return true;
        }
        availabilityParkingSlot(false);

        throw  new ParkingLotSystemException(ParkingLotSystemException.ExceptionTypes.PARKING_LOT_FULL);
    }


    public boolean unparking(int vehicle) throws ParkingLotSystemException {
        Slots slots=Slots.getSlots();
        System.out.println(Slots.getSlots().toString());
        while (slots.getMap().containsKey(vehicle)) {
            System.out.println(slots.getMap().containsKey(vehicle));
//            charging(true,vehicle.getDateTime());
            slots.getMap().remove(vehicle);
            availabilityParkingSlot(true);
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

    public void display(Map<Integer, Object> map){
        for(int i=0;i<map.size();i++){
            System.out.println(map.get(i));
        }
    }

    public boolean find(Integer key) throws ParkingLotSystemException {
        Slots slots=Slots.getSlots();

        for(int i=0;i<=slots.getCount();i++){
            System.out.println(slots.getMap().get(i));
            if(slots.getMap().containsKey(key))return true;
        }
        throw  new ParkingLotSystemException(ParkingLotSystemException.ExceptionTypes.NOT_FOUND);
    }

    public boolean find() throws ParkingLotSystemException {

        Slots slots=Slots.getSlots();

        for(int i=0;i<=slots.getMap().size();i++){
            System.out.println(slots.getMap().get(i));

            if(slots.getMap().containsValue(null))return true;
        }
        throw  new ParkingLotSystemException(ParkingLotSystemException.ExceptionTypes.NOT_FOUND);

    }
}
