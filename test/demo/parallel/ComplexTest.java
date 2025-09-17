package demo.parallel;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ComplexTest {

    private static final double EPS = 1e-9;

    @Test
    public void testMinus() {
        Complex a = new Complex(5, 3);
        Complex b = new Complex(2, 1);

        Complex result = a.minus(b);

        assertEquals(3.0, result.getRe(), EPS);
        assertEquals(2.0, result.getIm(), EPS);
    }

    @Test
    public void testDivide() {
        Complex a = new Complex(4, 2);
        Complex b = new Complex(1, -1);

        Complex result = a.divide(b);

        // ожидаемое значение: (4+2i) / (1-1i) = (1 + 3i)
        assertEquals(1.0, result.getRe(), EPS);
        assertEquals(3.0, result.getIm(), EPS);
    }
}