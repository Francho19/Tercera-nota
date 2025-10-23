package Unidad3.safeCalculator;
public class Main {
    public static void main(String[] args) {
        SafeCalculator calc = new SafeCalculator();

        try {
            calc.divide(10, 2);
            calc.divide(5, 0);
            calc.divide(-8, 4);
        } catch (InvalidInputException e) {
            System.out.println("Excepción personalizada: " + e.getMessage());
        }
    }
}