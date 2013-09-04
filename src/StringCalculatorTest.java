import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class StringCalculatorTest {

    @Test
    public void shouldReturnZeroWhenPassedNothing() {
        StringCalculator calculator = new StringCalculator();
        assertEquals("0", calculator.add(""));
    }

    @Test
    public void shouldReturnIntegerWhenPassedSingleInteger() {
        StringCalculator calculator = new StringCalculator();
        assertEquals("1", calculator.add("1"));
    }

    @Test
    public void shouldReturnThesumOfIntegersWhenPassedMoreThanOne() {
        StringCalculator calculator = new StringCalculator();
        assertEquals("3", calculator.add("1,2"));
    }

    @Test
    public void shouldReturnTheSumOfIntegersWhenNewLineIsUsedAsDelimeter() {
        StringCalculator calculator = new StringCalculator();
        assertEquals("3", calculator.add("1\n2"));
    }


}
