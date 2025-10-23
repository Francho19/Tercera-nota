package OnlineShop;

import java.util.ArrayList;

public class Category {
    private String name;
    private String description;
    private ArrayList<Product> products;

    public Category(String name, String description) {
        this.name = name;
        this.description = description;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public void showProducts() {
        System.out.println("Categoría: " + name + " (" + description + ")");
        for (Product p : products) {
            System.out.println("  - " + p.getInfo());
        }
    }
}