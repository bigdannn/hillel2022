package HW3;

public class Factorial {

    //Дано число n при помощи цикла for посчитать факториал n!

    public static void main(String[] args) {

        int number2 = 6;
        int factorial =1;

        for (int i = 1; i <= number2; i++) {
            factorial = factorial*i;
        }
        System.out.println(factorial);

    }
}
