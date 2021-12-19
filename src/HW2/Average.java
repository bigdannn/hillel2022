package HW2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Average {
    public static void main(String[] args) throws IOException {
        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
       // System.out.println(average(200, 100));

        String input;
        double sum = 0;
        double newNumber;
        int numberOfNumbers = 0;
        double average2;



        while (!(input = reader.readLine()).equals("exit")) {
            newNumber = Double.parseDouble(input);
            sum +=newNumber;
            numberOfNumbers++;
            System.out.println("Write continue if you want to add another number.");
        }
        average2 = sum/numberOfNumbers;
        System.out.println(average2);
    }

    public static double average(double firstNumber, double secondNumber){
        double aver;
        aver = (firstNumber + secondNumber)/2;
        return aver;
    }
}
