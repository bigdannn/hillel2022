package HW13;

import java.util.Scanner;

public class Realisation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number which you want to turn in capcha.");
        String str = scanner.nextLine();
        if (str.matches("\\d+")) {
            Capcha.printNumbers(str);
        } else {
            System.out.println("Please, enter correct numbers.");
        }
    }
}
