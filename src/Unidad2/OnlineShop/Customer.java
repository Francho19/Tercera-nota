package OnlineShop;

import java.util.ArrayList;

public class Customer {
    private String name;
    private String email;
    private ArrayList<Order> orders;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.orders = new ArrayList<>();
    }

    public void placeOrder(Order o) {
        orders.add(o);
        System.out.println(name + " realizó un nuevo pedido.");
    }

    public void showOrders() {
        System.out.println("\nPedidos del cliente: " + name);
        for (Order o : orders) {
            o.showOrder();
        }
    }
}