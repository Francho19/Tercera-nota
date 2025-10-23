package Contenido1.Small;

public class Product {

    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
      }

        public void sell(int amount) {
        if (amount <= quantity) {
            quantity -= amount;
            System.out.println( " se vendieron "+ amount + "unidades de " + name  );
        } else{
            System.out.println("No hay suficientes unidades de " + name  );
        }
        
     }
       public void restock(int amount) {
        if (amount > 0) {
            quantity += amount;
            System.out.println("Se agregarón " + amount + "unidades al stock");
        } else {
            System.out.println("La cantidad a reponer no es valida.");
        }
    }
      public void showProduct() {
        System.out.println("Producto: " + name);
        System.out.println("Precio: $" + price);
        System.out.println("Cantidad disponible: " + quantity);
        System.out.println("-----------------------------");
    }

}