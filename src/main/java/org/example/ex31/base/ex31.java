package org.example.ex31.base;

import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Erik Dokken
 */
public class ex31 {
    private static final Scanner in = new Scanner(System.in);
    private static String restPulse;
    private static String age;
    private static boolean isValid = true;

    public static void main(String[] args) {
        heart_Rate ad = new heart_Rate();
        ex31 example31 = new ex31();

        readUserInput();
        String result  = ad.karvonen_Heart_Rate(restPulse, age);
        String outputString = example31.outputString(restPulse,age, result);
        System.out.println(outputString);

    }

    public static int rateInt(String rate) { return Integer.parseInt(rate);
    }

    public static int ageInt(String age) { return Integer.parseInt(age);
    }

    private int weightInt(String weightInput) {
        return Integer.parseInt(weightInput);
    }

    private String outputString(String restPulse, String age, String result) {
        return ("\nResting Pulse: " + restPulse + "     Age: " + age+"\n\n" +
                "Intensity    | Rate\n" +
                "-------------|--------\n" + result);
    }

    private static boolean isNum(String num) {
        String charactersString = "qwertyuiopasdfghjklzxcvbnm";
        String specialCharactersString = "!@#$%&*()'+,-./:;<=>?[]^_`{|} ";
        String capCharactersString = "QWERTYUIOPASDFGHJKLZXCVBNM";
        for(int x = 0; x < num.length();x++)
        {
            if(specialCharactersString.contains(Character.toString(num.charAt(x))))
            {
                return isValid = false;
            }
            if(charactersString.contains(Character.toString(num.charAt(x))))
            {
                return isValid = false;
            }
            if(capCharactersString.contains(Character.toString(num.charAt(x))))
            {
                return isValid = false;
            }

        }
        return  isValid = true;

    }
    public static void readUserInput() {
        do
        {
            System.out.print("Resting Pulse: ");
            restPulse = in.nextLine();
            isNum(restPulse);
        }while(isValid == false);
        do
        {
            System.out.print("Age: ");
            age = in.nextLine();
            isNum(age);
        }while(isValid == false);


    }
}
