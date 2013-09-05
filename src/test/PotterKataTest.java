package test;

import main.Book;
import main.PotterKata;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class PotterKataTest {

    Book book1 = new Book("Book 1");
    Book book2 = new Book("Book 2");
    Book book3 = new Book("Book 3");
    Book book4 = new Book("Book 4");
    Book book5 = new Book("Book 5");
    Book book6 = new Book("Book 6");
    Book book7 = new Book("Book 7");
    PotterKata bookStore;

    @Before
    public void setup(){
        bookStore = new PotterKata();
    }


    @Test
    public void buyingOneBookShouldReturnAPriceOf8Dollars() {
        assertEquals("Price $8", bookStore.purchase(book1));
    }

    @Test
    public void buyingTwoOfTheSameBooksShouldReturnAPriceOf16Dollars() {
        Book otherBook = new Book("Book 1");
        assertEquals("Price $16", bookStore.purchase(book1, otherBook));
    }

    @Test
    public void buyingTwoDifferentBooksShouldGiveA5PercentDiscount() {
        assertEquals("Price $15", bookStore.purchase(book1, book2));
    }

    @Test
    public void buyingDuplicateBooksAndNonDuplicateBooksShouldResultInAnAccuratePrice(){
        assertEquals("Price $29", bookStore.purchase(book1, book1, book3, book4));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldNotBeAbleToBuyBooksThatAreNotInTheStore(){
        Book otherBook = new Book("Ender's Game");
        bookStore.purchase(otherBook);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldGetExceptionEvenWhenOtherBooksAreOnTheList(){
        Book otherBook = new Book("Ender's Game");
        bookStore.purchase(book1, book2, otherBook, book3);
    }

    @Test
    public void priceShouldBeAccurateWithFiveOfTheSameBook() {
        assertEquals("Price $40", bookStore.purchase(book1, book1, book1, book1, book1));
    }

    @Test
    public void priceShouldBeAccurateWithMultipleNonDuplicateBooks() {
        assertEquals("Price $52", bookStore.purchase(book1, book2, book3, book4, book5, book6, book7, book1, book2));
    }
}
