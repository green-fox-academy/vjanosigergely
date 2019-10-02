import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

    Fibonacci fibonacci = new Fibonacci();

    @Test
    public void fibonacci_atZero() {
        int result = fibonacci.Fibonacci(0);
        int expected = 0;

        assertEquals(expected,result);
    }
    @Test
    public void fibonacci_atOne() {
        int result = fibonacci.Fibonacci(1);
        int expected = 1;

        assertEquals(expected,result);
    }

    @Test
    public void fibonacci_atRandom() {
        int result = fibonacci.Fibonacci(10);
        int expected = 55;

        assertEquals(expected,result);
    }

}