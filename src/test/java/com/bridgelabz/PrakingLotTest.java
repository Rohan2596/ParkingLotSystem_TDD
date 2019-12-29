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
    public void givenVehicle_parking_ShouldReturnTrue() throws ParkingLotSystemException {
        parkingLotSystem =new ParkingLotSystem();
        boolean isParked= parkingLotSystem.parking(new Object());
        Assert.assertEquals(true,isParked);
    }

    @Test
    public void givenVehicle_unparking_ShouldReturnTrue() throws ParkingLotSystemException {
       try{
        parkingLotSystem =new ParkingLotSystem();
        boolean isParked= parkingLotSystem.unparking(new Object());
        Assert.assertEquals(true,isParked);
    }catch (ParkingLotSystemException e){
       Assert.assertEquals(e.exceptionTypes,ParkingLotSystemException.ExceptionTypes.NOT_FOUND);}
    }

//    Parking Lot Owner
    @Test
    public void givenParkingLot_IsFull_ShouldReturnTrue() throws ParkingLotSystemException {
        ParkingLotOwner parkingLotOwner=new ParkingLotOwner();
        boolean isFull=parkingLotOwner.lotSize(new Object());
        Assert.assertEquals(true,isFull);
    }

    //Airport Security
    @Test
    public void givenParkingLot_IsFullShouldReturnTrue_airportSecurity() throws ParkingLotSystemException {
        AirportSecurity airportSecurity=new AirportSecurity();
        boolean isFull=airportSecurity.lotSize(new Object());
        Assert.assertEquals(true,isFull);
    }


    @Test
    public void givenParKinglot_parkingDecisionsOnWhere() {
        try {
            parkingLotSystem = new ParkingLotSystem();
            parkingLotSystem.parking(new Object());
            parkingLotSystem.parking(new Object());
            parkingLotSystem.parking(new Object());
            parkingLotSystem.parking(new Object());
            parkingLotSystem.parking(new Object());
            parkingLotSystem.parking(new Object());

        } catch (ParkingLotSystemException e) {
            Assert.assertEquals(e.exceptionTypes, ParkingLotSystemException.ExceptionTypes.PARKING_LOT_FULL);
        }
    }

    @Test
    public void givenParkingLot_FindingCar_ForDriver(){
        try {
            parkingLotSystem = new ParkingLotSystem();
            parkingLotSystem.find(new Object());
        } catch (ParkingLotSystemException e) {
            Assert.assertEquals(e.exceptionTypes, ParkingLotSystemException.ExceptionTypes.PARKING_LOT_FULL);

        }
    }




}
