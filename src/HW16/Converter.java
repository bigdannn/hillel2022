package HW16;

import HW16.utils.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Converter {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi? What do you want to convert? JSON to YAML(write 1), or YAML to JSON(write 2)");
        String answer = sc.nextLine();
        while(!(FileUtils.check(Double.parseDouble(answer)))){
            System.out.println("Please, write correct answer.");
            answer = sc.nextLine();
        }

        System.out.println("Now write down path to file, wich you want to convert.");
        String path2 = sc.nextLine();
        while(!(FileUtils.checkIn(path2))){
            System.out.println("Please, write down correct path.");
            path2 = sc.nextLine();
        }

        System.out.println("One more thing. Write down path to directory, where you want to create file, please.");
        String path4file = sc.nextLine();
        while(!(FileUtils.checkIn(path4file))){
            System.out.println("Please, write down correct path.");
            path4file = sc.nextLine();
        }

        FileUtils.answers(Integer.parseInt(answer), path2, path4file);

    }
}
