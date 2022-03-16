package HW15;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StoneScissorsPaper {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your Name.");
        Player player = new Player(sc.nextLine());
        Computer computer = new Computer();

        System.out.println("How much games do you want to play?");
        String numberOfGames = sc.nextLine();

        boolean gameOrNo = check(Double.parseDouble(numberOfGames));
        while (!(gameOrNo)) {
            System.out.println("Please enter a positive integer number.");
            numberOfGames = sc.nextLine();
            gameOrNo = check(Double.parseDouble(numberOfGames));
        }
        int games = Integer.parseInt(numberOfGames);
        int counter = 0;
        String bid = " ";

        while (bid.equalsIgnoreCase("Q") || games > counter) {
            System.out.println("Make a bid: SS - for scissors, P - for paper, S - for stone, Q - to quit the game.");
            bid = sc.nextLine().toUpperCase();
            switch (bid) {
                case "S":
                case "P":
                case "SS":
                    int wOL = winOrLose(bid);
                    announce(wOL);
                    counter++;
                    if (wOL > 0) {
                        player.setWins(player.getWins() + 1);
                        computer.setLoses(computer.getLoses() + 1);
                    } else if (wOL < 0) {
                        player.setLoses(player.getLoses() + 1);
                        computer.setWins(computer.getWins() + 1);
                    } else {
                        player.setDraws(player.getDraws() + 1);
                        computer.setDraws(computer.getDraws() + 1);
                    }
                    break;
                case "Q":
                    System.exit(-1);
                    break;
                default:
                    System.out.println("Unknown bid. Please repeat.");
            }

        }

        System.out.println("Where do you want to save your results? Paste the path, please.");


        String path = sc.nextLine() + "results.txt";

        while(!(checkIn(path))){
            System.out.println("Please, write down correct path.");
            path = sc.nextLine() + "results.txt";
        }

        String wnr = winner(counter, player.getWins(), computer.getWins());

        OutputStream output = new FileOutputStream(path, true);
        if (!(Files.exists(Path.of(path)))) {
            Path results = Files.createFile(Path.of(path));
        } else {
            output.write(" \n ".getBytes(StandardCharsets.UTF_8));
            output.write(player.toString().getBytes(StandardCharsets.UTF_8));
            output.write(" \n ".getBytes(StandardCharsets.UTF_8));
            output.write(computer.toString().getBytes(StandardCharsets.UTF_8));
            output.write(" \n ".getBytes(StandardCharsets.UTF_8));
            output.write(wnr.getBytes(StandardCharsets.UTF_8));
            output.write(" \n ".getBytes(StandardCharsets.UTF_8));
        }
        System.out.println("Now you can check your results in a file located on the path you specified. Thank you for a game and see you soon!");
    }

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

    public static void announce(int value) {
        if (value > 0) {
            System.out.println("You win.");
        } else if (value < 0) {
            System.out.println("Computer win.");
        } else {
            System.out.println("Draw.");
        }
    }


    public static boolean check(double number) {
        if ((number % 1) == 0 && number > 0) {
            return true;
        } else {
            return false;
        }
    }

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
    public static boolean checkIn(String str){
        if (Path.of(str).isAbsolute()){
            return true;
        } else {return false;}
    }
}