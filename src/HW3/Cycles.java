package HW3;

public class Cycles {
    public static void main(String[] args) {
 // 1)При помощи цикла for вывести на экран нечетные числа от 1 до 99.t
        int number = 100;

        for (int i = 0; i < number; i++) {
            if (!(i % 2 == 0)){
                System.out.println(i);
            }
        }
    }
}
