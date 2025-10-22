package OnlineShop;

public class Main {
    public static void main(String[] args) {
        
        Category electronics = new Category("Electrónica", "Dispositivos y accesorios");
        Product phone = new Product("Smartphone", 1200.0);
        Product laptop = new Product("Laptop", 3500.0);
        electronics.addProduct(phone);
        electronics.addProduct(laptop);

        electronics.showProducts();

        
        Customer customer = new Customer("Frank", "frank@email.com");
        Order order1 = new Order("2025-10-16");
        order1.addProduct(phone);
        order1.addProduct(laptop);

        customer.placeOrder(order1);
        customer.showOrders();
    }
}
