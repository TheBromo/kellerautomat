package kellerautomat;

public class Stepmodus implements Modes {

    final char[] tokens;

    public Stepmodus(char[] tokens) {
        this.tokens = tokens;
    }

    @Override
    public int doCalculation() {

        var kellerautomat = new KellerAutomat();

        for (int i = 0; i < tokens.length; i++) {
            printSeparator();
            printStack(kellerautomat.doStep(tokens[i]));
            printInstructionProgress(tokens, i);
            System.out.println();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


        return kellerautomat.getResult();
    }

    private void printSeparator() {
        Log.standard("\n\n\n\n");
    }

    private void printInstructionProgress(char[] tokens, int i) {
        for (int j = 0; j < tokens.length; j++) {
            if (j == i) {
                Log.red(String.valueOf(tokens[j]));
                Log.white(" ");
            } else {
                Log.white(tokens[j] + " ");
            }
        }
        Log.standard("\n");
        for (int j = 0; j < tokens.length; j++) {
            if (j == i) {
                Log.red("^" );
                Log.white(" ");
            } else {
                Log.white("  ");
            }
        }
    }


    private void printStack(int[] stackCopy) {
        Log.standard("-> ");

        for (int j : stackCopy) {
            Log.yellow(j + "|");
        }
        Log.standard("\n");
    }
}