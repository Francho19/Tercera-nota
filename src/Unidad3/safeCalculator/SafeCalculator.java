package Unidad3.safeCalculator;
public class SafeCalculator {

    public double divide(int a, int b) throws InvalidInputException {
        if (a < 0 || b < 0) {
            throw new InvalidInputException("Los números no pueden ser negativos.");
        }

        double result = 0;

        try {
            result = a / b;
            System.out.println("Resultado: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        } finally {
            System.out.println("Fin de la operación.");
        }

        return result;
    }
}
