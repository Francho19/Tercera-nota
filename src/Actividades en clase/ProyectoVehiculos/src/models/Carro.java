
public class Carro extends Vehiculo {

    private int puertas;
    private boolean puertasCerradas;

    public Carro(String marca, String modelo, int puertas) {
        super(marca, modelo);
        this.puertas = puertas;
        this.puertasCerradas = true;
    }

    public void abrirPuerta() {
        if (puertasCerradas) {
            puertasCerradas = false;
            System.out.println("Las puertas del carro están abiertas.");
        } else {
            System.out.println("Las puertas ya estaban abiertas.");
        }
    }

    @Override
    public void acelerar(int incremento) {
        System.out.println("El carro está acelerando...");
        super.acelerar(incremento);
    }
}   