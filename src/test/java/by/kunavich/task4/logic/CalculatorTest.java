package by.kunavich.task4.logic;

import by.kunavich.task4.model.Array;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void findFibonachiTest1() throws Exception {
        //given
        Array actual = new Array(new int[]{5, 1, 6, 2, 3, 4});
        Array expected = new Array(new int[]{1, 2, 3, 5});
        Calculator calculator =new Calculator();
        //whenn
        actual=calculator.findFibonachi(actual);
        //then
        Assert.assertEquals(expected, actual);
    }
}
