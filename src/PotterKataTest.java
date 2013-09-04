import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class PotterKataTest {

    @Test
    public void buyingOneBookShouldReturnAPriceOf8Dollars() {
        PotterKata bookStore = new PotterKata();
        assertEquals("Price $8", bookStore.purchase("Book 1"));
    }

    @Test
    public void buyingTwoOfTheSameBooksShouldReturnAPriceOf16Dollars() {
        PotterKata bookStore = new PotterKata();
        assertEquals("Price $16", bookStore.purchase("Book 1", "Book 1"));
    }

    @Test
    public void buyingTwoDifferentBooksShouldGiveA5PercentDiscount() {
        PotterKata bookStore = new PotterKata();
        assertEquals("Price $15", bookStore.purchase("Book 1", "Book 2"));
    }
}
