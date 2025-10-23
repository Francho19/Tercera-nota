package gamer;
public class Main {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.showProduct();

        Product p2 = new Product("Laptop", 1200.50);
        p2.showProduct();

        Product p3 = new Product("Smartphone", 800.00, 10);
        p3.showProduct();

        p2.update("Laptop Gamer");
        p2.update(1500.00);
        p2.showProduct();
    }
}
