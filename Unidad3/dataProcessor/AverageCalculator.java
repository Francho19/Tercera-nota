package Unidad3.dataProcessor;

public class AverageCalculator {

    public double calculate(int total, int count) {
        if (count == 0) {
            System.out.println("Error: No se puede dividir por cero al calcular el promedio.");
            return 0;
        }

        double average = (double) total / count;
        System.out.println("El promedio es: " + average);
        return average;
    }
}
