package center.kit.app.homework.lesson5;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Random;

public class ArraySortTest {

    //Create test for array sorting method
    @Test
    public void arraySortIntTest(){
        Random r = new Random();
        ArraySort as = new ArraySort();
        ArrayList<Integer> arrInt = new ArrayList<>();
        int size = 100;
        //Set "next" variable for first(only) iteration when checking the sequence
        //to not fail verification
        int next = Integer.MIN_VALUE;

        //Fill and sort new array
        for(int i = 0; i < size; ++i) {
            arrInt.add(r.nextInt());
        }
        as.sort(arrInt);
        //Check for correct sorted sequence
        for (int i : arrInt){
            if(i < next){
                Assert.fail("Array is not sorted");
                break;
            }
            next = i;
        }
    }


}
