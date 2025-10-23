package Unidad3.dataProcessor;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        DataLoader loader = new DataLoader();
        AverageCalculator calc = new AverageCalculator();

        try {
            loader.loadFile("datos.txt");
            calc.calculate(100, 0);
        } 
        catch (IOException e) {
            System.out.println("Error de archivo: " + e.getMessage());
        } 
        catch (EmptyFileException e) {
            System.out.println("Excepción personalizada: " + e.getMessage());
        } 
        catch (Exception e) {
            System.out.println("Error general: " + e.getMessage());
        } 
        finally {
            System.out.println("Operación finalizada.");
        }
    }
}
