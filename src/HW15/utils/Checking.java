package HW15.utils;

import java.nio.file.Path;

public class Checking {
    public static boolean check(double number) {
        if ((number % 1) == 0 && number > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkIn(String str){
        if (Path.of(str).isAbsolute()){
            return true;
        } else {return false;}
    }
}
