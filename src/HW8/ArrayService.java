package HW8;

import java.util.Arrays;

public class ArrayService implements Managable {


    public Object[] array = new Object[10];
    int counter = 0;

    @Override
    public boolean add(Object o) {
        array[counter] = o;
        if (array[array.length - 2] != null) {
            array = incrSize(array);
        }
        counter++;
        return true;
    }

    @Override
    public boolean add(int index, Object o) {
        if (index > array.length - 1) {
            array = incrSize(array);
            array[counter] = o;
            counter++;
            return true;
        } else if (index >= 0 && index < array.length - 1) {
            for (int i = counter; i > index; i--) {
                array[i + 1] = array[i];
            }
            Object temp = array[index];
            array[index] = o;
            array[index + 1] = temp;
            counter++;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean delete(Object o) {
        for (int i = 0; i < counter; i++) {
            if(o.equals(array[i])){
                for (int j = i; j < counter; j++) {
                    array[j] = array[j+1];
                }
            }
        }
        counter--;
        return true;
    }

    @Override
    public Object get(int index) {
        if(index < 0){
            return "Индекс не может быть отрицательным.";
        } else if(index > 0 && index < counter) {
            Object value = array[index];
            return value;
        } else {
            return "В этой ячейке пока ничего нет.";
        }
    }

    @Override
    public boolean contain(Object o) {
        for (int i = 0; i < counter; i++) {
            if(o.equals(array[i])){
                System.out.println("Коллекция содержит данный объект. Он находится под номером " + counter + "(учти, что отсчет индекса с 0). ");
                return true;
            } else{
                System.out.println("Извините, в коллекции нет такого объекта.");
            }
        }
        return true;
    }

    @Override
    public boolean equals(Object[] str) {
        if (Arrays.equals(str, array)){
            System.out.println("Коллекции одинаковые.");
            return true;
        }else {
            System.out.println("Коллекции НЕ одинаковые.");
            return false;
        }
    }

    @Override
    public boolean clear() {
        Arrays.fill(array, null);
        return true;
    }

    @Override
    public int size() {
        return counter;
    }
    private Object[] incrSize(Object[] array) {
        Object[] newArr = new Object[array.length * 2];
        newArr = Arrays.copyOf(array, array.length * 2);
        return newArr;
    }
}
