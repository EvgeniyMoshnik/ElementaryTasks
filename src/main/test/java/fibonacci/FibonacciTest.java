package fibonacci;

import elementarytasks.fibonacci.Fibonacci;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FibonacciTest {

   private Fibonacci fibonacci;
   private List<Integer> expected;

    @Before
    public void setUp() {
        fibonacci = new Fibonacci(1, 55);
        expected = new ArrayList<>();
    }

    @Test
    public void getFibonacciNumbTest() {
        expected.add(1);
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(5);
        expected.add(8);
        expected.add(13);
        expected.add(21);
        expected.add(34);
        expected.add(55);

        List<Integer> actual = fibonacci.getFibonacciNumb();
        Assert.assertEquals(expected, actual);
    }

    @After
    public void tearDown() {
        expected.clear();
    }
}