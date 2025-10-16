package Contenido2.onlineShop;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date date;
    private double total;
    private List<Product> products; // Composition

    public Order(Date date) {
        this.date = date;
        this.products = new ArrayList<>();
        this.total = 0;
    }

    public void addProduct(Product p) {
        products.add(p);
        total += p.getPrice();
    }

    public String getInfo() {
        return "Order date: " + date + " - Total: $" + total;
    }
}