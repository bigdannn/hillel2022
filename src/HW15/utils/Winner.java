package HW15.utils;

public class Winner {
    public static String winner(int allGamesPlayed, int yourWins, int computerWins) {
        if ((yourWins - computerWins) > 0) {
            return "Congratulations! You beat computer!";
        } else if ((computerWins - yourWins) > 0) {
            return "You lose. Computer defeated you.";
        } else if ((yourWins - computerWins) == 0) {
            return "It's a draw.";
        } else {
            return " ";
        }
    }
}
