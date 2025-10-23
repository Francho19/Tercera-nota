package Contenido2.techStore;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Product p1 = new Product("A101", "Laptop", 1200.0);
        Product p2 = new Product("B202", "Mouse", 25.5);
        Product p3 = new Product("C303", "Keyboard", 45.0);

        inventory.addProduct(p1);
        inventory.addProduct(p2);
        inventory.addProduct(p3);

        inventory.showProducts();

        System.out.println("\nSearching for product with code 'B202':");
        Product found = inventory.searchProduct("B202");
        if (found != null) {
            System.out.println(found.getInfo());
        }

        System.out.println("\nSearching for product with code 'X999':");
        inventory.searchProduct("X999");
    }
}