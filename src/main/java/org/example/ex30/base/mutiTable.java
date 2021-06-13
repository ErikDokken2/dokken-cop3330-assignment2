package org.example.ex30.base;

public class mutiTable {
    public String timesTable()
    {
        String output = "";
        //Goes threw an 1-12 for x value
        for(int x = 1; x <=12;x++)
        {
            //format exception where x <10
            if(x<10)
            {
                output += (" ");
            }
            //Goes threw an 1-12 for y value
            for(int y = 1; y<=12;y++)
            {
                //format statements
                if(x <= 12)
                {
                    int product1 = (y+1)*x;
                    if(product1 >= 1 && product1 <= 9 )
                    {
                        output += (x*y + "    ");
                    }
                    else if(product1 <=999 && product1 >= 100)
                    {
                        output += (x*y + "  ");
                    }
                    else
                        output +=(x*y + "   ");
                }


            }
            output +=("\n");
        }
        return output;
    }
}
