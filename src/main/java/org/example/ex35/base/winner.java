package org.example.ex35.base;

public class winner {
    public static int winningIndex(int length) {
        int winIndex = 0;
        if(length == 2)
        {
            winIndex = (Math.random() <= 0.5) ? 1 : 2;
        }
        else if(length == 1)
        {
            winIndex = 1;
        }
        else
        {
            winIndex = (int)Math.floor(Math.random()*(length-1)+1);
        }

        return winIndex;
    }
}
