package HW13;

public class Capcha {

    public static void psevdoCode(String str){
        int numbers = Integer.parseInt(str);
        int length = str.length();
        for (int i = 0; i < length; i++) {
        char c = str.charAt(i);

        int output = Character.getNumericValue(c);

        switch(output){
            case 0:
                System.out.println("-@@@-\n" +
                        "@---@\n" +
                        "@---@\n" +
                        "@---@\n" +
                        "@---@\n" +
                        "-@@@-");
                System.out.println();
                break;
            case 1:
                System.out.print("---@-\n" +
                        "--@@-\n" +
                        "-@-@-\n" +
                        "---@-\n" +
                        "---@-\n" +
                        "---@-");
                System.out.println();
                break;
            case 2:
                System.out.println("-@@@-\n" +
                        "@---@\n" +
                        "----@\n" +
                        "--@@-\n" +
                        "-@---\n" +
                        "@@@@@\n" +
                        "-----");
                System.out.println();
                break;
            case 3:
                System.out.println("@@@@@\n" +
                        "----@\n" +
                        "--@@-\n" +
                        "----@\n" +
                        "@---@\n" +
                        "-@@@-");
                System.out.println();
                break;
            case 4:
                System.out.println("--@@@\n" +
                        "-@--@\n" +
                        "@---@\n" +
                        "@@@@@\n" +
                        "----@\n" +
                        "----@");
                System.out.println();
                break;
            case 5:
                System.out.println("@@@@@\n" +
                        "@----\n" +
                        "@@@@-\n" +
                        "----@\n" +
                        "----@\n" +
                        "@@@@-");
                System.out.println();
                break;
            case 6:
                System.out.println("-@@@-\n" +
                        "@---@\n" +
                        "@----\n" +
                        "@@@@-\n" +
                        "@---@\n" +
                        "-@@@-");
                System.out.println();
                break;
            case 7:
                System.out.println("@@@@@\n" +
                        "----@\n" +
                        "---@-\n" +
                        "--@--\n" +
                        "--@--\n" +
                        "--@--");
                System.out.println();
                break;
            case 8:
                System.out.println("-@@@-\n" +
                        "@---@\n" +
                        "-@@@-\n" +
                        "@---@\n" +
                        "@---@\n" +
                        "-@@@-");
                System.out.println();
                break;
            case 9:
                System.out.println("-@@@-\n" +
                        "@---@\n" +
                        "-@@@@\n" +
                        "----@\n" +
                        "@---@\n" +
                        "-@@@-");
                System.out.println();
                break;
            default:
                System.out.println("Ooops, something went wrong...");

        }
        }
    }
}
