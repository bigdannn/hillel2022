package HW3;

import java.util.Arrays;

//Дан массив размерности N, найти наименьший элемент массива и вывести на консоль (если наименьших элементов несколько — вывести их все).

public class NinethTenthTask {
    public static void main(String[] args) {

        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            int random = (int) (Math.random() * 10);
            numbers[i] = random;
        }
        System.out.println(Arrays.toString(numbers));


        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Min is " + min);


        //В массиве из задания 9. найти наибольший элемент.

        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>max){
               max = numbers[i];
            }
        }
        System.out.println("Max is "+ max);
    }
}
