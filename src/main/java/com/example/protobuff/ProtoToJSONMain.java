package com.example.protobuff;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import example.simple.Simple;

import java.util.Arrays;

public class ProtoToJSONMain {
    public static void main(String[] args) throws InvalidProtocolBufferException {
        System.out.println("Proto to JSON Message");

        //Step 1: Setting the valued for the various fields of the new message
        Simple.SimpleMessage.Builder messageBuilder  = Simple.SimpleMessage.newBuilder();

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
        Simple.SimpleMessage message = messageBuilder.build();

        //Converting the message to the JSON
        String JSONString = JsonFormat.printer()

                //you can try multiple options here and play with it
                .includingDefaultValueFields()
                .print(messageBuilder);

        System.out.println(JSONString);


        //Converting the JSON to the message
        Simple.SimpleMessage.Builder messageBuilder1  = Simple.SimpleMessage.newBuilder();

        JsonFormat.parser()
                .ignoringUnknownFields()
                .merge(JSONString,messageBuilder1);

        Simple.SimpleMessage message1 = messageBuilder.build();
        System.out.println(message1.toString());



    }
}
