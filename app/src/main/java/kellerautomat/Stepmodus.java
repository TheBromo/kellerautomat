package kellerautomat;

public class Stepmodus implements Modes {

    final char[] tokens;

    public Stepmodus(char[] tokens) {
        this.tokens = tokens;
    }

    @Override
    public int doCalculation() {

        var kellerautomat = new KellerAutomat();
        try {
            for (int i = 0; i < tokens.length; i++) {
                System.out.println("===================================================");
                printInstructionProgress(tokens, i);
                printStack(kellerautomat.doStep(tokens[i]));
                System.out.println("===================================================");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.err.println("incorrect format: " + e);
        }

        return kellerautomat.getResult();
    }

    private void printInstructionProgress(char[] tokens, int i) {
        for (int j = 0; j < tokens.length ; j++) {
            if (j == i){
                System.out.print(ANSI_RED_BACKGROUND + ANSI_WHITE_FOREGROUND + tokens[j] + ANSI_RESET);

            }else{
                System.out.print(tokens[j] + " ");
            }
        }
        System.out.println();
        for (int j = 0; j < i; j++) {
            System.out.print("  ");
        }
        System.out.println(ANSI_RED_BACKGROUND + ANSI_WHITE_FOREGROUND + "^" + ANSI_RESET);
    }


    private void printStack(int[] stackCopy) {
        System.out.print("Stack:\n > ");

        for (int i = 0; i < stackCopy.length; i++) {
            System.out.print(stackCopy[i] + "|");
        }
        System.out.print("\n");
    }
}