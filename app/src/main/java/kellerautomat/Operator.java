package kellerautomat;

import java.util.ArrayList;
import java.util.List;

public class Operator extends Symbol {

    boolean multiplyOperator;

    public Operator(String s) {
        multiplyOperator = !s.equals("+");
    }

    public int calculate(int x, int y){
        if (multiplyOperator){
            return x * y;
        }else {
            return x + y;
        }
    }
}
