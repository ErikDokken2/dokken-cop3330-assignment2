package org.example.ex32.base;

import java.util.Scanner;

public class isValid {
    private static final Scanner in = new Scanner(System.in);

    public boolean validDifficulty(String input) {
        if(input == null || input.equals("")|| input.equals(" ")) {
            return false;
        }

        boolean ifNum= inNum(input);

        if(ifNum)
        {
            int inputInt = Integer.parseInt(input);
            if(inputInt > 3 || inputInt < 1)
            {
                return false;
            }
        }

        if(!ifNum)
        {
            return false;
        }

        return true;
    }

    private boolean inNum(String input) {
        char charactersString[] = {'q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','j','k','l','z','x','c','v','b','n','m'};
        char specialCharactersString[] = {'!','@','#','$','%','&','*','(',')','+',',','-','.','/',':',';','<','=','>','?','[',']','^','_','`','{','}','|','\\'};
        char capCharactersString[] = {'Q','W','E','R','T','Y','U','I','O','P','A','S','D','F','G','H','J','K','L','Z','X','C','V','B','N','M'};
        char charChecking;
        if(input == null || input.equals("")|| input.equals(" ")) {
            return false;
        }
        for(int x = 0; x < input.length(); x++)
        {
            //Char lowercase Check
            for(int q = 0; q < 26; q++)
            {
                charChecking = input.charAt(x);
                if(charactersString[q] == charChecking)
                {
                    return false;

                }
            }
            for(int z = 0; z < 29; z++)
            {
                charChecking = input.charAt(x);
                if(specialCharactersString[z] == charChecking)
                {
                    return false;
                }
            }
            for(int y = 0; y < 26; y++)
            {
                charChecking = input.charAt(x);
                if(capCharactersString[y] == charChecking)
                {
                    return false;

                }
            }

        }return true;
    }

    public String guessingGame(String difficulty) {

        String guess;
        int diffNum = Integer.parseInt(difficulty);
        int goalNum;
        int totalGuesses = 0;
        System.out.print("I have my number. What's your guess? ");
        guess = in.nextLine();

        if(diffNum == 1)
        {
            goalNum =(int) Math.floor(Math.random()*(10-1+1)+1);
            totalGuesses = guessNum(goalNum,guess);
        }
        if(diffNum == 2)
        {
            goalNum =(int) Math.floor(Math.random()*(100-1+1)+1);
            totalGuesses = guessNum(goalNum,guess);
        }
        if(diffNum == 3)
        {
            goalNum =(int) Math.floor(Math.random()*(1000-1+1)+1);
            totalGuesses = guessNum(goalNum,guess);
        }
        return "You got it in " + totalGuesses+ " guesses!";
    }

    private int guessNum( int goalNum, String guess) {
        int counter = 1;

        //Check if guess input is num
        boolean validGuess = inNum(guess);

        while(!validGuess || guess == null || guess == " ")
        {
            counter++; //adds a coutner to guesses "count non-numeric entries as wrong guesses."
            System.out.print("What's your guess? ");
            guess = in.nextLine();
            validGuess = inNum(guess);
        }

        do{
            if(Integer.parseInt(guess) < goalNum)
            {
                counter++;
                System.out.print("Too low. Guess again: ");
                guess = in.nextLine();

                validGuess = inNum(guess);
            }
            else if(Integer.parseInt(guess) > goalNum)
            {
                counter++;
                System.out.print("Too high. Guess again: ");
                guess = in.nextLine();
                validGuess = inNum(guess);
            }

        }while(Integer.parseInt(guess) != goalNum || !validGuess);
        return counter;
    }
}
