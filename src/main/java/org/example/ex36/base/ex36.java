package org.example.ex36.base;

import java.util.ArrayList;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Erik Dokken
 */
public class ex36 {

    private static final Scanner in = new Scanner(System.in);
    private static ArrayList list;

    private static int minNum;
    private static int maxNum= 0;

    private static double averageNum;

    public static void main(String[] args) {
        Standard_deviation ad2 = new Standard_deviation();
        ArrayList input = readUserInput();

        int sum = calValues(input);

        double deviation = ad2.std(input, averageNum, input.toArray().length,sum);

        //Output
        String outputString = outputString(input,minNum,maxNum,averageNum,deviation);

        printOutput(outputString);

    }

    private static void printOutput(String outputString) {
        System.out.println(outputString);
    }

    private static String outputString(ArrayList input, int minNum, int maxNum, double averageNum, double deviation) {
        String output = ("Numbers: ");
        for(int x = 0; x < input.toArray().length; x++)
        {
            if(x != input.toArray().length-1)
            {
                output += Integer.parseInt((String) input.get(x)) + ", " ;
            }
            else
            {
                output += Integer.parseInt((String) input.get(x));
            }

        }
        output += "\nThe average is "+ averageNum +"\n" +
                "The minimum is "+ minNum +"\n" +
                "The maximum is "+ maxNum +"\n" +
                "The standard deviation is " + String.format("%.2f", deviation);
        return output;
    }

    private static int calValues(ArrayList input) {
        int min= Integer.parseInt((String) input.get(0));
        int sum = 0;

        for(int x = 0;x <input.toArray().length; x++)
        {
            int w = Integer.parseInt((String) input.get(x)) ;
            sum += w;
            maxNum = max(maxNum, w);

            minNum = min(min,w);
            averageNum = average(sum,input.toArray().length );
        }
        return sum;
    }
    private static int min(int min, int w) {
        if(min > w)
        {
            min = w;

        }
        return min;
    }

    private static int max(int max, int w) {
        if(max < w)
        {
            max = w;
            return max;
        }
        else
        {
            return max;
        }


    }

    private static double average(int sum, int length) {return sum/length;
    }
    private static ArrayList readUserInput() {
        String input;
        ArrayList numArray = new ArrayList();

        do{
            System.out.print("Enter a number: ");
            input = in.nextLine();
            if(input.equals("done"))
            {
                return numArray;
            }
            boolean numIdicat = isNum(input);
            if(numIdicat)
            {
                list = addVlaues(input,numArray);
            }
        }while(!input.equals("done"));
        return list;
    }

    private static ArrayList addVlaues(String input, ArrayList numArray) {
        numArray.add(input);
        return numArray;
    }

    public static boolean isNum(String input) {
        String charactersString = "qwertyuiopasdfghjklzxcvbnm";
        String specialCharactersString = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
        String capCharactersString = "QWERTYUIOPASDFGHJKLZXCVBNM";
        for(int x = 0; x < input.length();x++)
        {
            if (specialCharactersString.contains(Character.toString(input.charAt(x))) || charactersString.contains(Character.toString(input.charAt(x))))
            {
                return false;
            }

            if (capCharactersString.contains(Character.toString(input.charAt(x))))
            {
                return false;
            }
        }
        return true;
    }
}

