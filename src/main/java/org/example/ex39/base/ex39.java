package org.example.ex39.base;

import java.util.*;

public class ex39 {
    private static final Scanner in = new Scanner(System.in);
    private static final HashMap<String, String> databaseNames = new HashMap<String, String>();
    public static void main(String[] args) {
        makeDatabaseNames();


    }

    private static void makeDatabaseNames() {
        databaseNames.put("John", "Johnson");
        databaseNames.put("Tou", "Xiong");
        databaseNames.put("Michaela", "Michaelson");
        databaseNames.put("Jake", "Jacobson");

    }
}
