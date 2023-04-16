package kellerautomat;

public class Number extends Symbol{
    int value;
    protected Number(String s) {
        value = Integer.parseInt(s);
    }

    public Number(int i){
        this.value = i;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
