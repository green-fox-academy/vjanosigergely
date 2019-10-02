package Sum;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SumTest {

    Sum sum = new Sum();

    ArrayList <Integer> numList = new ArrayList<>();




    @Test
    public void adderWithPositive() {
        numList.add(1);
        numList.add(12);
        numList.add(1000);

        int expected = 1013;
        int result = sum.adder(numList);

        assertEquals(expected,result);
    }

    @Test
    public void adderWithEmpty(){
        int expected = 0;
        int result = sum.adder(numList);

        assertEquals(0,result);
    }

    @Test
    public void adderWithNegativeandZero(){
        numList.add(0);
        numList.add(-1);
        numList.add(6);

        int expected = 5;
        int result = sum.adder(numList);
        assertEquals(expected,result);
    }
}