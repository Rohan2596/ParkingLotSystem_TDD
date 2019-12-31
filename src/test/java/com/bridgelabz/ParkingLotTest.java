package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;

public class ParkingLotTest {
    ParkingLotSystem parkingLotSystem;

    @Test
    public void givenGreetingMessage_ShouldReturn_WelcomeMessage(){
        parkingLotSystem =new ParkingLotSystem();
       String message= parkingLotSystem.greetingMessage();
        Assert.assertEquals("Welcome",message);
    }

    @Test
    public void givenVehicle_IfParked_ShouldReturnTrue() throws ParkingLotSystemException {
        try {
            parkingLotSystem = new ParkingLotSystem();
            boolean isParked = parkingLotSystem.parking(new Object());
            Assert.assertEquals(true, isParked);
        }catch (ParkingLotSystemException e){
            Assert.assertEquals(e.exceptionTypes, ParkingLotSystemException.ExceptionTypes.PARKING_LOT_FULL);
        }
    }
    @Test
    public void givenVehicle_IfParkedFailed_ShouldReturnTrue() throws ParkingLotSystemException {
        try{
        parkingLotSystem =new ParkingLotSystem();
        boolean isParked= parkingLotSystem.parking(new Object());
        parkingLotSystem.parking(new Object());
        parkingLotSystem.parking(new Object());
        Assert.assertEquals(true,isParked);
        }catch (ParkingLotSystemException e){
            Assert.assertEquals(e.exceptionTypes, ParkingLotSystemException.ExceptionTypes.PARKING_LOT_FULL);
        }
    }

    @Test
    public void givenVehicle_IfUnParking_ShouldReturnTrue() {
       try{
           Vehicle vehicle = new Vehicle();
           vehicle.setDateTime(LocalDateTime.now());
           parkingLotSystem =new ParkingLotSystem();
           parkingLotSystem.parking(vehicle);
           boolean isUnParked= parkingLotSystem.unparking(0);
           Assert.assertEquals(true,isUnParked);
        }catch (ParkingLotSystemException e){
           System.out.println("ENTER INTO EXCEPTION");
            Assert.assertEquals(e.exceptionTypes,ParkingLotSystemException.ExceptionTypes.NOT_FOUND);}
    }

    @Test
    public void givenVehicle_IfUnParkingFailed_ShouldReturnTrue() {
        try{
            Vehicle vehicle = new Vehicle();
            vehicle.setDateTime(LocalDateTime.now());
            parkingLotSystem =new ParkingLotSystem();
            parkingLotSystem.parking(vehicle);
            boolean isUnParked= parkingLotSystem.unparking(2);
            Assert.assertEquals(true,isUnParked);
        }catch (ParkingLotSystemException e){
            System.out.println("ENTER INTO EXCEPTION");
            Assert.assertEquals(e.exceptionTypes,ParkingLotSystemException.ExceptionTypes.NOT_FOUND);
        }
    }


//    Parking Lot Owner
    @Test
    public void givenParkingLot_IsNotFull_ShouldReturnTrue() throws ParkingLotSystemException {
        Vehicle vehicle = new Vehicle();
        ParkingLotOwner parkingLotOwner=new ParkingLotOwner();
        vehicle.setDateTime(LocalDateTime.now());
        parkingLotSystem =new ParkingLotSystem();
        parkingLotSystem.parking(vehicle);
       Boolean isFull=parkingLotSystem.parking(vehicle);
        String isvFull=parkingLotOwner.availabilityParkingSlot(isFull);
        Assert.assertEquals("Parking is Not Full",isvFull);
    }
    @Test
    public void givenParkingLot_IsFull_ShouldReturnTrue() throws ParkingLotSystemException {
       try{
        Vehicle vehicle = new Vehicle();
        ParkingLotOwner parkingLotOwner=new ParkingLotOwner();
        vehicle.setDateTime(LocalDateTime.now());
        parkingLotSystem =new ParkingLotSystem();
        parkingLotSystem.parking(vehicle);
        Boolean isFull=parkingLotSystem.parking(vehicle);
        parkingLotSystem.parking(vehicle);
        String isvFull=parkingLotOwner.availabilityParkingSlot(isFull);
        Assert.assertEquals("Parking is  Full",isvFull);
    }catch (ParkingLotSystemException e){
       Assert.assertEquals(e.exceptionTypes, ParkingLotSystemException.ExceptionTypes.PARKING_LOT_FULL);}
    }

