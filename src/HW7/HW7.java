package HW7;

import java.util.Arrays;
import java.util.Scanner;

public class HW7 extends ArrayService{


    public static void main(String[] args) {
        ArrayService test = new ArrayService();
        test.add("1v");
        System.out.println(Arrays.toString(test.array) + " " + test.counter);
        test.add("2v");
        test.add("3v");
        test.add("4v");
        test.add("5v");
        test.add("6v");
        test.add("7v");
        test.add("8v");
        System.out.println(Arrays.toString(test.array) + " " + test.counter);
        test.delete("100v");
        System.out.println(Arrays.toString(test.array) + " " + test.counter);
        test.add("tutu");
        System.out.println(Arrays.toString(test.array) + " " + test.counter);
        test.delete("popo");
        System.out.println(Arrays.toString(test.array) + " " + test.counter);

    }
}
