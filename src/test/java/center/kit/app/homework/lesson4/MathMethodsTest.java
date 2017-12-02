package center.kit.app.homework.lesson4;

import center.kit.app.homework.lesson5.MathMetods;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class MathMethodsTest {

    MathMetods mm = new MathMetods();

    @Test
    public void absDoubleTest() {
        double aDouble = -22.121213, expRes = 22.121213;
        Assert.assertEquals(expRes, mm.absDouble(aDouble), 0.0001);
    }

    @Test
    public void absDouble2Test() {
        double aDouble = 0.0005, expRes = 5.0E-4;
        Assert.assertEquals(expRes, mm.absDouble(aDouble), 0.0001);
    }

    @Test
    public void decrementIntTest() {
        int a = 199, expRes = 198;
        Assert.assertEquals(expRes, mm.decrementInt(a));
    }

    @Test
    public void decrement2IntTest() {
        int a = -999, expRes = -1000;
        Assert.assertEquals(expRes, mm.decrementInt(a));
    }

    @Test
    public void hypotViaCathetersTest() {
        double a = 12.001, b = 12.007, expRes = 16.976220132879992788232819691286;
        Assert.assertEquals(expRes, mm.hypotViaCatheters(a, b), 0.0001);
    }

    @Ignore("Not ready yet")
    @Test
    public void remainderOfDivisionTest() {
        double a = 300.00, b = 29.90, expRes = 1.00;
        Assert.assertEquals(expRes, mm.remainderOfDivision(a, b), 0.0001);
    }

    @Test
    public void incrementExactTest() {
        int a = 10099, expRes = 10100;
        Assert.assertEquals(expRes, mm.incrementExact(a));
    }

    @Test
    public void incrementExact2Test() {
        int a = -10099, expRes = -10098;
        Assert.assertEquals(expRes, mm.incrementExact(a));
    }

    @Test
    public void returnMaxValueTest() {
        double a = 1235.65401, b = 2135.16168, expRes = b;
        Assert.assertEquals(expRes, mm.returnMaxValue(a, b), 0.0001);
    }

    @Test
    public void returnMaxValue2Test() {
        double a = 0.0, b = 0.0, expRes = 0;
        Assert.assertEquals(expRes, mm.returnMaxValue(a, b), 0.0001);
    }

    @Test
    public void returnMinValueTest() {
        double a = 1235.65401, b = 2135.16168, expRes = a;
        Assert.assertEquals(expRes, mm.returnMinValue(a, b), 0.0001);
    }

    @Test
    public void returnMinValue2Test() {
        double a = 1235.65401, b = -2135.16168, expRes = b;
        Assert.assertEquals(expRes, mm.returnMinValue(a, b), 0.0001);
    }

    @Test
    public void powValueTest() {
        double a = 145.1313, expRes = 21063.09423969;
        Assert.assertEquals(expRes, mm.powValue(a, 2.00), 0.0001);
    }

    @Test
    public void rintValueTest() {
        double a = 135.51684;
        double expRes = 136;
        Assert.assertEquals(expRes, mm.rintValue(a), 0.0001);
    }

    @Test
    public void rintValue2Test() {
        double a = -999.51684;
        double expRes = -1000;
        Assert.assertEquals(expRes, mm.rintValue(a), 0.0001);
    }

    @Test
    public void returnSqrtTest() {
        double a = 556.15, expRes = 23.582832739092222972683813828989;
        Assert.assertEquals(expRes, mm.returnSqrt(a), 0.0001);
    }

    @Test
    public void returnSqrt2Test() {
        double a = 989.111, expRes = 31.450135134844810392974101861293;
        Assert.assertEquals(expRes, mm.returnSqrt(a), 0.0001);
    }

    @Test
    public void differenceBetweenTest() {
        int a = 1681438, b = 1681386, expRes = 52;
        Assert.assertEquals(expRes, mm.differenceBetween(a, b));
    }

    @Test
    public void differenceBetween2Test() {
        int a = -1681438, b = 1681386, expRes = -3362824;
        Assert.assertEquals(expRes, mm.differenceBetween(a, b));
    }

    @Test
    public void differenceBetween3Test() {
        int a = 0, b = 0, expRes = 0;
        Assert.assertEquals(expRes, mm.differenceBetween(a, b));
    }

}
