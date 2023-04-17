package kellerautomat;

public interface Modes {
    String ANSI_RESET = "\u001B[0m";
    String ANSI_RED_BACKGROUND = "\u001B[101m";
    String ANSI_WHITE_FOREGROUND = "\u001B[30m";
    int doCalculation();
    
}
