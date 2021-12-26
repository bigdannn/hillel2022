package HW3;

public class CyclesDowhile {
    public static void main(String[] args) {

        int number = 100;
        int counter = 0;

        do {
            if (!(counter % 2 == 0)) {
                System.out.println(counter);
            }
            counter++;
        } while (number > counter);
    }
}
