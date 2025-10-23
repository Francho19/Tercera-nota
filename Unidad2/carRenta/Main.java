package Contenido2.carRenta;

public class Main {
    public static void main(String[] args) {
        CarRenta renta = new CarRenta();

        Car car1 = new Car("Toyota Corolla", 60.0, true);
        Car car2 = new Car("Honda Civic", 70.0, false);
        Car car3 = new Car("Ford Focus", 55.0, true);

        renta.addCar(car1);
        renta.addCar(car2);
        renta.addCar(car3);

        renta.showAvailableCars();

        Car selected = renta.searchCar("Toyota Corolla");
        if (selected != null) {
            double total = renta.calculateTotal(selected, 5);
            System.out.println("Total for 5 days: $" + total);
            selected.setAvailable(false);
        }

        System.out.println("\nAfter rental:");
        renta.showAvailableCars();
    }
}