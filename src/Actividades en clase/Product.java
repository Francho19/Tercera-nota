public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void sell(int units) {
        if (units <= quantity) {
            quantity -= units;
            System.out.println("Se vendieron " + units + " unidades de " + name + ".");
        } else {
            System.out.println("No hay suficiente stock para vender " + units + " unidades de " + name + ".");
        }
    }

    public void restock(int units) {
        quantity += units;
        System.out.println("Se repusieron " + units + " unidades de " + name + ".");
    }

    public void showProduct() {
        System.out.println("Producto: " + name);
        System.out.println("Precio: $" + price);
        System.out.println("Cantidad en stock: " + quantity);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        Product product1 = new Product("Keyboard", 29.99, 50);
        Product product2 = new Product("Mouse", 19.99, 30);

        product1.showProduct();
        product2.showProduct();

        product1.sell(10);
        product2.sell(35);

        product2.restock(20);

        product1.showProduct();
        product2.showProduct();
    }
}
