import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Rita on 2016.11.21..
 */
public class WorkshopFibonacciTest {
    @Test
    public void fibonacci() throws Exception {
    assertEquals(377, WorkshopFibonacci.fibonacci(14));
    }

    @Test
    public void fibonacciNull() throws Exception {
        assertEquals(0, WorkshopFibonacci.fibonacci(1));
    }

    @Test
    public void fibonacciNegative() throws Exception {
        assertEquals(-8, WorkshopFibonacci.fibonacci(2));
    }


}