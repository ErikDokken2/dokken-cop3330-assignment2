package org.example.ex38.base;

import java.util.Scanner;

public class ex38 {
    private static final Scanner in = new Scanner(System.in);
    private static String input;
    public static void main(String[] args) {
        FilteringValues ad = new FilteringValues();
        readUserInput();
       String[] result  = ad.makeList(input);
        String outputString = outputString(result);

        printOutput(outputString);
    }

    private static void printOutput(String outputString) {System.out.println(outputString);
    }

    private static String outputString(String[] result) {
        String output = "The even numbers are ";
        for(int x = 0; x< result.length; x++)
        {
            output+=result[x] + " ";
        }
        output+= ".";
        return output;
    }

    private static void readUserInput() {
        System.out.print("Enter a list of numbers, separated by spaces: ");
        input = in.nextLine();
    }

}




