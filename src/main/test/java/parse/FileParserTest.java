package parse;

import elementarytasks.fileparser.FileParser;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FileParserTest {

    private StringBuffer strForParse;
    private FileParser fileParser;

    @Before
    public void setUp() throws Exception {
        fileParser = new FileParser();
    }

    @Test
    public void countStringTest() {
        strForParse = new StringBuffer("Hello World, Ho Hoho h Hh H!");
        String search = "H";
        int expected = 5;
        int actual = fileParser.countString(strForParse, search);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void countStringTestNull() {
        strForParse = new StringBuffer("");
        String search = "a";

        int expected = 0;
        int actual = fileParser.countString(strForParse, search);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void searchReplace() {
        strForParse = new StringBuffer("Hello World, Ho Hoho h Hh H!");
        String search = "H";
        String replace = "666";
        String expected = "666ello World, 666o 666oho h 666h 666!";
        StringBuffer actual = fileParser.searchReplace(strForParse, search, replace);

        Assert.assertEquals(expected, actual.toString());
    }

    @After
    public void tearDown() {
        strForParse = null;
    }
}