package HW2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoanCalculation {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the amount of cash deposit in UAH, please.");
        double amountOfCash = Double.parseDouble(reader.readLine());

        System.out.println("Enter the interest per annum paid by the bank, please.");
        double interestRate = Double.parseDouble(reader.readLine());

        System.out.println("Enter the duration of deposit (in years), please.");
        double durationOfDeposit = Double.parseDouble(reader.readLine());

        double iRate2 = (1+interestRate/100);

        double accumulation;
        double additionalVariable;
        for (int i = 1; i <= durationOfDeposit; i++) {
            accumulation = amountOfCash*Math.pow(iRate2, i);
            System.out.println("After the " + i + " year you will got " + accumulation);
            additionalVariable=accumulation;
            System.out.println("For the " + i +" year you will earn " + (accumulation-amountOfCash) + " ₴ ");
            System.out.println("----------------------------");
        }

        double profit = amountOfCash*Math.pow(iRate2, durationOfDeposit);
        System.out.println("Your profit for " + durationOfDeposit + " years will be " + profit + " ₴ ");
        System.out.println("For this period you have accumulated " + (profit-amountOfCash) + " ₴");
    }
}
