package HW7;

import java.util.Arrays;
import java.util.Scanner;

public class HW7 extends ArrayService{


    public static void main(String[] args) {
        ArrayService test = new ArrayService();
        test.add("1v");
        test.add("2v");
        test.add("3v");
        test.add("4v");
        test.add("5v");
        test.add("6v");
        test.add("7v");
        test.add("8v");
        System.out.println(Arrays.toString(test.array));
        test.add(0, "priv");
        System.out.println(Arrays.toString(test.array));
        test.add(8,"9v");
        System.out.println(Arrays.toString(test.array));
        test.add(9,"10v");
        System.out.println(Arrays.toString(test.array));
        test.add(10,"11v");
        System.out.println(Arrays.toString(test.array));
        test.add(5,"test");
        System.out.println(Arrays.toString(test.array));
        test.delete(0);
        System.out.println(Arrays.toString(test.array));
        test.delete("derf");
        System.out.println(Arrays.toString(test.array));
        System.out.println(test.get(0));;
    }

}
