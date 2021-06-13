package org.example.ex24.base;

import java.util.Scanner;

public class ex24 {
    private static final Scanner in = new Scanner(System.in);

    private static String word1;
    private static String word2;

    public static void main(String[] args) {
        AnagramChecker ad = new AnagramChecker();

        readUserInput();

        boolean result = ad.isAnagram(word1, word2);
        System.out.println(result);


    }
    public static void readUserInput() {
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        System.out.print("Enter the first string: ");
        word1 = in.nextLine();
        System.out.print("Enter the second string: ");
        word2 = in.nextLine();
    }
}