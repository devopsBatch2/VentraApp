package com.techtorial.ventraApp;

import java.util.Scanner;

public class Rider {


    private String firstName;
    private String lastName;
    private String email;

    public Rider(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    static Scanner scan=new Scanner(System.in);
    public static Rider createNewRider(){
        System.out.println("Please enter your first name");
        String firstName=scan.nextLine();
        System.out.println("Pleae enyer your last name");
        String lastName=scan.nextLine();
        System.out.println("Please enter yiur email");
        String emai=scan.nextLine();


        return new Rider(firstName,lastName,emai);

    }
}
