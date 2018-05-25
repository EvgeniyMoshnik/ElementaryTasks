import elementarytasks.sequence.Sequence;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SequenceTest {

   private Sequence sequence;
   private List<Integer> expected;

    @Before
    public void setUp() {
        sequence = new Sequence(40);
        expected = new ArrayList<>();
    }

    @Test
    public void getSequence() {
        for (int i = 1; i <= 6; i++) {
            expected.add(i);
        }

        List<Integer> actual = sequence.getSequence();
        Assert.assertEquals(expected, actual);
    }

    @After
    public void tearDown() throws Exception {
        expected.clear();
    }
}