package HW12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AverageMean {

    //1 - Имеется коллекция из Integes, использую стримы посчитать среденее значения всех чисел
    //2 - Имеется коллекция из String, привести все стринги в UPPERCASE и вернуть коллекцию List<Pair>
    //in: "one", "two", ...
    //out: {"one":"ONE"}, {"two", "TWO"}, ...
    //3 - Имеется коллекция из String, отфильтровать и вывести на экран все значения, которые написаны в loverCase and length = 4

    public static Double getAverageValue(List <Integer> list){
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
