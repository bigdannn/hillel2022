package HW16.utils;

import HW16.cprocessor.ConvertToJson;
import HW16.cprocessor.ConvertToYaml;
import org.yaml.snakeyaml.Yaml;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class FileUtils {

    public static boolean check(double number) {
        if ((number % 1) == 0 && number > 0 && number <= 2) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkIn(String str) {
        if (Path.of(str).isAbsolute()) {
            return true;
        } else {
            return false;
        }
    }

    public static void convert2yaml(String path2file, String path4file) throws IOException {
        String str = Files.readString(Path.of(path2file));
        str = ConvertToYaml.convertYamlToJson(str);
        ConvertToYaml.Saver(str, path4file);
    }
    public static void convert2json(String path2file, String path4file) throws IOException {
        String str = Files.readString(Path.of(path2file));
        String string = ConvertToJson.convertYamlToJson(str);
        ConvertToJson.Saver(string, path4file);
    }

    public static void answers(int number, String path2file, String path4file) throws IOException {
        if (number == 1){
            path4file = path4file + "/jsonToyaml.yaml";
            convert2yaml(path2file, path4file);
        } else if (number ==2 ){
            path4file = path4file + "/yamlTojson.json";
            convert2json(path2file, path4file);
        } else {
            System.out.println("Something went wrong. Try again.");
        }
    }
}
