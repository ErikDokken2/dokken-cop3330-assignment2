package org.example.ex24.base;
import java.util.Arrays;


public class AnagramChecker {
    public boolean isAnagram(String word1, String word2)
    {
        String w1 = word1.replaceAll("\\s", "");
        String w2 = word2.replaceAll("\\s", "");
        if(word1.length() == word2.length());
        {
            char[] wd1 = w1.toLowerCase().toCharArray();
            char[] wd2 = w2.toLowerCase().toCharArray();

            Arrays.sort(wd1);
            Arrays.sort(wd2);
            if(Arrays.equals(wd1,wd2))
            {
                return true;
            }
            else
                return false;
        }


    }

}
