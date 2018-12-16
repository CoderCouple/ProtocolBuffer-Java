package com.example.protobuff;

import com.example.tutorial.Person;
import java.io.FileOutputStream;
import java.util.Scanner;


public class AddressBookAddPerson {

    public static Person createPerson(FileOutputStream fileOutputStream){

        Person.Builder personBuilder = Person.newBuilder();
        Scanner input = new Scanner(System.in);


        System.out.println("Enter Person Name : ");
        personBuilder.setName(input.next());

        System.out.println("Enter Person ID : ");
        personBuilder.setId(input.nextInt());

        System.out.println("Enter Person Email : ");
        personBuilder.setEmail(input.next());

        while(true){
            System.out.println("Enter Person Phone Number : ");
            String number= input.next();
            if(number=="")
                break;

            Person.PhoneNumber.Builder phoneNumberBuilder =  Person.PhoneNumber.newBuilder();
            phoneNumberBuilder.setNumber(number);


            System.out.println("Enter Person Phone Type : M=Mobile, W=Work, H=Home ");
            switch (input.next()){
                case "M" :
                    phoneNumberBuilder.setType(Person.PhoneType.MOBILE);
                    break;
                case "W" :
                    phoneNumberBuilder.setType(Person.PhoneType.WORK);
                    break;
                case "H" :
                    phoneNumberBuilder.setType(Person.PhoneType.HOME);
                    break;
            }
            personBuilder.addPhones(phoneNumberBuilder.build());
        }
        Person person = personBuilder.build();

        //408 775 4856 - Jitender
        return person;
    }
}
