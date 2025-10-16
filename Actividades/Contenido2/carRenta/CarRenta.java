package Contenido2.carRenta;

import java.util.ArrayList;

public class CarRenta {
    private ArrayList<Car> cars;

    public CarRenta() {
        cars = new ArrayList<>();
    }

    public void addCar(Car c) {
        cars.add(c);
    }

    public void showAvailableCars() {
        System.out.println("Available cars:");
        for (Car c : cars) {
            if (c.isAvailable()) {
                System.out.println(c.getInfo());
            }
        }
    }

    public double calculateTotal(Car c, int days) {
        if (c.isAvailable()) {
            return c.getPricePerDay() * days;
        } else {
            System.out.println("Car is not available.");
            return 0;
        }
    }

    public Car searchCar(String model) {
        for (Car c : cars) {
            if (c.getModel().equalsIgnoreCase(model)) {
                return c;
            }
        }
        System.out.println("Car not found.");
        return null;
    }
}