package HW7;

import java.util.Arrays;

public class ArrayService {

    public String[] array = new String[10];

    //добавляем значение последнему пустому элементу массива.
    public boolean add(String value) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == null) {
                array[i] = value;
                break;
            }
        }
        if (array[array.length - 2] != null) {
            array = incrSize(array);
        }
        return true;
    }

    //вставляем значение по индексу.
    public boolean add(int index, String value) {
        if (index > array.length - 1) {
            array = incrSize(array);
            array[index] = value;
            return true;
        } else if (index >= 0 && index < array.length - 1) {
            for (int i = array.length - 1; i > index; i--) {
                if (array[i] != null) {
                    array[i + 1] = array[i];
                }
            }
            String temporary = array[index];
            array[index] = value;
            array[index + 1] = temporary;
            return true;
        } else {
            return false;
        }
    }

    //увеличиваем размер массива.
    public String[] incrSize(String[] array) {
        String[] newArr = new String[array.length * 2];
        newArr = Arrays.copyOf(array, array.length * 2);
        return newArr;
    }

    //удаляем значение по индексу.
    public boolean delete(int index) {
        array[index] = null;
        for (int i = index; i < array.length-2; i++) {
            array[i] = array[i+1];
        }
        return true;
    }

    //Меняем значение подследнего записанного объекта.
    public boolean delete(String value){
        for (int i = array.length-1; i >=0 ; i--) {
            if (array[i] != null){
                array[i] = value;
                break;
            }
        }
        return true;
    }

    public String get(int index){
        String value = array[index];
        return value;
    }

}
