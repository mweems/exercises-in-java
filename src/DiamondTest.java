import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DiamondTest {

    @Test
    public void shouldPrintAsterisksInTheShapeOfATriangleAsTallAsThePassedInNumber() {
        Diamond diamond = new Diamond();
        assertEquals(diamond.triangle(3), "  *  \n *** \n*****\n");
    }
}
