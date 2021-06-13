package org.example.ex26.base;

public class PaymentCalculator {
    public double calculateMonthsUntilPaidOff(double balance, double api, double mothPayment){
        //n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
        //calculates apr
        double apr = Math.round((api /365)*100)/100.00;
        double apr1 = 1.0 + apr;

        double val = -(1.0/30.0);
        double val1 = Math.log(1 + (balance/mothPayment));
        double val2 = Math.log((1.0 - (Math.pow((apr1), 30.0))));


        double val3 = Math.log(1 + apr);
        double months = (-1.0/30.0) * Math.log(1 + ((balance/mothPayment) * (1 - (Math.pow((1 + apr), 30))))) /Math.log(1 + apr);
        System.out.println(val);
        System.out.println(val1);
        System.out.println(val2);
        System.out.println(val3);
        double n = val * Math.log(1+balance/mothPayment * Math.pow(1- (1+ apr),30))/Math.log(1+apr);
        return months;
    }
    public static double timeToPayOff(double APR, double balance, double payment) {
        double months;
        APR /= 365;

        months = (-1.0/30.0) * Math.log(1 + ((balance/payment) * (1 - (Math.pow((1 + APR), 30)))))
                /Math.log(1 + APR);

        return months;
    }
}
