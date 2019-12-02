package com.techtorial.ventraApp;

import java.util.Arrays;
import java.util.Random;

public class VentraCard {


    long[] cardNumbers = new long[100];
    String[] userInfo = new String[100];
    String[] emails = new String[100];

    Rider rider;
    Pass pass;
    long ventraCardNumber;

    public VentraCard(Rider rider, Pass pass) {
        this.rider = rider;
        this.pass = pass;
        ventraCardNumber = generateVentraCardNumber();
        int index;

        // storing ventra card to the card repository
        do {
            index = new Random().nextInt(100);
        } while (cardNumbers[index] != 0);

        cardNumbers[index] = ventraCardNumber;

    }

    /*
    Add following features for a ventra card:

    - register new card:
        - card should be linked with a rider,
        - pass type should be specified when registering a card
        - a unique card number should be generated (16 digits)
        - store first name, last name, email in an array respectively
    - replace my card
        - should be able to replace a card using first name and last name, or email, or ventra card number

     */

    public VentraCard replaceMyCard(long ventraCardNumber) {


        return null;
    }

    public VentraCard replaceMyCard(String firstName, String lastName) {

        return null;
    }

    public VentraCard replaceMyCard(String email) {

        return null;
    }


    public static long generateVentraCardNumber() {
        Random random=new Random();
        long first14=(long) (Math.random()*999999999999999l);

        /*
            Generate a random implementation
         */

        checkCardNumberUnique(14);
        return first14;
    }

    private static boolean checkCardNumberUnique(long ventraCardNumber) {
        boolean isUnique = false;

        /*
        implement uniqueness check logic
         */


        return isUnique;

    }

    public static void main(String[] args) {
        long[] cardNumbers = new long[100];
        String[] userInfo = new String[100];
        String[] emails = new String[100];

        cardNumbers[0]=generateVentraCardNumber();
        a:for (int i=0;i<120;i++) {
            for (int j=0;j<100;j++){
                if (generateVentraCardNumber()!=cardNumbers[j]){
                    cardNumbers[i]=generateVentraCardNumber();
                    if (cardNumbers[99]!=0){break a;}}}


                }
            System.out.println(Arrays.toString(cardNumbers));
            System.out.println(cardNumbers.length);




            // System.out.println(generateVentraCardNumber());
            //System.out.println(generateVentraCardNumber());
        }}



















