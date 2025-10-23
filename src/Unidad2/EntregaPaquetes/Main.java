package Contenido2.EntregaPaquetes;

public class Main {
    public static void main(String[] args) {
        Package p1 = new Package("PKG001", 5.0);
        Package p2 = p1;

        System.out.println("=== Antes de modificar ===");
        p1.showPackage();

        p2.weight = 8.0;

        System.out.println("= Después de modificar con p2 =");
        p1.showPackage();

        changeWeight(p1, 12.5);

        System.out.println("= Después de usar changeWeight() =");
        p1.showPackage();

        System.out.println("Explicación:");
        System.out.println("p1 y p2 apuntan al mismo objeto en memoria. "
                + "Por eso, cualquier cambio hecho con una referencia "
                + "afecta también a la otra.");
    }

    public static void changeWeight(Package p, double newWeight) {
        p.weight = newWeight;
        System.out.println("El peso del paquete se cambió a " + newWeight + " kg desde el método.");
    }
}
