package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class PrakingLotTest {
    ParkingLot parkingLot;

    @Test
    public void givenGreetingMessage_ShouldReturn_WelcomeMessage(){
        parkingLot=new ParkingLot();
       String message=parkingLot.greetingMessage();
        Assert.assertEquals("Welcome",message);
    }

    @Test
    public void givenVehicle_parking_ShouldReturnTrue(){
        parkingLot=new ParkingLot();
        boolean isParked=parkingLot.parking(new Object());
        Assert.assertEquals(true,isParked);
    }

    @Test
    public void givenVehicle_unparking_ShouldReturnTrue(){
        parkingLot=new ParkingLot();
        boolean isParked=parkingLot.unparking(new Object());
        Assert.assertEquals(true,isParked);
    }
}
