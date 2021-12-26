package HW3;

public class FactorialDowhile {
    public static void main(String[] args) {

        int number2 = 10;
        int answer = 1;
        int factorial = 1;

        do {
            answer = answer * factorial;
            System.out.print(factorial + " * ");
            factorial++;
        } while (number2 >= factorial);
        System.out.print("= " + answer);
    }
}
