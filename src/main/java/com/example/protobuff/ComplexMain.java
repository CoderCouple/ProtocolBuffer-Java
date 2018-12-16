package com.example.protobuff;

import example.complex.Complex;
import example.complex.Complex.*;

import java.util.Arrays;

public class ComplexMain {
    public static void main(String[] args) {
        System.out.println("Complex example !!!");

        ComplexMessage.Builder messageBuilder = ComplexMessage.newBuilder();
        messageBuilder.setOneDummy(createDummyMessage(1,"one"))
                .addMultipleDummy(createDummyMessage(2,"two"))
                .addMultipleDummy(createDummyMessage(3,"three"))
                .addMultipleDummy(createDummyMessage(4,"four"));

        messageBuilder.addAllMultipleDummy(Arrays.asList(createDummyMessage(5,"five"),createDummyMessage(6,"six")));
        ComplexMessage msg = messageBuilder.build();

        System.out.println(msg);
    }

    public static DummyMessage createDummyMessage(int id, String name){
        DummyMessage.Builder  messageBuilder = DummyMessage.newBuilder();
        DummyMessage message = messageBuilder.setId(id)
                .setName(name)
                .build();

        return message;
    }
}
