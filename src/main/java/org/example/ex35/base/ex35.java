package org.example.ex35.base;
import java.util.ArrayList;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Erik Dokken
 */
public class ex35 {
    private static final Scanner in = new Scanner(System.in);
    private static ArrayList addContestants;
    private static int length = 1;
    public static void main(String[] args) {
        winner example35 = new winner();
        String people[] = {""};
        readUserInput();

        int winNum = winner.winningIndex(length);

        String outputString = outputString(addContestants, winNum);
        printOutput(outputString);
    }

    private static void printOutput(String outputString) {System.out.println(outputString);
    }

    private static String outputString(ArrayList addContestants, int winNum) {

        String winner = (String) addContestants.get(winNum-1);
        String output = ("The winner is... "+ winner + ".");
        return output;
    }


    private static ArrayList readUserInput() {
        String input;
        ArrayList output = new ArrayList();


        do{ System.out.print("Enter a name: ");
            input = in.nextLine();
            if(!input.equals(""))
            {
                addContestants = addContestants(input, output);
                length++;
            }
        }while(!input.equals(""));

        return addContestants;

    }

    private static ArrayList addContestants(String input, ArrayList output) {
        output.add(input);
        return output;
    }

    private int winningIndex(int length) {
        int winIndex = 0;
        if(length == 2)
        {
            winIndex = (Math.random() <= 0.5) ? 1 : 2;
        }
        else if(length == 1)
        {
            winIndex = 1;
        }
        else
        {
            winIndex = (int)Math.floor(Math.random()*(length-1)+1);
        }

        return winIndex;
    }
}
