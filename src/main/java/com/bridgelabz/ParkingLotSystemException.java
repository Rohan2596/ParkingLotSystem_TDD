package com.bridgelabz;

public class ParkingLotSystemException extends Exception {

    private String exceptionMessage;

    enum  ExceptionTypes{
       PARKING_LOT_FULL,NOT_FOUND
   }
    ExceptionTypes exceptionTypes;
    public ParkingLotSystemException(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }
    public ParkingLotSystemException(String exceptionMessage,ExceptionTypes types){
        this.exceptionMessage=exceptionMessage;
        this.exceptionTypes=types;
    }

    public ParkingLotSystemException(ExceptionTypes exceptionTypes) {
        this.exceptionTypes = exceptionTypes;
    }
}
