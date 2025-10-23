package Contenido1.Invertario;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product("Laptop", 3500.0);
        Product p3 = new Product("Celular", 1200.0, 10);

        System.out.println("=== Información de Productos ===");
        p1.showProduct();
        p2.showProduct();
        p3.showProduct();

        p2.update("Portátil Gamer");
        p3.update(1500.0);

        System.out.println("=== Después de las actualizaciones ===");
        p2.showProduct();
        p3.showProduct();
    }
}
