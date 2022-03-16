package HW13;

public class Capcha{
private static String[][] mainArray;
private static final String num = "0";
private static final String ROW_SPACES = "     ";

private static String[][] getArrayOfNumber(char aDigit) {
        switch (aDigit) {
        case '0':
        return new String[][]{{" ", num, num, " "}, {num, " ", " ", num}, {num, " ", " ", num}, {num, " ", " ", num}, {num, " ", " ", num}, {" ", num, num, " "}};
        case '1':
        return new String[][]{{" ", " ", " ", num}, {" ", num, " ", num}, {num, " ", " ", num}, {" ", " ", " ", num}, {" ", " ", " ", num}, {" ", " ", " ", num}};
        case '2':
        return new String[][]{{" ", num, num, " "}, {num, " ", " ", num}, {" ", " ", num, " "}, {" ", num, " ", " "}, {num, " ", " ", " "}, {num, num, num, num}};
        case '3':
        return new String[][]{{" ", num, num, " "}, {num, " ", " ", num}, {" ", " ", num, " "}, {" ", " ", " ", num}, {num, " ", " ", num}, {" ", num, num, " "}};
        case '4':
        return new String[][]{{num, " ", " ", num}, {num, " ", " ", num}, {" ", num, num, num}, {" ", " ", " ", num}, {" ", " ", " ", num}, {" ", " ", " ", num}};
        case '5':
        return new String[][]{{num, num, num, num}, {num, " ", " ", " "}, {num, num, num, " "}, {" ", " ", " ", num}, {num, " ", " ", num}, {" ", num, num, " "}};
        case '6':
        return new String[][]{{num, num, num, " "}, {num, " ", " ", " "}, {num, num, num, " "}, {num, " ", " ", num}, {num, " ", " ", num}, {" ", num, num, " "}};
        case '7':
        return new String[][]{{num, num, num, num}, {" ", " ", " ", num}, {" ", " ", " ", num}, {" ", " ", " ", num}, {" ", " ", " ", num}, {" ", " ", " ", num}};
        case '8':
        return new String[][]{{" ", num, num, " "}, {num, " ", " ", num}, {" ", " ", num, " "}, {num, " ", " ", num}, {num, " ", " ", num}, {" ", num, num, " "}};
        case '9':
        return new String[][]{{" ", num, num, num}, {num, " ", " ", num}, {" ", num, num, num}, {" ", " ", " ", num}, {num, " ", " ", num}, {" ", num, num, " "}};
default:
        return null;
        }
        }

public static void printNumbers(String str) {
        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
        joinArrays(getArrayOfNumber(arr[i]));
        }

        for (int i = 0; i < mainArray.length; i++) {
        for (int j = 0; j < mainArray[i].length; j++) {
        System.out.print(mainArray[i][j] + "");
        if ((j + 1) % 4 == 0) {
        System.out.print(ROW_SPACES);
        }
        }
        System.out.println("");
        }

        mainArray = null;
        }

private static void joinArrays(String[][] arrayToJoin) {
        if (mainArray == null) {
        mainArray = arrayToJoin;
        } else {
        for (int i = 0; i < mainArray.length; i++) {
        String[] cArr = new String[mainArray[i].length + arrayToJoin[i].length];
        System.arraycopy(mainArray[i], 0, cArr, 0, mainArray[i].length);
        System.arraycopy(arrayToJoin[i], 0, cArr, mainArray[i].length, arrayToJoin[i].length);
        mainArray[i] = cArr;
        }
        }
        }
        }