    //Airport Security
    @Test
    public void givenParkingLot_IsFullShouldReturnTrue_airportSecurity() throws ParkingLotSystemException {
        Vehicle vehicle = new Vehicle();
        AirportSecurity airportSecurity=new AirportSecurity();
        vehicle.setDateTime(LocalDateTime.now());
        parkingLotSystem =new ParkingLotSystem();
        parkingLotSystem.parking(vehicle);
        Boolean isFull=parkingLotSystem.parking(vehicle);
        String isvFull=airportSecurity.availabilityParkingSlot(isFull);
        Assert.assertEquals("Parking is Not Full",isvFull);
    }
    @Test
    public void givenParkingLot_IsNoTFullShouldReturnTrue_airportSecurity() throws ParkingLotSystemException {
        try{
            Vehicle vehicle = new Vehicle();
            AirportSecurity airportSecurity=new AirportSecurity();
            vehicle.setDateTime(LocalDateTime.now());
            parkingLotSystem =new ParkingLotSystem();
            parkingLotSystem.parking(vehicle);
            Boolean isFull=parkingLotSystem.parking(vehicle);
            parkingLotSystem.parking(vehicle);
            String isvFull=airportSecurity.availabilityParkingSlot(isFull);
            Assert.assertEquals("Parking is Full",isvFull);
        }catch (ParkingLotSystemException e){
            Assert.assertEquals(e.exceptionTypes, ParkingLotSystemException.ExceptionTypes.PARKING_LOT_FULL);}
    }

    @Test
    public void givenParKinglot_parkingDecisionsOnWhere_ToParkLot() {
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
            Vehicle vehicle = new Vehicle();
            vehicle.setDateTime(LocalDateTime.now());
            parkingLotSystem = new ParkingLotSystem();
            parkingLotSystem.parking(vehicle);
            parkingLotSystem.find(1);
        } catch (ParkingLotSystemException e) {
            Assert.assertEquals(e.exceptionTypes, ParkingLotSystemException.ExceptionTypes.NOT_FOUND);

        }

    }

    @Test
    public void givenParkingLot_ChargingVehicle(){
        try {
            Vehicle vehicle = new Vehicle();
            vehicle.setDateTime(LocalDateTime.now());
            parkingLotSystem=new ParkingLotSystem();
          boolean charged =parkingLotSystem.parking(vehicle);
            Assert.assertEquals(true,charged);
        }catch (ParkingLotSystemException e){
            Assert.assertEquals(e.exceptionTypes,ParkingLotSystemException.ExceptionTypes.NOT_FOUND);
        }
    }

    @Test
    public void givenParkingSystem_DistributionEvenlys(){
        try {
            Vehicle vehicle = new Vehicle();
            vehicle.setDateTime(LocalDateTime.now());
            parkingLotSystem=new ParkingLotSystem();
            parkingLotSystem.allocationLots(vehicle);
            parkingLotSystem.allocationLots(vehicle);
            parkingLotSystem.allocationLots(vehicle);
            parkingLotSystem.allocationLots(vehicle);
        }catch (ParkingLotSystemException e){
            Assert.assertEquals(e.exceptionTypes,ParkingLotSystemException.ExceptionTypes.NOT_FOUND);
        }
    }
//
//    @Test
//    public void givenParkingLot_FindingSpace_ForHandCap(){
//        try {
//            Vehicle vehicle = new Vehicle();
//            vehicle.setDateTime(LocalDateTime.now());
//
//            parkingLotSystem = new ParkingLotSystem();
//            parkingLotSystem.allocationLots(vehicle);
//            parkingLotSystem.allocationLots(vehicle);
//
//           boolean checkingSpace=parkingLotSystem.find();
//           Assert.assertEquals(true,checkingSpace);
//
//        } catch (ParkingLotSystemException e) {
//            Assert.assertEquals(e.exceptionTypes, ParkingLotSystemException.ExceptionTypes.NOT_FOUND);
//
//        }
//
//    }



}
