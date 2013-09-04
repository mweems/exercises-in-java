import java.util.ArrayList;

public class PotterKata {

    public String purchase(String... books){
        int sortedBooks;
        if (books.length > 1){
            sortedBooks = checkDups(books);
        } else {
            return "Price $8";
        }
        return "Price $" + sortedBooks;
    }

    private int checkDups(String [] initialOrder){
        ArrayList<String> nonDuplicates = new ArrayList<String>();
        ArrayList<String> duplicates = new ArrayList<String>();
        for (String book : initialOrder){
            if (!nonDuplicates.contains(book)){
                nonDuplicates.add(book);
            } else {
                duplicates.add(book);
            }
        }
        int  discountPrice = getPrice(nonDuplicates);
        int nonDiscountPrice =  ((int) duplicates.size() * 8);
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
        double totalDiscount = quantity * discount;
        double totalPrice = (quantity * 8.00) - totalDiscount;
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
}
