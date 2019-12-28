package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class PrakingLotTest {
    ParkingLotSystem parkingLotSystem;

    @Test
    public void givenGreetingMessage_ShouldReturn_WelcomeMessage(){
        parkingLotSystem =new ParkingLotSystem();
       String message= parkingLotSystem.greetingMessage();
        Assert.assertEquals("Welcome",message);
    }

    @Test
    public void givenVehicle_parking_ShouldReturnTrue(){
        parkingLotSystem =new ParkingLotSystem();
        boolean isParked= parkingLotSystem.parking(new Object());
        Assert.assertEquals(true,isParked);
    }

    @Test
    public void givenVehicle_unparking_ShouldReturnTrue(){
        parkingLotSystem =new ParkingLotSystem();
        boolean isParked= parkingLotSystem.unparking(new Object());
        Assert.assertEquals(true,isParked);
    }

//    Parking Lot Owner
    @Test
    public void givenParkingLot_IsFull_ShouldReturnTrue(){
        ParkingLotOwner parkingLotOwner=new ParkingLotOwner();
        boolean isFull=parkingLotOwner.lotSize(new Object());
        Assert.assertEquals(true,isFull);
    }

    @Test
    public void givenParkingLot_IsNotFull_ShouldReturnTrue(){
        ParkingLotOwner parkingLotOwner=new ParkingLotOwner();
        boolean isFull=parkingLotOwner.emptySize(new Object());
        Assert.assertEquals(true,isFull);
    }



    //Airport Security
    @Test
    public void givenParkingLot_IsFullShouldReturnTrue_airportSecurity(){
        AirportSecurity airportSecurity=new AirportSecurity();
        boolean isFull=airportSecurity.lotSize(new Object());
        Assert.assertEquals(true,isFull);
    }

    @Test
    public void givenParkingLot_isNotFull_ShouldReturnTrue_airportSecurity(){
        AirportSecurity airportSecurity=new AirportSecurity();
        boolean isNotFull=airportSecurity.lotEmpty(new Object());
        Assert.assertEquals(true,isNotFull);
    }



}
