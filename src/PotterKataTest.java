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

    @Test
    public void buyingDuplicateBooksAndNonDuplicateBooksShouldResultInAnAccuratePrice(){
        PotterKata bookStore = new PotterKata();
        assertEquals("Price $29", bookStore.purchase("Book 1", "Book 2", "Book 3", "Book 1"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldNotBeAbleToBuyBooksThatAreNotInTheStore(){
        PotterKata bookStore = new PotterKata();
        bookStore.purchase("Ender's Game");
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldGetExceptionEvenWhenOtherBooksAreOnTheList(){
        PotterKata bookStore = new PotterKata();
        bookStore.purchase("Book 1", "Book 2", "Ender's Game", "Book 3");
    }

    @Test
    public void priceShouldBeAccurateWithFiveOfTheSameBook() {
        PotterKata bookStore = new PotterKata();
        assertEquals("Price $40", bookStore.purchase("Book 1", "Book 1", "Book 1", "Book 1", "Book 1"));
    }

    @Test
    public void priceShouldBeAccurateWithMultipleNonDuplicateBooks() {
        PotterKata bookStore = new PotterKata();
        assertEquals("Price $52", bookStore.purchase("Book 1", "Book 2", "Book 3", "Book 4", "Book 5", "Book 6", "Book 7", "Book 1", "Book 2"));
    }
}
