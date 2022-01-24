package HW8;

import java.util.Arrays;

public class Realisation {
    public static void main(String[] args) {

        ArrayService test = new ArrayService();
        Person person = new Person("Stepan", 19);
        Person person1 = new Person("Petr", 21);
        Person person3 = new Person("Petr", 21);
        test.add(person);
        System.out.println(Arrays.toString(test.array));
        test.add(0,person1);
        System.out.println(Arrays.toString(test.array));
        test.contain(person1);



    }
}
