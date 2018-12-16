package com.example.protobuff;

import com.example.tutorial.Person;

import java.io.*;
import java.util.Scanner;

public class AddressBookMain {

    public static final String ADDRESS_BOOK_FILE_NAME="addressbook.bin";
    public static final String ADDRESS_BOOK_FILE_PATH="/Users/sunil28/Desktop/protobuff-example-java";
    public static void main(String[] args) throws IOException {

        File file = new File(ADDRESS_BOOK_FILE_PATH+"/"+ADDRESS_BOOK_FILE_NAME);
        FileOutputStream fileOutputStream=null;
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("Error : can not create new file");
                e.printStackTrace();
            }
        }

        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            System.out.println("Error : file not found");
            e.printStackTrace();
        }

        //InputStreamReader isr =new InputStreamReader(System.in);
        //BufferedReader br=new BufferedReader(isr);
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Address Book Application !!!");
        System.out.println("Enter the number of person you want to add in the address book");
        //int no_of_person=Integer.valueOf(br.readLine());
        String no_of_person=sc.nextLine();
        System.out.println(no_of_person);
//        for(int i=0;i<no_of_person;i++){
//            Person person = AddressBookAddPerson.createPerson(fileOutputStream);
//        }



    }
}
