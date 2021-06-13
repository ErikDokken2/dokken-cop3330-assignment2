package org.example.ex29.base;


import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Erik Dokken
 */
public class ex29 {
    private static final Scanner in = new Scanner(System.in);
    private static String rate;
    private static boolean isRate = true;

    public static void main(String[] args) {
        calculateOutput ad = new calculateOutput();
        int input = readUserInput();
        String result = ad.calOutput(input);

        //String outputString = example29.outputString(numYears);

        System.out.println(result);
    }

    private int numYears(int result) {
        return 72/result;
    }

    private int resultInt(String rate) {
        return Integer.parseInt(rate);
    }

    private String outputString(int numYears) {
        return "It will take "+ numYears +" years to double your initial investment.";
    }

    public static int readUserInput() {
        do {
            if(isRate == false){
                System.out.print("Sorry. That's not a valid input.\n");
            }
            System.out.print("What is the rate of return? ");
            rate = in.nextLine();
            isRate(rate);
        }while (isRate == false);
        int numRate = Integer.parseInt(rate);
        return numRate;
    }
    private static boolean isRate(String rate) {
        String specialCharactersString = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
        String charactersString = "qwertyuiopasdfghjklzxcvbnm";
        String capCharactersString = "QWERTYUIOPASDFGHJKLZXCVBNM";
        for(int x = 0; x< rate.length();x++)
        {
            if(rate.equals("0"))
            {
                return isRate = false;
            }
            if(specialCharactersString.contains(Character.toString(rate.charAt(x))))
            {
                return isRate = false;
            }
            if(charactersString.contains(Character.toString(rate.charAt(x))))
            {
                return isRate = false;
            }
            if(capCharactersString.contains(Character.toString(rate.charAt(x))))
            {
                return isRate = false;
            }
        }
    return isRate = true;
    }
}
