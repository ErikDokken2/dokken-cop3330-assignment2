package org.example.ex30.base;

import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Erik Dokken
 */
public class ex30 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        mutiTable ad = new mutiTable();
        ad.timesTable();
        String output = ad.timesTable();
        System.out.print(output);
    }
}
