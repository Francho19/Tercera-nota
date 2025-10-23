package Contenido1.Invertario;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product() {
        this.name = "Sin nombre";
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
        System.out.println("Nombre: " + name);
        System.out.println("Precio: $" + price);
        System.out.println("Cantidad: " + quantity);
        System.out.println("---------------------------");
    }

    public void update(String name) {
        this.name = name;
        System.out.println("El nombre del producto se actualizó a: " + name);
    }

    public void update(double price) {
        this.price = price;
        System.out.println("El precio del producto se actualizó a: $" + price);
    }
}
