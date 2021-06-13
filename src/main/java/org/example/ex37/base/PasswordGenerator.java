package org.example.ex37.base;


public class PasswordGenerator {
    private static final String num[] = {"1","2","3","4","5","6","7","8","9", "0"};
    private static final String letters[] = {"q","w","e","r","t","y","u","i","o","p","a","s","d","f","g","h","j","k","l","z","x","c","v","b","n","m",};
    private static final String specCar[] = {"!","@","#","$","%","&","*","(",")","_","+","-","=","[","]","|",",",".","/","?",">","<"};
    public String passwordGen(String minLength, String specCharNum, String numCount) {

        int minLenInt = Integer.parseInt(minLength)-1;
        int numCountInt = Integer.parseInt(numCount);
        int specCharNumInt = Integer.parseInt(specCharNum);
        int maxLength = minLenInt +10;

        //the random length of pass
        int randLength = (int)Math.floor((Math.random()*(maxLength-minLenInt+1)+minLenInt));
        int maxLetter = randLength - (specCharNumInt + numCountInt);

        String password = "";
        int run = 0;

        while(run < randLength)
        {

            int rand = (int)(Math.random()*58);
            //if rand is 1-9 number
            if(rand <= 9 && numCountInt != 0)
            {
                run++;
                numCountInt--;
                int randomSpec  = (int)Math.floor((Math.random()*(10-1+1)+1));

                String charater = num[randomSpec];
                password += charater;


            }//letters
            else if(rand <= 35 && maxLetter != 0)
            {
                run++;
                maxLetter--;
                int randomSpec  = (int)Math.floor((Math.random()*(27-1+1)+1));
                String character = letters[randomSpec];
                password += character;

            }
            else if(rand <= 57 && specCharNumInt != 0){
                specCharNumInt--;
                run++;
                int randomSpec  = (int)Math.floor((Math.random()*(23-1+1)+1));
                String charater = specCar[randomSpec];
                password +=charater;

            }

        }

        return password;
    }
}
