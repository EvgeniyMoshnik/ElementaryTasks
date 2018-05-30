import elementarytasks.Parameter;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ParameterTest {


    @Test
    public void parseParamsTest() {
        String params = "Text.txt,33,5345,Hello";
        ArrayList<String> expected = new ArrayList<>();
        expected.add("Text.txt");
        expected.add("33");
        expected.add("5345");
        expected.add("Hello");
        ArrayList<String> actual = Parameter.parseParams(params);

        Assert.assertEquals(expected, actual);
    }
}