package lab3Java.printedproduct;
public class Magazine extends PrintedProduct{
    private ThemeType themeType;

    public ThemeType getThemeType() {
        return themeType;
    }

    public void setThemeType(ThemeType themeType) {
        this.themeType = themeType;
    }

    public Magazine(String title, int price, int year, ThemeType themeType) {
        super(title, price, year);
        this.themeType = themeType;
    }

    @Override
    public void Info() {
        System.out.println("-------------Журнал------------");
        System.out.println("Название: " + getTitle());
        System.out.println("Цена: " + getPrice());
        System.out.println("Год: " + getYearOfPublication());
        System.out.println("Тема: " + getThemeType());
        System.out.println("-------------------------------");
    }
}
