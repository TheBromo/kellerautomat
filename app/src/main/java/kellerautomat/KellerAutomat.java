package kellerautomat;


import java.util.EmptyStackException;

public class KellerAutomat {

    Keller stack = new Keller();

    public int[] doStep(Symbol current) throws EmptyStackException {
        if (current.isNumber()) {
            int value = ((Number) current).getValue();
            stack.push(value);
        }
        if (current.isOperator()) {
            var right = stack.pop();
            var left = stack.pop();
            int t = ((Operator) current).calculate(left, right);
            stack.push(t);
        }
        return stack.getData();
    }

    int getResult() {
        return stack.pop();
    }

}
