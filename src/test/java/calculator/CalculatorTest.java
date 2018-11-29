package calculator;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class CalculatorTest {
//    private int first = 3;
//    private int second = 4;

//    @Test
//    public void canAddTwoNumbers(){
//        Assert.assertEquals(0, new Calculator().add(0, 0));
//    }

    public static final Object[] getData() {
        return new Object[] {
                new Object[] {10, 20},
                new Object[] {30, 40}
        };
    }

    @Test
    @Parameters(method = "getData")
    public void canAddTwoIntegers(int first, int second) {
        Calculator cal = new Calculator();
        Assert.assertEquals(first + second, cal.add(first, second));
    }
}
