package test;

import main.Array;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ArrayTest {

    @Test
    public void givenAnArrayOfStringsReturnTheShortestString() {
        Array array = new Array();
        String[] strings = new String[] {"Bounce", "Paula", "Johnny"} ;
        assertEquals(array.shortestString(strings), "Paula");
    }

    @Test
    public void givenAnArrayOfIntegersPrintTheOddOnes() {
        Array array = new Array();
        Integer[] integers = new Integer[] {1,2,3,4,5,6,7,8,9};
        Integer[] expected = new Integer[] {1,3,5,7,9};
        assertEquals(array.computeNumbers(integers, "odd"), expected);
    }

    @Test
    public void givenAnArrayOfIntegersAddTheOddOnesAndMultiplyTheEvenOnes() {
        Array array = new Array();
        Integer[] integers = new Integer[] {1,2,3,4,5,6,7,8,9};
        Integer[] expected = new Integer[] {25,384}; //{ sumOfOdds, productOfEvens}
        assertEquals(array.multiples(integers), expected);
    }
}
