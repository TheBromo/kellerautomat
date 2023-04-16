package kellerautomat;


import java.util.EmptyStackException;
import java.util.List;
import java.util.Stack;

public class KellerAutomat {

    Stack<Symbol> stack = new Stack<>(); //TODO create own stack
    public List<Symbol> doStep(Symbol current) throws RuntimeException, EmptyStackException {
            if (current.isNumber()) {
                stack.push(current);
            }
            if (current.isOperator()) {
                var right = stack.pop();
                var left = stack.pop();
                int t = ((Operator) current).calculate(((Number)left).getValue(),((Number)right).getValue());
                stack.push(new Number(t));
            }
            return stack.stream().toList();
    }

    int getResult(){
        return ((Number)stack.pop()).getValue();
    }

}
