package HW15.utils;

public class WinOrLose {
    public static int winOrLose(String bid) {

        int random = (int) (Math.random() * 3);
        String bid1 = switch (random) {
            case 1 -> "SS";
            case 2 -> "S";
            case 3 -> "P";
            default -> " ";
        };
        if (bid.equals("S") && bid1.equals("S")) {
            return 0;
        } else if (bid.equals("P") && bid1.equals("P")) {
            return 0;
        } else if (bid.equals("SS") && bid1.equals("SS")) {
            return 0;
        } else if (bid.equals("S") && bid1.equals("P")) {

            return -1;
        } else if (bid.equals("SS") && bid1.equals("P")) {
            return 1;
        } else if (bid.equals("P") && bid1.equals("S")) {
            return 1;
        } else if (bid.equals("P") && bid1.equals("SS")) {
            return -1;
        } else if (bid.equals("S") && bid1.equals("SS")) {
            return 1;
        } else if (bid.equals("SS") && bid1.equals("S")) {
            return -1;
        } else {
            return -100;
        }
    }
}
