package org.example.ex31.base;

public class heart_Rate {
    public String karvonen_Heart_Rate (String rateS, String ageS){
        String output = "";
        int rate = ex31.rateInt(rateS);
        int age = ex31.ageInt(ageS);

        for(double intest = 55; intest<100; intest+=5)
        {
            double TargetHeartRate = (((220 - age)-rate)* (intest/100) + rate);

            output +=(intest + "%        | " + (int)Math.round(TargetHeartRate) + " bpm\n");
        }
        return output;
    }
}
