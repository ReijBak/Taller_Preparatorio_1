package Classes.Exercise3;

public class Books {
    private String Title;
    private String Author;
    private double Price;

    public Books(String title, String author, double price) {
        Title = title;
        Author = author;
        Price = price;
    }

    public String getTitle() {
        return Title;
    }

    public String getAuthor() {
        return Author;
    }

    public double getPrice() {
        return Price;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public void setPrice(double price) {
        Price = price;
    }
}