package main;

import java.util.ArrayList;
import java.util.List;

public class PotterKata {

    public String purchase(Book... books){
        verifyBooks(books);
        return "Price $" + priceOfAllBooks(books);
    }

    private int priceOfAllBooks(Book[] initialOrder){
        List<Book> nonDuplicates = new ArrayList<Book>();
        List<Book> duplicates = new ArrayList<Book>();
        for (Book book : initialOrder){
            if (nonDuplicates.contains(book)){
                duplicates.add(book);
            } else {
                nonDuplicates.add(book);
            }
        }
        int price = price(nonDuplicates, duplicates);

        return price;
    }

    private int price(List<Book> nonDuplicates, List<Book> duplicates) {
        int  discountPrice = discount(nonDuplicates);
        int nonDiscountPrice =  (duplicates.size() * 8);
        return discountPrice + nonDiscountPrice;
    }

    private int discount(List<Book> bookList){
        double discount = getDiscount(bookList);
        double quantity = bookList.size();
        int price = addPrice(quantity, discount);
        return price;
    }

    private int addPrice(double quantity, double discount){
        double initialPrice = quantity * 8;
        double totalDiscount = initialPrice * discount;
        double totalPrice = initialPrice - totalDiscount;
        int price = ((int) totalPrice);
        return price;
    }

    private Double getDiscount(List<Book> bookList){
        double discount;
        switch (bookList.size()) {
            case 2: discount = .05;
                break;
            case 3: discount = .10;
                break;
            case 4: discount = .15;
                break;
            case 5: discount = .25;
                break;
            case 6: discount = .30;
                break;
            case 7: discount = .35;
                break;
            default: discount = 0;
                break;
        }
        return discount;
    }

    private void verifyBooks(Book [] bookList){
        Book [] books = getBookList();
        for(Book book : bookList){
           boolean isIncluded = false;
           for(int i = 0; i < books.length; i++){
               if(book.equals(books[i])){
                  isIncluded = true;
                   break;
               }
           }
        if(isIncluded == false){
            throw new IllegalArgumentException("One or more books is/are unavailable");
        }
       }
    }

    private Book [] getBookList(){
        int count = 0;
        Book [] purchasableBooks = new Book[7];
        while(count <= 6){
            purchasableBooks[count] = new Book("Book " + (count + 1));
            count ++;
        }
        return purchasableBooks;
    }
}
