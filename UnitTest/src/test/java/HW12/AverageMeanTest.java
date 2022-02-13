package HW12;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class AverageMeanTest {
    @Test
    void getAverageValuePositive() {
        List<Integer> list = Arrays.asList(1, 2, 3);
        assertEquals(2.0, AverageMean.getAverageValue(list), "Среднее значение не совпало с ожидаемым");
    }

    @Test
    void getAverageValueNegative() {
        List<Integer> list = Arrays.asList(1, 2, 3);
        assertNotEquals(false, AverageMean.getAverageValue(list) == 2.0, "Среднее значение не совпало с ожидаемым");
    }


    @RepeatedTest(10)
    void getUpperCasePairsPositive() {
        List<String> list1 = Arrays.asList("one", "two", "three");
        List<Pair> myPairsList = new ArrayList<>();
        myPairsList.add(new Pair("one", "ONE"));
        myPairsList.add(new Pair("two", "TWO"));
        myPairsList.add(new Pair("three", "THREE"));

        assertEquals(myPairsList.toString(), AverageMean.getToUppercase(list1).toString(), "List<Pair> получен неверно");
    }

    @RepeatedTest(10)
    void getUpperCasePairsNegative() {
        List<String> list1 = Arrays.asList("one", "two", "three");
        List<Pair> myPairsList = new ArrayList<>();
        myPairsList.add(new Pair("one", "ONE"));
        myPairsList.add(new Pair("two", "TWO"));
        myPairsList.add(new Pair("three", "THREE"));

        assertNotEquals(false, myPairsList.toString().equals(AverageMean.getToUppercase(list1).toString()), "List<Pair> получен неверно");
    }

    @Test
    void getStingValuesPositive() {
        List<String> list2 = Arrays.asList("пупа", "Лупа");
        List<String> list = Arrays.asList("пупа");
        assertEquals(true, list.toString().equals(AverageMean.getStingValues(list2).toString()), "получено неверное значение");
    }

    @Test
    void getStingValuesNegative() {
        List<String> list2 = Arrays.asList("пупа", "Лупа", "...");
        List<String> list = Arrays.asList("пупа");
        assertNotEquals(false, list.toString().equals(AverageMean.getStingValues(list2).toString()), "получено неверное значение");
    }
}
