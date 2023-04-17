package kellerautomat;

import java.util.List;

public class Laufmodus implements Modes {

    final char[] tokens;

    public Laufmodus(char[] tokens) {
        this.tokens = tokens;
    }

    @Override
    public int doCalculation() {
        var kellerautomat = new KellerAutomat();
        for (char token : tokens) {
            kellerautomat.doStep(token);
        }
        return kellerautomat.getResult();
    }
}
