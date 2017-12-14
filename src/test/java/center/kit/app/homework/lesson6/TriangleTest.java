package center.kit.app.homework.lesson6;

import center.kit.app.classwork.lesson5.Triangle;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)

public class TriangleTest {
    @Test
    @FileParameters(value = "src/test/resources/TriangleTestData.csv", mapper = CsvWithHeaderMapper.class)
    public void isRightAngled(double argA, double argB, double argC, boolean expOut) {
        Assert.assertEquals(expOut, Triangle.isRightAngled(argA, argB, argC));
    }

}
