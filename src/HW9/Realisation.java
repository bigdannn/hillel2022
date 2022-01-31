package HW9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

public class Realisation {
    public static void main(String[] args) {
        String [] s =  {"Vova", "Biba", "Boba"};
        MyLinkList<String> list = new MyLinkList<String>();
        list.add("Pavel");
        list.add("Samvel");
        list.add("Sasha");
        list.printLinkList();
        System.out.println(list.contains("Samvel"));;
        list.delete(1);
        list.addAll(s);
        list.printLinkList();


    }
}
