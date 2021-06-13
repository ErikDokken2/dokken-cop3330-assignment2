package org.example.ex34.base;
import org.example.ex33.base.Output;

import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Erik Dokken
 */



public class ex34 {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Outputs ad = new Outputs();
        ex34 example34 = new ex34();

        String employeeList[] = example34.employeeList();
        String removeInput = example34.readUserInput();
        String removeEmployee[] = example34.removeEmployee(employeeList, removeInput);

        //Output
        String outputString = Outputs.outputString(removeEmployee);
        example34.printOutput(outputString);
    }

    private void printOutput(String outputString) {System.out.println(outputString);
    }

    private String[] removeEmployee(String[] employeeList, String removeInput) {

        String [] temp = new String[employeeList.length-1];
        String [] orignal = employeeList;
        int tempIndex = 0;

        for(int x=0 ; x< employeeList.length;x++)
        {
            if(!employeeList[x].equals(removeInput))
            {
                temp[tempIndex] = employeeList[x];
                tempIndex++;
            }
        }
        return temp;
    }

    private static String readUserInput() {
        System.out.print("\nEnter an employee name to remove: ");
        String input = in.nextLine();
        return input;
    }

    private String [] employeeList() {
        String[] employee = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};
        int size = employee.length;
        System.out.println("There are "+ size + " employees:");
        for(int x =0; x < size; x++)
        {
            System.out.println(employee[x]);
        }
        return employee;
    }
}
