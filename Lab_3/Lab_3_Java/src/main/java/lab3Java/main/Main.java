package lab3Java.main;

import lab3Java.bookstore.BookStore;
import lab3Java.printedproduct.Book;
import lab3Java.printedproduct.Magazine;
import lab3Java.printedproduct.ThemeType;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Main {
    static{
        new DOMConfigurator().doConfigure("log/log4j.xml",
                LogManager.getLoggerRepository());
    }
    private static final Logger LOG = Logger.getLogger(Main.class);
    public static void main (String[] args){

        LOG.info("Starting program_____________________________");
        BookStore bookstore = new BookStore(new Book("Война и мир", 145, 2014));
        bookstore.bookStoreSeller.AddProduct(new Book("Колобок", 100, 1998));
        bookstore.bookStoreSeller.AddProduct(new Magazine("Беларуская правда", 35, 2023, ThemeType.Science));

        bookstore.bookStoreSeller.SearchProductByTitle("Колобок").Info();
        try{
            bookstore.bookStoreSeller.SearchProductByTitle("Колобокывапв").Info();
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        bookstore.ShowProducts();
        bookstore.bookStoreSeller.SortProductsByYear();
        bookstore.ShowProducts();
    }
}
