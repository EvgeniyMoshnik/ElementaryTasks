import elementarytasks.Validator;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ValidatorTest {

    @Test
    public void isSizeTrue() {
        int width = 6;
        int height = 3;
        Assert.assertTrue(Validator.isSize(width, height));
    }

    @Test
    public void isSizeFalse() {
        int width = -3;
        int height = 3;
        Assert.assertFalse(Validator.isSize(width, height));
    }

    @Test
    public void isRangeTrue() {
        int start = 3;
        int end = 60;
        Assert.assertTrue(Validator.isRange(start, end));
    }

    @Test
    public void isRangeFalse() {
        int start = 50;
        int end = 20;
        Assert.assertFalse(Validator.isRange(start, end));
    }

    @Test
    public void isNumberDoubleTrue() {
        Assert.assertTrue(Validator.isNumberDouble("3.5"));
    }

    @Test
    public void isNumberDoubleFalse() {
        Assert.assertFalse(Validator.isNumberDouble("gf"));
    }

    @Test
    public void isNumberIntegerTrue() {
        Assert.assertTrue(Validator.isNumberInteger("66"));
    }

    @Test
    public void isNumberIntegerFalse() {
        Assert.assertFalse(Validator.isNumberInteger("66.5"));
    }


    @Test
    public void isContinueTrue() {
        Assert.assertTrue(Validator.isContinue("YeS"));
    }

    @Test
    public void isContinueFalse() {
        Assert.assertFalse(Validator.isContinue("yep"));
    }

    @Test
    public void isTriangleTrue() {
        Assert.assertTrue(Validator.isTriangle(3,5,6));
    }

    @Test
    public void isTriangleFalse() {
        Assert.assertFalse(Validator.isTriangle(50,5,6));
    }

    @Test
    public void isParamsForTriangleTrue() {
        List<String> params = new ArrayList<>();
        params.add("Triangle");
        params.add("5");
        params.add("6.4");
        params.add("6");

        Assert.assertTrue(Validator.isParamsForTriangle(params));
    }

    @Test
    public void isParamsForTriangleFalse() {
        List<String> params = new ArrayList<>();
        params.add("Triangle");
        params.add("5");
        params.add("s");

        Assert.assertFalse(Validator.isParamsForTriangle(params));
    }

}