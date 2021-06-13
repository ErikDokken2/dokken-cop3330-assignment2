package org.example.ex33.base;

public class Output {
    public String outputString(int randNum) {
        String output = "";
        if(randNum == 1)
        {
            output = "Yes";
        }
        else if(randNum == 2)
        {
            output = "No";
        }
        else if(randNum == 3)
        {
            output = "Maybe";
        }
        else if(randNum == 4)
        {
            output = "Ask again later"; }
            return output;
        }
    }

