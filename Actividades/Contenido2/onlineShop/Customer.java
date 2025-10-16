package Contenido2.onlineShop;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String email;
    private List<Order> orders; // Association

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.orders = new ArrayList<>();
    }

    public void placeOrder(Order o) {
        orders.add(o);
    }

    public String getInfo() {
        return "Customer: " + name + " - " + email;
    }
}