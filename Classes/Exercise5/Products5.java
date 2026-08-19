package Classes.Exercise5;

public class Products5 {
    private String Name;
    private double Price;
    private int Stock;

    public Products5(String name, double price, int stock) {
        Name = name;
        Price = price;
        Stock = stock;
    }

    public String getName() {
        return Name;
    }

    public double getPrice() {
        return Price;
    }

    public int getStock() {
        return Stock;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public void setStock(int stock) {
        Stock = stock;
    }
}