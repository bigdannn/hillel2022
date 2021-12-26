package HW3;

import java.util.Arrays;

public class TwelfthTask {

    //Найти среднее арифметическое всех элементов массива.

    public static void main(String[] args) {

        int [] numbers = new int[10];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            int random = (int) (Math.random()*10);

            numbers[i] = random;
            sum +=numbers[i];
        }

        double answer = sum/ numbers.length;

        System.out.println(Arrays.toString(numbers));
        System.out.println(" The arithmetic mean of all numbers is " + answer);
    }
}
