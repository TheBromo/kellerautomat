package kellerautomat;

import java.util.List;

public class Stepmodus implements Modes {

    final List<Symbol> tokens;

    public Stepmodus(List<Symbol> tokens) {
        this.tokens = tokens;
    }

    @Override
    public int doCalculation() {

        var kellerautomat = new KellerAutomat();
        try {
            for (Symbol token : tokens) {
                System.out.println("===================================================");
                printInstructionProgress(tokens, tokens.indexOf(token));
                printStack(kellerautomat.doStep(token));
                System.out.println("===================================================");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.err.println("incorrect format: " + e);
        }

        return kellerautomat.getResult();
    }

    private void printInstructionProgress(List<Symbol> tokens, int i) {
        for (Symbol symbol : tokens){
            System.out.print(symbol +" ");
        }
        System.out.println();
        for (int j = 0; j < i; j++) {
            System.out.print("  ");
        }
        System.out.println("^");
    }


    private void printStack(List<Symbol> stackCopy) {
        System.out.print("Stack:\n > ");

        for (int i = stackCopy.size() - 1; i >= 0; i--) {
            System.out.print(stackCopy.get(i).toString() + "|");
        }
        System.out.print("\n");
    }
}