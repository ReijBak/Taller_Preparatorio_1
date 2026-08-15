package Classes.Exercise1;

public class Products {
    private String Name;
    private double Price;
    private int Quantity;

    public Products(String name, double price, int quantity) {
        Name = name;
        Price = price;
        Quantity = quantity;
    }

    public String getName() {
        return Name;
    }

    public double getPrice() {
        return Price;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }
}