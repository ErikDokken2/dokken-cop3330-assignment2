package org.example.ex38.base;

import java.util.Scanner;

public class ex38 {
    private static final Scanner in = new Scanner(System.in);
    private static String[] inputList;
    private static String input;

    public static void main(String[] args) {
        int x = 0;
        FilteringValues ad = new FilteringValues();
        readUserInput();
        String[] inputList  = ad.makeList(input);
        String [] evenString = ad.evenString(inputList);
        String output = ad.printEvenValues(evenString);
        printOutput(output);
    }


    private static void printOutput(String outputString) {System.out.println("The even numbers are " + outputString);
    }

    private static String readUserInput() {
        System.out.print("Enter a list of numbers, separated by spaces: ");
        input = in.nextLine();
        return input;
    }

}




