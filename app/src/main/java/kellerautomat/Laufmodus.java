package kellerautomat;

import java.util.List;

public class Laufmodus implements Modes {

    final List<Symbol> tokens;

    public Laufmodus(List<Symbol> tokens) {
        this.tokens = tokens;
    }

    @Override
    public int doCalculation() {
        var kellerautomat = new KellerAutomat();
        for (Symbol token : tokens) {
            kellerautomat.doStep(token);
        }
        return kellerautomat.getResult();
    }
}
