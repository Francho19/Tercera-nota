package Contenido1.Small;

public class Main {
 public static void main(String[] args) {
        
        Product p1 = new Product("Laptop", 3500.00, 10);
        Product p2 = new Product("Audifonos", 150.00, 25);

        p1.showProduct();
        p2.showProduct();

        p1.sell(3);
        p2.sell(30); 

        // Reponer stock
        p1.restock(5);
        p2.restock(10);

    
        p1.showProduct();
        p2.showProduct();
    } 
} 