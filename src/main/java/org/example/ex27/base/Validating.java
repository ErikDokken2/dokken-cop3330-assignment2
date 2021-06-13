package org.example.ex27.base;




public class Validating {
    private static String output;

    public String validateInput (String fname,String lname,String zip,String id){
        output ="";
        ex27 example27 = new ex27();
        String first = fname.replaceAll("\\s", "");
        String last = lname.replaceAll("\\s", "");

        ValidatingFName(first);
        ValidatingLName(last);
        ValidatingId(id);
        ValidatingZip(zip);

        if (output.equals(""))
        {
            output = "There were no errors found.";
        }
        return output;
    }

    public String ValidatingZip(String zip) {
        String charactersString = "qwertyuiopasdfghjklzxcvbnm";
        String capCharactersString = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String specialCharactersString = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
        if(zip.length() != 5)
        {
            output += "The zipcode must be a 5 digit number.\n";
            return output;
        }
        for(int x = 0; x < zip.length();x++)
        {
            if (specialCharactersString.contains(Character.toString(zip.charAt(x))) || charactersString.contains(Character.toString(zip.charAt(x))) ||capCharactersString.contains(Character.toString(zip.charAt(x))))
            {
                output += "The zipcode must be a 5 digit number.\n";
                return output;
            }
        }
        return "";
    }

    public void ValidatingId(String id) {
        String charactersString = "qwertyuiopasdfghjklzxcvbnm";
        String capCharactersString = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String numberString = "1234567890";
        if(id.length() != 7)
        {
            output += "The employee ID must be in the format of AA-1234\n";
        }
        if(charactersString.contains(Character.toString((id.charAt(0)))) || charactersString.contains(Character.toString((id.charAt(1)))))
        {
            output += "The employee ID must be in the format of AA-1234\n";
        }

            if(capCharactersString.contains(Character.toString((id.charAt(0)))) && capCharactersString.contains(Character.toString((id.charAt(1)))))
        {

           if(id.charAt(2) == '-')
           {
               if(!numberString.contains((Character.toString(id.charAt(3)))) || !numberString.contains(Character.toString((id.charAt(4)))) || !numberString.contains(Character.toString((id.charAt(5)))) || !numberString.contains(Character.toString((id.charAt(6)))))
               {
                   output += "The employee ID must be in the format of AA-1234\n";

               }
           }
        }


    }

    public void ValidatingFName(String first){

        if(first.length() < 2 )
        {
            output += "The first name must be at least 2 characters long.\n";
            if(first.equals(""))
            {
                output += "The first name must be filled in.\n";
            }
        }
        return;
    }
    public void ValidatingLName(String first){

        if(first.length() < 2 )
        {
            output += "The last name must be at least 2 characters long.\n";
            if(first.equals(""))
            {
                output += "The last name must be filled in.\n";
            }
        }
        return;
    }

}
