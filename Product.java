package project;

public class Product {
    private String name;
    private double price;
    public int quantity;


    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

}