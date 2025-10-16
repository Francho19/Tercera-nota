package Contenido2.onlineShop;


public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getInfo() {
        return "Product: " + name + " - $" + price;
    }

    public double getPrice() {
        return price;
    }
}