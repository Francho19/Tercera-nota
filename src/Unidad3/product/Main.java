package product;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       
        ArrayList<Producto> productos = new ArrayList<>();

       
        productos.add(new Producto("Laptop", 1200.99));
        productos.add(new Producto("Teléfono", 699.50));
        productos.add(new Producto("Monitor", 299.99));
        productos.add(new Producto("Teclado", 49.99));
        productos.add(new Producto("Mouse", 25.99));

    
        for (Producto producto : productos) {
            System.out.println("Nombre: " + producto.name + ", Precio: " + producto.price);
        }
    }

}
