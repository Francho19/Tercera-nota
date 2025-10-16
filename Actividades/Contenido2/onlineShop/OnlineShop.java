package Contenido2.onlineShop;

import java.util.Date;

public class OnlineShop {
    public static void main(String[] args) {
        Category electronics = new Category("Electronics", "Devices and gadgets");
        Product phone = new Product("Smartphone", 699.99);
        Product laptop = new Product("Laptop", 1299.99);
        electronics.addProduct(phone);
        electronics.addProduct(laptop);

        Customer customer = new Customer("Alice", "alice@email.com");
        Order order1 = new Order(new Date());
        order1.addProduct(phone);
        order1.addProduct(laptop);
        customer.placeOrder(order1);

        System.out.println(customer.getInfo());
        System.out.println(order1.getInfo());
    }
}