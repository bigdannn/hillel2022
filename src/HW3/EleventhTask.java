package HW3;

import java.util.Arrays;

public class EleventhTask {

    //Поменять наибольший и наименьший элементы массива местами.

    public static void main(String[] args) {
        int[] numbers = {11, 13 ,7 ,2, 0, 9, -7, -1};

        System.out.println(Arrays.toString(numbers));

        int min = numbers[0];
        int max = numbers[0];
        int indexMin = 0;
        int indexMax = 0;
        int tmp = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]<min){
               min =  numbers[i];
               indexMin = i;
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]> max){
                max = numbers[i];
                indexMax = i;
            }
        }
        tmp = numbers[indexMin];
        numbers[indexMin] = numbers[indexMax];
        numbers[indexMax] = tmp;

        System.out.println(Arrays.toString(numbers));



    }
}
