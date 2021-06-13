package org.example.ex38.base;

import java.util.Scanner;

public class ex38 {
    private static final Scanner in = new Scanner(System.in);
    private static String input;

    public static void main(String[] args) {
        FilteringValues ad = new FilteringValues();
        readUserInput();
        String[] result  = ad.makeList(input);
        String outputString = ad.outputString(result);

        printOutput(outputString);
    }

    private static void printOutput(String outputString) {System.out.println(outputString);
    }

    private static void readUserInput() {
        System.out.print("Enter a list of numbers, separated by spaces: ");
        input = in.nextLine();
    }

}




