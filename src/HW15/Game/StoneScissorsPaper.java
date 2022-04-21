package HW15.Game;

import HW15.participants.Computer;
import HW15.participants.Player;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

import static HW15.utils.Announce.announce;
import static HW15.utils.Checking.check;
import static HW15.utils.Checking.checkIn;
import static HW15.utils.LanguageChoice.choice;
import static HW15.utils.WinOrLose.winOrLose;
import static HW15.utils.Winner.winner;

public class StoneScissorsPaper {


    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);

        Locale.setDefault(new Locale("uk","UA"));

        System.out.println("Hello! Which language would you prefer? 1 - Ukrainian, 2 - English, 3 - Germany.");
        int answer = sc.nextInt();
        Locale loc = choice(answer);
        ResourceBundle bundle = ResourceBundle.getBundle("Localization",loc);

        System.out.println(bundle.getString("name"));
        String playerName = "";
        while(playerName.equals("")){
            playerName = sc.nextLine();}
        Player player = new Player(playerName);
        Computer computer = new Computer();

        System.out.println(bundle.getString("games"));
        String numberOfGames = sc.nextLine();

        boolean gameOrNo = check(Double.parseDouble(numberOfGames));
        while (!(gameOrNo)) {
            System.out.println(bundle.getString("wrongNumber"));
            numberOfGames = sc.nextLine();
            gameOrNo = check(Double.parseDouble(numberOfGames));
        }
        int games = Integer.parseInt(numberOfGames);
        int counter = 0;
        String bid = " ";

        while (bid.equalsIgnoreCase("Q") || games > counter) {
            System.out.println(bundle.getString("bid"));
            bid = sc.nextLine().toUpperCase();
            switch (bid) {
                case "S":
                case "P":
                case "SS":
                    int wOL = winOrLose(bid);
                    announce(wOL, loc);
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
                    System.out.println(bundle.getString("unknownBid"));
            }

        }

        System.out.println(bundle.getString("pathForResults"));

        String path = sc.nextLine() + "/results.txt";

        while(!(checkIn(path))){
            System.out.println(bundle.getString("incorrectPath"));
            path = sc.nextLine() + "/results.txt";
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
        System.out.println(bundle.getString("checkResults"));
    }

}