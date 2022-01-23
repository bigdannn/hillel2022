package HW7;

import java.util.Arrays;

public class ArrayService {

    int counter = 0;

    public String[] array = new String[10];

    //добавляем значение последнему пустому элементу массива.
    public boolean add(String value) {
        array[counter] = value;
        if (array[array.length - 2] != null) {
            array = incrSize(array);
        }
        counter++;
        return true;
    }

    //вставляем значение по индексу.
    public boolean add(int index, String value) {
        if (index > array.length - 1) {
            array = incrSize(array);
            array[counter] = value;
            counter++;
            return true;
        } else if (index >= 0 && index < array.length - 1) {
            for (int i = counter; i > index; i--) {
                array[i + 1] = array[i];
            }
            String temp = array[index];
            array[index] = value;
            array[index + 1] = temp;
            counter++;
            return true;
        } else {
            return false;
        }
    }

    //увеличиваем размер массива.
    private String[] incrSize(String[] array) {
        String[] newArr = new String[array.length * 2];
        newArr = Arrays.copyOf(array, array.length * 2);
        return newArr;
    }

    //удаляем значение по индексу.
    public boolean delete(int index) {
        array[index] = null;
        for (int i = index; i < counter; i++) {
            array[i] = array[i + 1];
        }
        counter--;
        return true;
    }

    //Меняем значение подследнего записанного объекта.
    public boolean delete(String value) {
        array[counter-1] = value;

        return true;
    }

    public String get(int index) {
        String value = array[index];
        return value;
    }

}
