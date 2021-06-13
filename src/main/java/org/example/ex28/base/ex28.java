package org.example.ex28.base;

import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */
public class ex28 {
    private static final Scanner in = new Scanner(System.in);
    private static int [] inputs = new int[5];
    public static void main(String[] args) {
        calculateSum ad = new calculateSum();
        int inputs[] = readUserInput();

        String result = ad.calSum(inputs);

        System.out.print(result);

    }

    public static int [] readUserInput() {

        for(int x = 0; x<5;x++)
        {
            System.out.print("Enter a number: ");
            inputs[x] = in.nextInt();
        }
        return inputs;

    }
}
