package center.kit.app.homework.lesson7;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)

public class DataDrivenTestsPracticeTest {
    @Test
    @FileParameters(value = "src/test/resources/isSameStringTestData.csv", mapper = CsvWithHeaderMapper.class)
    public void isSameStringTest(String s1, String s2, boolean expRes) {
        Assert.assertEquals(expRes, DataDrivenTestsPractice.isSameString(s1, s2));
    }

    @Test
    @FileParameters(value = "src/test/resources/isSameStringIgnoreCaseTestData.csv", mapper = CsvWithHeaderMapper.class)
    public void isSameStringIgnoreCaseTest(String s, String s2, boolean expRes) {
        Assert.assertEquals(expRes, DataDrivenTestsPractice.isSameStringIgnoreCase(s, s2));
    }

    @Test
    @FileParameters(value = "src/test/resources/returnIndexOfCharTestData.csv", mapper = CsvWithHeaderMapper.class)
    public void returnIndexOfCharTest(String s, char ch, int expRes) {
        Assert.assertEquals(expRes, DataDrivenTestsPractice.returnIndexOfChar(s, ch));
    }

    @Test
    @FileParameters(value = "src/test/resources/returnIndexOfCharAfterIndexTestData.csv", mapper = CsvWithHeaderMapper.class)
    public void returnIndexOfCharAfterIndex(String s, char ch, int index, int expRes) {
        Assert.assertEquals(expRes, DataDrivenTestsPractice.returnIndexOfCharAfterIndex(s, ch, index));
    }

    @Test
    @FileParameters(value = "src/test/resources/isYourStringEmptyTestData.csv", mapper = CsvWithHeaderMapper.class)
    public void isYourStringEmptyTest(String s, boolean expRes) {
        Assert.assertEquals(expRes, DataDrivenTestsPractice.isYourStringEmpty(s));
    }

    @Test
    @FileParameters(value = "src/test/resources/lastIndexOfCharTestData.csv", mapper = CsvWithHeaderMapper.class)
    public void lastIndexOfChar(String s, char ch, int expRes) {
        Assert.assertEquals(expRes, DataDrivenTestsPractice.lastIndexOfChar(s, ch));
    }

    @Test
    @FileParameters(value = "src/test/resources/concatStringsTestData.csv", mapper = CsvWithHeaderMapper.class)
    public void concatStringsTest(String s, String s2, String expRes) {
        Assert.assertEquals(expRes, DataDrivenTestsPractice.concatStrings(s, s2));
    }

    @Test
    @FileParameters(value = "src/test/resources/countNumberOfCharTestData.csv", mapper = CsvWithHeaderMapper.class)
    public void countNumberOfChar(String s, char ch, int expRes) {
        Assert.assertEquals(expRes, DataDrivenTestsPractice.countNumberOfChar(s, ch));
    }

    @Test
    @FileParameters(value = "src/test/resources/isStringContainCharTestData.csv", mapper = CsvWithHeaderMapper.class)
    public void isStringContainChar(String s, char ch, boolean expRes) {
        Assert.assertEquals(expRes, DataDrivenTestsPractice.isStringContainChar(s, ch));
    }

    @Test
    @FileParameters(value = "src/test/resources/trimSpacesTestData.csv", mapper = CsvWithHeaderMapper.class)
    public void trimSpaces(String s, int expRes) {
        Assert.assertEquals(expRes, DataDrivenTestsPractice.trimSpaces(s));
    }
}
