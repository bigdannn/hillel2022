package HW12;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AverageMean {


    public static Double getAverageValue(List<Integer> list){
        return list.stream().mapToInt(l -> l).average().orElse(Double.NaN);
    }

    public static List<Pair> getToUppercase(List<String> list){
        List<Pair> pairs = new ArrayList<>();
        list.stream().forEach(str -> pairs.add(new Pair(str, str.toUpperCase())));
        return pairs;
    }

    public static List<String> getStingValues(List<String> list) {
        Predicate<String> isLowerCase = str -> str.equals(str.toLowerCase());
        Predicate<String> isFourSymbols = str -> (str.length() == 4);

        return list.stream()
                .filter(isLowerCase.and(isFourSymbols))
                .collect(Collectors.toList());
    }
}
