package org.example.ex27.base;

import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Erik Dokken
 */
public class ex27 {
    private static final Scanner in = new Scanner(System.in);
    private static String fname;
    private static String lname;
    private static String zip;
    private static String id;


    public static void main(String[] args) {
        Validating ad = new Validating();

        readUserInput();
        String result = ad.validateInput (fname,lname,zip,id);


        System.out.println(result);

    }
    public static void readUserInput() {
        System.out.print("Enter the first name: ");
        fname = in.nextLine();
        System.out.print("Enter the last name: ");
        lname = in.nextLine();
        System.out.print("Enter the ZIP code: ");
        zip = in.nextLine();
        System.out.print("Enter the employee ID: ");
        id = in.nextLine();
    }

}
