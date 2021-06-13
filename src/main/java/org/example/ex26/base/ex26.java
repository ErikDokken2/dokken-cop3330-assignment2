package org.example.ex26.base;

import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Erik Dokken
 */
public class ex26 {
    private static final Scanner in = new Scanner(System.in);

    private static double balance;
    private static double api;
    private static double mothPayment;

    public static void main(String[] args) { //Need to Figure Out
        PaymentCalculator ad = new PaymentCalculator();
        readUserInput();
        double result = ad.calculateMonthsUntilPaidOff(balance, api, mothPayment);
        //double result = ad.timeToPayOff(balance, api, mothPayment);
        System.out.println(result);
    }

    private static void readUserInput() {
        System.out.print("What is your balance? ");
        balance = in.nextDouble();

        System.out.print("What is the APR on the card (as a percent)? ");
        api = in.nextDouble();

        System.out.print("What is the monthly payment you can make? ");
        mothPayment = in.nextDouble();

    }

}
