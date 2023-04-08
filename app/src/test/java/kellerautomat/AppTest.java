/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package kellerautomat;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void testInvalidOperation1() {
        var kellerautomat = new Kellerautomat();
        assertThrows(IllegalArgumentException.class, () -> kellerautomat.calulate("3 4 + *"));
    }

    @Test
    void testInvalidOperation2() {
        var kellerautomat = new Kellerautomat();
        assertThrows(IllegalArgumentException.class, () -> kellerautomat.calulate("8 + 9 + 7 * 2 *"));
    }

    @Test
    void testValidOperation1() {
        var kellerautomat = new Kellerautomat();
        assertEquals(6664,kellerautomat.calulate("3 4 + 6 2 + 8 9 + 4 3 + * * *"));
    }

    @Test
    void testValidOperation2() {
        var kellerautomat = new Kellerautomat();
        assertEquals(58,kellerautomat.calulate("3 4 + 6 2 + 8 9 + 4 3 + * * *"));
    }
}
