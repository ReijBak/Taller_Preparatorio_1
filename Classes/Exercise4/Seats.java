package Classes.Exercise4;

public class Seats {
    private int Number;
    private int Row;
    private double Price;

    public Seats(int number, int row, double price) {
        Number = number;
        Row = row;
        Price = price;
    }

    public int getNumber() {
        return Number;
    }

    public int getRow() {
        return Row;
    }

    public double getPrice() {
        return Price;
    }

    public void setNumber(int number) {
        Number = number;
    }

    public void setRow(int row) {
        Row = row;
    }

    public void setPrice(double price) {
        Price = price;
    }
}