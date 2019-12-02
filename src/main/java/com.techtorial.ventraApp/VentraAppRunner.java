package com.techtorial.ventraApp;

import java.sql.SQLOutput;
import java.util.Scanner;

import static com.techtorial.ventraApp.VentraCard.generateVentraCardNumber;

public class VentraAppRunner {



    public static void main(String[] args){


        System.out.println("Hello. Please choose on of the following options");
        System.out.println("1 - For a new card");
        System.out.println("2 - For card replacement");
        System.out.println("3 - For a balance");
        System.out.println("4 - For rider info");
        System.out.println("5 - For pass types");
        Scanner scanner = new Scanner(System.in);


        String option = scanner.next();

        /*
        implement the choice logic
         */

        makeAChoice(option);



    }

    private static void makeAChoice(String choice){
        switch (choice){
            case "0":
                break;
            case "1":
                Rider rider=Rider.createNewRider();






//gityfdjfjffn
                break;
            case "2":
                generateVentraCardNumber();
                System.out.println(generateVentraCardNumber());
                break;
            case "3":
                System.out.println("Please choose one of option");
                System.out.println("1-Your Balance");
                System.out.println("2-Add Money");
                Scanner scanner=new Scanner (System.in);
                String option=scanner.next();



            case "4":
                Rider myinfo =new Rider("Maks","BBBBBBB","bbb.com");
                System.out.println(myinfo.getFirstName());
                System.out.println(myinfo.getLastName());
                System.out.println(myinfo.getEmail());
                System.out.println("Riders card number is # " +generateVentraCardNumber());

            case "5":
                Pass mypass=new Pass("100","15","5");
                System.out.println("Monthly Pass is  $ " +mypass.getMonthlyPass());
                System.out.println("Weekday Pass is $ " +mypass.getWeekendPass());
                System.out.println(("Daily Pass is $ " +mypass.getDailyPass()));

        }
    }
}
