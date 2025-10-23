package paqueteEnvio;

public class Package {
    private String trackingCode;
    private double weight;

    public Package(String trackingCode, double weight) {
        this.trackingCode = trackingCode;
        this.weight = weight;
    }

    public void showPackage() {
        System.out.println("Código de seguimiento: " + trackingCode);
        System.out.println("Peso: " + weight + " kg");
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public static void changeWeight(Package p, double newWeight) {
        p.setWeight(newWeight);
    }
}