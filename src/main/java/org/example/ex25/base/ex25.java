package org.example.ex25.base;


import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Erik Dokken
 */
public class ex25 {
    private static final Scanner in = new Scanner(System.in);
    private static String password;


    public static void main(String[] args) {
        Strength_Indicator ad = new Strength_Indicator();
        ex25 example25 = new ex25();

        readUserInput();
        int result = ad.Password_Strength(password);

        String outputString = example25.outputString(result, password);

        System.out.println(outputString);
    }

    private String outputString(int result, String password) {
        if(result == 1)
        {
            return ("The password '"+ password + "' is a very weak password.");
        }
        if(result == 2)
        {
             return ("The password '"+ password + "' is a weak password.");
        }
        if(result == 3)
        {
            return ("The password '"+ password + "' is a strong password.");
        }
        if(result == 4)
        {
            return ("The password '"+ password + "' is a very strong password.");
        }
        return "Error";
    }

    public static void readUserInput() {
        System.out.print("Enter a Password ");
        password = in.nextLine();

    }
}
