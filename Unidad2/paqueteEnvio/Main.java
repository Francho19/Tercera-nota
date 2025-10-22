package paqueteEnvio;

public class Main {
    public static void main(String[] args) {
        Package p1 = new Package("PKG001", 2.5);
        Package p2 = p1;

        System.out.println("Antes del cambio:");
        p1.showPackage();

        p2.setWeight(5.0);

        System.out.println("\nDespués del cambio (usando p2):");
        p1.showPackage();

        Package.changeWeight(p1, 8.0);

        System.out.println("\nDespués de usar el método changeWeight:");
        p1.showPackage();

        System.out.println("\nExplicación:");
        System.out.println("Tanto p1 como p2 apuntan al mismo objeto en memoria, por eso el cambio en una referencia afecta a la otra.");
    }
}