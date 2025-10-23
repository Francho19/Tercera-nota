package gamer;
public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product() {
        this.name = "Unknown";
        this.price = 0.0;
        this.quantity = 0;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = 0;
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void showProduct() {
        System.out.println("Producto: " + name + 
                           " | Precio: $" + price + 
                           " | Cantidad: " + quantity);
    }

    public void update(String name) {
        this.name = name;
    }

    public void update(double price) {
        this.price = price;
    }
}
