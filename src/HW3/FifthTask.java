package HW3;

public class FifthTask {

    //Вывести 10 первых чисел последовательности 0, -5,-10,-15..

    public static void main(String[] args) {

        int number = 10;
        int sum = -5;
        int answer = 0;

        for (int i = 0; i < number; i++) {
            answer += sum;
            System.out.print(answer + ", ");
        }
    }
}
