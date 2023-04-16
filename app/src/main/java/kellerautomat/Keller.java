package kellerautomat;

import java.util.EmptyStackException;

public class Keller {

    int[] data;

    public Keller() {
        data = new int[0];
    }

    public int push(int item) {
        var old = data;
        data = new int[old.length + 1];
        data[0] = item;

        for (int i = 0; i < old.length; i++) {
            data[i + 1] = old[i];
        }

        return data[0];
    }

    public int pop() {
        if (data.length == 0) {
            throw new EmptyStackException();
        }

        int result = data[0];
        var old = data;
        int newLength = old.length - 1;

        if (newLength > 0) {
            data = new int[newLength];
            for (int i = 0; i < newLength; i++) {
                data[i] = old[i + 1];
            }
        } else  {
            data = new int[0];
        }

        return result;
    }

    public int[] getData() {
        return data;
    }
}
