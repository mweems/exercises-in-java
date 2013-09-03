import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class DiamondTest {


    @Test
    public void shouldPrintASingleAsteriskWhenPassedAOne() {
        Diamond diamond = new Diamond();
        assertEquals("*\n", diamond.triangle(1));
    }

    @Test
    public void shouldPrintErrorMessageIfNumberGivenIsAnEvenNumber() {
        Diamond diamond = new Diamond();
        assertEquals("Must enter an odd number", diamond.triangle(2));
    }

    @Test
    public void shouldPrintAsterisksInTheShapeOfATriangleAsTallAsThePassedInNumber() {
        Diamond diamond = new Diamond();
        assertEquals("  *\n ***\n*****\n",diamond.triangle(3));
    }
}
