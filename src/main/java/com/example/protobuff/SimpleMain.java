package com.example.protobuff;

import com.google.protobuf.InvalidProtocolBufferException;
import example.simple.Simple.SimpleMessage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class SimpleMain {
    public static void main(String[] args) {
        System.out.println("Hello World !!!");


        //Step 1: Setting the valued for the various fields of the new message
        SimpleMessage.Builder messageBuilder  = SimpleMessage.newBuilder();

        // Method 1:

        //messageBuilder.setId(100);
        //messageBuilder.setName("Sunil");
        //messageBuilder.setIsSimple(true);

        //messageBuilder.addSampleList(1);
        //messageBuilder.addSampleList(2);
        //messageBuilder.addSampleList(3);

        //messageBuilder.addAllSampleList(Arrays.asList(4,5,6));


        //======================== OR you can write it like this =======================//

        //method 2:
        messageBuilder.setId(100)
                .setName("Sunil")
                .setIsSimple(true);

        messageBuilder.addSampleList(1)
                .addSampleList(2)
                .addSampleList(3)
                .addAllSampleList(Arrays.asList(4,5,6));



        System.out.println(messageBuilder.toString());

        //Step 2: Create the message by building the message
        SimpleMessage message = messageBuilder.build();


        //Step 3: Reading the information from the message
        int id = message.getId();
        String  name  = message.getName();
        boolean isSimple = message.getIsSimple();


        //Step 4: writing the message to a file
        try {
            System.out.println("Writing to the file");
            FileOutputStream fileOutputStream = new FileOutputStream("simple_message.bin");
            message.writeTo(fileOutputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        //Step 5:  reading the message from a file
        try {
            System.out.println("reading from the file");
            FileInputStream fileInputStream = new FileInputStream("simple_message.bin");
            SimpleMessage newMessage = SimpleMessage.parseFrom(fileInputStream);
            System.out.println(newMessage);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Step 6: sending the message over the network as byte array
        byte [] messageBytes = message.toByteArray();


        //Step 7: reading the the message over the network from byte array
        try {
            System.out.println("Reading the data from byte array");
            SimpleMessage msg = SimpleMessage.parseFrom(messageBytes);
            System.out.println(msg);
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }


    }
}
