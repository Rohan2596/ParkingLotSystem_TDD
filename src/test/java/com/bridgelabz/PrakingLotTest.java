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
}
