package Unidad4;

public class Calculadora {
  public int  sumar(int numA, int numB){
    return numA + numB;
  }
   public int sumar(int numA, int numB, int numC) {
        return numA + numB + numC;
    }
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("Suma de 2 y 4: " + calc.sumar(2, 4));

        System.out.println("Suma de 2, 4 y 6: " + calc.sumar(2, 4, 6));
    }
}