package Contenido2.EntregaPaquetes;

public class Package {
    String trackingCode;
    double weight;

    public Package(String trackingCode, double weight) {
        this.trackingCode = trackingCode;
        this.weight = weight;
    }

    public void showPackage() {
        System.out.println("Código de rastreo: " + trackingCode);
        System.out.println("Peso: " + weight + " kg");
        System.out.println("---------------------------");
    }
}
