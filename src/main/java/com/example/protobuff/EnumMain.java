package com.example.protobuff;

import example.enumerations.EnumExample;
import example.enumerations.EnumExample.EnumMessage;


public class EnumMain {

    public static void main(String[] args) {
        System.out.println("Enum Example !!!");

        //Step 1: Setting the valued for the various fields of the new message
        EnumMessage.Builder messageBuilder =  EnumMessage.newBuilder();

        // Method 1:
        //messageBuilder.setId(100);
        //messageBuilder.setDayOfTheWeek(EnumExample.DayOfTheWeek.FRIDAY);


        // Method 2:
        messageBuilder.setId(100)
                .setDayOfTheWeek(EnumExample.DayOfTheWeek.MONDAY);

        //Step 2: Create the message by building the message
        EnumMessage msg = messageBuilder.build();
        System.out.println(msg);

    }
}
