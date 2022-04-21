package HW15.utils;

import java.util.Locale;
import java.util.Scanner;

public class LanguageChoice {
    public static Locale choice(int op){

        if (op == 1){
            return new Locale("uk_UA");
        } else if (op == 2){
            return new Locale("eng");
        } else if(op == 3){
            return new Locale("de");
        } else {
            System.out.println("Sorry, we don't have such option. Try again.");
            Scanner sc = new Scanner(System.in);
            int anotherTry = sc.nextInt();
            choice(anotherTry);
            return null;
        }
    }
}
