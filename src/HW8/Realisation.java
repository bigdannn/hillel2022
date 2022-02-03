package HW8;

import java.util.Arrays;
import java.util.Collection;

public class Realisation {
    public static void main(String[] args) {

        ArrayService test = new ArrayService();
        Person person = new Person("Stepan", 19);
        Person person1 = new Person("Petr", 21);
        Person person3 = new Person("Petr", 21);
        Person person4 = new Person("Samvel", 25);
        test.add(person);
        test.printArray();
        test.add(0,person1);
        test.add(person4);
        test.add(person3);
        test.delete(person1);
        test.printArray();

    }


}
