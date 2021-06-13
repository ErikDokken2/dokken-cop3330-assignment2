package org.example.ex25.base;

public class Strength_Indicator {

    public int Password_Strength(String password){

        int counter = 0, letter = 0, num = 0, spec = 0;

        String specialCharactersString = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";

        if(password.length() < 8) {
            //Very Weak Check
            for (int x = 0; x < password.length(); x++) {
                if (password.charAt(x) >= '0' && password.charAt(x) <= '9') {
                    counter++;
                }
            }
            if (counter == password.length()) {
                return 1; //its a very weak password
            }

            //Weak Check
            for (int x = 0; x < password.length(); x++) {
                if(password.matches("^[a-zA-Z]*$"))
                {
                    return 2;//Weak Password
                }
            }

        }
        else {
            //Strong Check
            for (int x = 0; x < password.length(); x++) {
                if (password.charAt(x) >= '0' && password.charAt(x) <= '9') {
                    num++;
                }
                if (Character.isLetter(password.charAt(x))) {
                    letter++;
                }
                if(specialCharactersString.contains(Character.toString(password.charAt(x)))) {
                    spec++;
                }
            }
            if (num != 0 && letter != 0 && spec != 0)
            {
                return 4;//Very Strong Password
            }
            if (num != 0 && letter != 0)
            {
                return 3;//Strong Password
            }

        }
        return 0;
    }


}
