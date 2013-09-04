import java.util.ArrayList;

public class PotterKata {

    public String purchase(String... books){
        verifyBooks(books);
        int sortedBooks = checkDups(books);
        return "Price $" + sortedBooks;
    }

    private int checkDups(String [] initialOrder){
        ArrayList<String> nonDuplicates = new ArrayList<String>();
        ArrayList<String> duplicates = new ArrayList<String>();
        for (String book : initialOrder){
            if (nonDuplicates.contains(book)){
                duplicates.add(book);
            } else {
                nonDuplicates.add(book);
            }
        }
        int  discountPrice = getPrice(nonDuplicates);
        int nonDiscountPrice =  (duplicates.size() * 8);
        int price = discountPrice + nonDiscountPrice;

        return price;
    }

    private int getPrice(ArrayList<String> bookList){
        double discount = getDiscount(bookList);
        double quantity = bookList.size();
        int price = addPrice(quantity, discount);
        return price;
    }

    private int addPrice(double quantity, double discount){
        double initialPrice = quantity * 8;
        double totalDiscount = initialPrice * discount;
        double totalPrice = initialPrice - totalDiscount;
        int price;
        price = ((int) totalPrice);
        return price;
    }

    private Double getDiscount(ArrayList<String> bookList){
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

    private void verifyBooks(String [] bookList){
        String [] books = getBookList();
        for(String book : bookList){
           boolean isIncluded = false;
           for(int i = 0; i < books.length; i++){
               if(book.matches(books[i])){
                  isIncluded = true;
                   break;
               }
           }
        if(isIncluded == false){
            throw new IllegalArgumentException("One or more books is/are unavailable");
        }
       }
    }

    private String [] getBookList(){
        int count = 0;
        String [] purchasableBooks = new String[7];
        while(count <= 6){
            purchasableBooks[count] = "Book " + (count + 1);
            count ++;
        }
        return purchasableBooks;
    }
}
