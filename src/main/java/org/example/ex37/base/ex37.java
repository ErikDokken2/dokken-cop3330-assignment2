package org.example.ex37.base;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Erik Dokken
 */

public class ex37 {
    private static final Scanner in = new Scanner(System.in);
    private static String minLength;
    private static String specCharNum;
    private static String numCount;
    public static void main(String[] args) {
        PasswordGenerator ad = new PasswordGenerator();

        readUserInput();
        String result = ad.passwordGen(minLength,specCharNum,numCount);
        System.out.println("Your password is " + result);
    }

    private static void readUserInput() {
        System.out.print("What's the minimum length? ");
        minLength = in.nextLine();
        System.out.print("How many special characters? ");
        specCharNum = in.nextLine();
        System.out.print("How many numbers? ");
        numCount = in.nextLine();
    }
}
