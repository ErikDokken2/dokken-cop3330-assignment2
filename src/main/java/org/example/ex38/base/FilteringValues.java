package org.example.ex38.base;

public class FilteringValues {

    //Makes a list from the string
    //input "1 2 3 4 5 6 7 8 9 10 11 12"

    private static int counter;
    //Make a list based off of a string and makes a list basee of its length
    //result will be a list with nulls at the end
    public String [] makeList(String input) {

        //loop goes threw  entire string
        int index = 0;
        counter = 0;
        String [] inputList = new String[input.length()];

     for(int x = 0; x < input.length(); x++)
     {
         if(!String.valueOf(input.charAt(x)).equals(" "))
         {
             if (inputList[index]==(null))
             {
                 inputList[index] = String.valueOf(input.charAt(x));
             }else {
                 inputList[index] += String.valueOf(input.charAt(x));
             }
         }
         else {
             index++;
         }
     }
     index++;       //Because the last number doesn't end with a space

     //counts number of even numbers
     for(int x = 0; x < index; x++){
         if(Integer.parseInt(inputList[x]) % 2 ==0)
         {
             counter++;
         }
     }

     System.out.println(counter);
     Nullify(inputList, counter);

     return inputList;
    }

    public String[] Nullify(String[] inputList, int length) {
        String[] newArray = new String[length];
        for(int x = 0,z =0; x< length;x++)
        {
            if (inputList[x] != null)
            {
                newArray[z] = inputList[x];
                z++;
            }
        }
        for(int i = 0; i < length; i++){
            //System.out.println(newArray[i]);
        }
        return newArray;
    }

    public String outputString(String[] result) {
        String output = "The even numbers are ";
        for(int x = 0; x< result.length; x++)
        {
            if(x ==  result.length-1)
            {
                output+=result[x];
            }
            else
                output+=result[x]+ " ";
        }
        output+= ".";
        return output;
    }

    public static String[] evenString(String[] inputList) {

        String[] newArray = new String[counter+1];

        for(int x = 0; x < inputList.length-1;x++)
        {
            //System.out.println(inputList[x]);
        }

        for(int i = 0,k =0; i < inputList.length; i++){
            if(inputList[i]!= null) {

                int value = Integer.parseInt(inputList[i]);
                //System.out.println(value);
                if (value % 2 == 0) {
                    newArray[k] = inputList[i];
                    k++;
                }

            }
        }


        return newArray;
    }

    public String printEvenValues(String[] evenString) {
        String output = "";
        for(int x =0 ;x < counter;x++)
        {
            if(!evenString.equals(null))
            {
                if(x == counter-1 )
                {
                    output += evenString[x] ;

                }
                else if (x != counter-1 )
                {
                    output += evenString[x] + " ";
                }
            }


        }
        output += ".";

        return output;
    }
}
