package org.example.ex33.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Erik Dokken
 */

import java.util.Scanner;

public class ex33 {
    private static final Scanner in = new Scanner(System.in);
    private static String question;

    public static void main(String[] args) {
        Output ad = new Output();
        readUserInput();

        int randNum  = (int)Math.floor(Math.random()*(4-1+1)+1);

        //Output
        String outputString = ad.outputString(randNum);

        printOutput(outputString);
    }

    private static void printOutput(String outputString) { System.out.println("\n" + outputString);
    }



    private static void readUserInput() {
        System.out.print("What's your question?\n\t");
        question = in.nextLine();
    }
}
