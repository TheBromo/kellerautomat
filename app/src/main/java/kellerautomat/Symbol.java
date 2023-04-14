package kellerautomat;

public abstract class Symbol {

    public static Symbol parseSymbol(String s) throws IllegalArgumentException {
        if(s.matches("^\\+|\\*$")){
            return new Operator(s);
        }else if (s.matches("^\\d$")){
            return new Number(s);
        }else {
            throw new IllegalArgumentException("Non recognisable Symbol");
        }
    }


    public boolean isNumber(){
        return this instanceof Number;
    }

    public boolean isOperator(){
        return this instanceof Operator;
    }
}
