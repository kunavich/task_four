package by.kunavich.task4.model;


import by.kunavich.task4.model.Array;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class ArrayTest {
    @Test
    public void mergeSortTest1() throws Exception {


        //given
        Array actual = new Array(new int[]{5, 1, 6, 2, 3, 4});
        Array expected = new Array(new int[]{1, 2, 3, 4, 5, 6});
        //whenn
        actual.mergeSort();
        //then
        Assert.assertEquals(expected, actual);
    }
}

