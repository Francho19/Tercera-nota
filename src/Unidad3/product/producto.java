package product;
import java.util.ArrayList;

class Producto {
    String name;
    double price;

    public Producto(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void showInfo() {
        System.out.println("Producto: " + name + ", Precio: " + price);
    }
}

