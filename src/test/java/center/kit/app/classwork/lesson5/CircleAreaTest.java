package center.kit.app.classwork.lesson5;

import org.junit.Assert;
import org.junit.Test;

public class CircleAreaTest {
   @Test
    public void calculateTest(){
       double radius = 10.0;
       double expRes = 314.1592653589793;
       Assert.assertEquals(expRes, CircleArea.calculate(radius), 4);
   }
}
