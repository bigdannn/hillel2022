package HW12;

import java.util.List;

public class Realisation {
    public static void main(String[] args) {
        List<Integer> ints = List.of(105,7,23,67,53,7,35,86,34,76);
        List<String> upper = List.of("one", "two", "three");
        List<String> check = List.of("пупа","Лупа");

        System.out.println(AverageMean.getAverageValue(ints));
        System.out.println(AverageMean.getToUppercase(upper));
        System.out.println(AverageMean.getStingValues(check));
    }
}
