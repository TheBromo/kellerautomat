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
            System.out.println(x +" * "+ y);
            return x * y;
        }else {
            System.out.println(x +" + "+ y);
            return x + y;
        }
    }

    @Override
    public String toString() {
        if (multiplyOperator){
            return "*";
        }else {
            return "+";
        }
    }
}
