package OnlineShop;

import java.util.ArrayList;

public class Order {
    private String date;
    private double total;
    private ArrayList<Product> products;

    public Order(String date) {
        this.date = date;
        this.products = new ArrayList<>();
        this.total = 0.0;
    }

    public void addProduct(Product p) {
        products.add(p);
        total += p.getPrice();
    }

    public void showOrder() {
        System.out.println("Fecha: " + date);
        for (Product p : products) {
            System.out.println("  - " + p.getInfo());
        }
        System.out.println("Total: $" + total);
    }
}

