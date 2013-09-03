import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class DiamondTest {


    @Test
    public void TriangleShouldReturnASingleAsteriskWhenPassedAOne() {
        Diamond diamond = new Diamond();
        assertEquals("*\n", diamond.triangle(1));
    }

    @Test
    public void TriangleShouldReturnErrorMessageIfNumberGivenIsAnEvenNumber() {
        Diamond diamond = new Diamond();
        assertEquals("Must enter an odd number", diamond.triangle(2));
    }

    @Test
    public void TriangleShouldReturnAsterisksInACenteredTriangle3RowsHigh() {
        Diamond diamond = new Diamond();
        assertEquals("  *\n ***\n*****\n",diamond.triangle(3));
    }

    @Test
    public void DiamondShouldReturnASingleAsteriskWhenPassedAOne() {
        Diamond diamond = new Diamond();
        assertEquals("*\n", diamond.diamond(1));
    }

    @Test
    public void DiamondShouldReturnErrorMessageIfNumberGivenIsAnEvenNumber() {
        Diamond diamond = new Diamond();
        assertEquals("Must enter an odd number", diamond.diamond(2));
    }

    @Test
    public void DiamondShouldReturnAsterisksInACenteredDiamond3RowsHigh() {
        Diamond diamond = new Diamond();
        assertEquals(" *\n***\n *\n", diamond.diamond(3));
    }

    @Test
    public void DiamondShouldReturnAsterisksInACenteredDiamond5RowsHigh() {
        Diamond diamond = new Diamond();
        assertEquals("  *\n ***\n*****\n ***\n  *\n", diamond.diamond(5));
    }

    @Test
    public void DiamondShouldBeAbleToBuildTwoShapes() {
        Diamond diamond = new Diamond();
        assertEquals("*\n", diamond.triangle(1));
        assertEquals("*\n", diamond.diamond(1));
    }
}
