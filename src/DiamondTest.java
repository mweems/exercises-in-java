import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class DiamondTest {


    @Test
    public void TriangleShouldReturnASingleAsteriskWhenPassedAOne() {
        Diamond diamond = new Diamond();
        assertEquals("*\n", diamond.triangleBuilder(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void TriangleShouldReturnErrorMessageIfNumberGivenIsAnEvenNumber() {
        Diamond diamond = new Diamond();
        diamond.triangleBuilder(2);
    }

    @Test
    public void TriangleShouldReturnAsterisksInACenteredTriangle3RowsHigh() {
        Diamond diamond = new Diamond();
        assertEquals("  *\n ***\n*****\n",diamond.triangleBuilder(3));
    }

    @Test
    public void DiamondShouldReturnASingleAsteriskWhenPassedAOne() {
        Diamond diamond = new Diamond();
        assertEquals("*\n", diamond.diamondBuilder(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void DiamondShouldReturnErrorMessageIfNumberGivenIsAnEvenNumber() {
        Diamond diamond = new Diamond();
        diamond.diamondBuilder(2);
    }

    @Test
    public void DiamondShouldReturnAsterisksInACenteredDiamond3RowsHigh() {
        Diamond diamond = new Diamond();
        assertEquals(" *\n***\n *\n", diamond.diamondBuilder(3));
    }

    @Test
    public void DiamondShouldReturnAsterisksInACenteredDiamond5RowsHigh() {
        Diamond diamond = new Diamond();
        assertEquals("  *\n ***\n*****\n ***\n  *\n", diamond.diamondBuilder(5));
    }

    @Test
    public void DiamondShouldBeAbleToBuildTwoShapes() {
        Diamond diamond = new Diamond();
        assertEquals("*\n", diamond.triangleBuilder(1));
        assertEquals("*\n", diamond.diamondBuilder(1));
    }

    @Test
    public void DiamondNameShouldReturnAstrisksInACenteredDiamond3RowsHighWithPaulaInTheMiddleRow() {
        Diamond diamond = new Diamond();
        assertEquals(" *\nPaula\n *\n", diamond.diamondName(3,"Paula"));
    }

    @Test
    public void DiamondNameShouldReturnAsterisksInACenteredDiamond5rowsHighWithPaulaInTheMiddleRow() {
        Diamond diamond = new Diamond();
        assertEquals("  *\n ***\nPaula\n ***\n  *\n", diamond.diamondName(5, "Paula"));
    }
}
