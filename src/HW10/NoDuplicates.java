package HW10;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

public class NoDuplicates {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();

        arr.add("Borya");
        arr.add("Nikita");
        arr.add("Samvel");
        arr.add("Nikita");
        System.out.println(arr);
        noDublicate(arr);
        System.out.println(arr);
    }

    public static Collection noDublicate(Collection col){
        HashSet<Object> list = new HashSet<>(col);
        col.clear();
        col.addAll(list);
        return col;
    }
}
