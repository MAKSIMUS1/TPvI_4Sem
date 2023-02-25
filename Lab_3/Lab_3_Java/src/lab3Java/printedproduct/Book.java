package lab3Java.printedproduct;

import org.apache.log4j.Logger;

public class Book extends PrintedProduct{

    private static final Logger LOG =
            Logger.getLogger(Book.class);
    public Book(String title, int price, int year) {
        super(title, price, year);
    }

    @Override
    public void Info() {
        System.out.println("-------------Книга-------------");
        System.out.println("Название: " + getTitle());
        System.out.println("Цена: " + getPrice());
        System.out.println("Год: " + getYearOfPublication());
        System.out.println("-------------------------------");
    }
}
