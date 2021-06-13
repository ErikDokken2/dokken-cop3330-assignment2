package org.example.ex32.base;

import org.example.ex24.base.AnagramChecker;

import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Erik Dokken
 */
public class ex32 {
    private static final Scanner in = new Scanner(System.in);
    private static String difficulty;
    private static String rerun;
    public static void main(String[] args) {
        isValid ad = new isValid();
        do{
            System.out.println("Let's play Guess the Number!\n");
            readUserInput();

            boolean validDiff = ad.validDifficulty(difficulty);

            while(validDiff == false){
                readUserInput();
                validDiff = ad.validDifficulty(difficulty);
            }

            String totalGuesses = ad.guessingGame(difficulty);
            System.out.println(totalGuesses);
           rerunValue();
        }while(rerun.equals("Y") || rerun.equals("y"));

    }

    private static void rerunValue() {
        do{
            System.out.print("\nDo you wish to play again (Y/N)? ");
            rerun = in.nextLine();
        }while(!rerun.equals("Y")&& !rerun.equals("y")&& !rerun.equals("N")&& !rerun.equals("n"));


    }

    private static void readUserInput() {

        System.out.print("Enter the difficulty level (1, 2, or 3): ");
        difficulty = in.nextLine();
    }


}

