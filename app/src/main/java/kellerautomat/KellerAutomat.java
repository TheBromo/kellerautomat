package kellerautomat;


import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Stack;

public class KellerAutomat {
    public int calculate(String input) throws RuntimeException, EmptyStackException {

        if (input.isEmpty()) {
            throw new IllegalArgumentException("string is empty");
        }
        List<Symbol> tokens = Arrays.stream(input.split("\\s")).map(Symbol::parseSymbol).toList();
        var stack = new Stack<Symbol>(); //TODO create own stack

        for (Symbol a : tokens) {
            if (a.isNumber()) {
                stack.push(a);
            }
            if (a.isOperator()) {
                var right = stack.pop();
                var left = stack.pop();
                int t = ((Operator) a).calculate(((Number)left).getValue(),((Number)right).getValue());
                stack.push(new Number(t));
            }
        }
        return ((Number)stack.pop()).getValue();
    }

}
