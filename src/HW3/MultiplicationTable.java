package HW3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Необходимо вывести на экран таблицу умножения на Х: (любое число вводимое из консоли)

public class MultiplicationTable {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите интересующие вас число");
        int x = Integer.parseInt(reader.readLine());

        for (int i = 0; i <= 10; i++) {
            int answer = x*i;
            System.out.println(x + " * " + i + " = " + answer);
        }
    }
}
