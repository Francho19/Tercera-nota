    
public class Moto extends Vehiculo {

    private boolean enWheelie;

    public Moto(String marca, String modelo) {
        super(marca, modelo);
        this.enWheelie = false;
    }

    public void wheelie() {
        if (!enWheelie) {
            enWheelie = true;
            System.out.println(getMarca() + " " + getModelo() + " está haciendo un wheelie! 🏍️");
        } else {
            System.out.println("Ya estás haciendo wheelie.");
        }
    }

    @Override
    public void frenar(int decremento) {
        if (enWheelie) {
            enWheelie = false;
            System.out.println("La moto bajó la rueda delantera.");
        }
        super.frenar(decremento);
    }
}
