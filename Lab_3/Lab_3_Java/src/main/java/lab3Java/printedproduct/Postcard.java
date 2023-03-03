package lab3Java.printedproduct;

public class Postcard extends PrintedProduct{
    public Postcard(String title, int price, int year) {
        super(title, price, year);
    }

    @Override
    public void Info() {
        System.out.println("------------Открытка-----------");
        System.out.println("Название: " + getTitle());
        System.out.println("Цена: " + getPrice());
        System.out.println("Год: " + getYearOfPublication());
        System.out.println("-------------------------------");
    }
}
