package center.kit.app.classwork.lesson5;

import org.junit.Assert;
import org.junit.Test;

public class MathFuncTest {
    @Test
    public void multiplyTest() {

        int a = 3, b = 6, expRes = 18;
        MathFunc mf = new MathFunc();
        int actualRes = mf.multiply(a, b);
        Assert.assertEquals(expRes, actualRes);

        //Assert.assertEquals(expRes, MathFunc.multiply(a, b)); //if you have static class
    }

    @Test
    public void integerDivisionTest(){

        int a = 10, b = 2, expRes = 5;
        MathFunc mf = new MathFunc();
        int actRes = mf.integerDivision(a, b);
        Assert.assertEquals(expRes, actRes);

    }


}
