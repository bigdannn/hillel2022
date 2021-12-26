package HW3;
import java.util.Arrays;

//Создайте массив, содержащий 10 первых нечетных чисел. Выведете элементы массива на консоль в одну строку, разделяя запятой.


public class EighthTask {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        int index = 0;
        int number = 0;
        for (int i = 0; i < 20; i++) {
            if(!(number %2 ==0)){
                numbers[index] = number;
                index++;
            }
            number++;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
