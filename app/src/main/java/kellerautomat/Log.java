package kellerautomat;

public class Log {
    private static String ANSI_RESET = "\u001B[0m";
    private static String ANSI_RED_BACKGROUND = "\u001B[101m";
    private static String ANSI_BLACK_FOREGROUND = "\u001B[30m";
    private static String ANSI_WHITE_BACKGROUND = "\u001B[107m";
    private static String ANSI_GREY_FOREGROUND = "\u001B[90m";
    private static String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    private static String ANSI_GREEN_BACKGROUND = "\u001B[102m";

    public static void red(String text){
        System.out.print(ANSI_RED_BACKGROUND + ANSI_BLACK_FOREGROUND + text + ANSI_RESET);
    }

    public static void white(String text){
        System.out.print(ANSI_WHITE_BACKGROUND + ANSI_GREY_FOREGROUND+ text + ANSI_RESET);
    }

    public static void yellow(String text){
        System.out.print(ANSI_YELLOW_BACKGROUND + ANSI_BLACK_FOREGROUND + text + ANSI_RESET);
    }

    public static void green(String text){
        System.out.print(ANSI_BLACK_FOREGROUND + ANSI_GREEN_BACKGROUND+ text + ANSI_RESET);
    }

    public static void standard(String  string){
        System.out.print(string);
    }
}
