package kellerautomat;


import java.util.EmptyStackException;

public class KellerAutomat {
    static final char multiply = '*';
    static final char addition = '+';
    Keller stack = new Keller();

    public int[] doStep(char current) throws EmptyStackException {
        if (Character.isDigit(current)) {
            int value = Character.getNumericValue(current);
            stack.push(value);
        }else if (current == multiply || current == addition) {
            int right = stack.pop();
            int left = stack.pop();
            int t = calculate(current, left, right);
            stack.push(t);
        }
        return stack.getData();
    }

    private int calculate(char operator, int left, int right) {
        if (operator == multiply) {
            return left * right;
        } else {
            return left + right;
        }
    }

    int getResult() {
        return stack.pop();
    }

}
