package HW15.utils;

import java.util.Locale;
import java.util.ResourceBundle;

public class Announce {
    public static void announce(int value, Locale loc ){

        ResourceBundle bundle = ResourceBundle.getBundle("Localization",loc);

        if (value > 0) {
            System.out.println(bundle.getString("uWin"));
        } else if (value < 0) {
            System.out.println(bundle.getString("cWin"));
        } else {
            System.out.println(bundle.getString("draw"));
        }
    }
}
