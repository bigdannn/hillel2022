package HW3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Даны переменные x и n вычислить x^n.

public class XnN {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("ВВедите первое число X");
        int x = Integer.parseInt(reader.readLine());

        System.out.println("ВВедите второе число N");
        int n = Integer.parseInt(reader.readLine());

        int answer = x*n;
        System.out.println("x * n = " + answer);

    }
}
