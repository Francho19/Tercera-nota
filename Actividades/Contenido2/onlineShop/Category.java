package Contenido2.onlineShop;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private String name;
    private String description;
    private List<Product> products; // Aggregation

    public Category(String name, String description) {
        this.name = name;
        this.description = description;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public String getInfo() {
        return "Category: " + name + " (" + description + ")";
    }
}