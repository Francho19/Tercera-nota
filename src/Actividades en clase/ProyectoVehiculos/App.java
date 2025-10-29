
public class App {
    public static void main(String[] args) {
        Carro miCarro = new Carro("Toyota", "Corolla", 4);
        Moto miMoto = new Moto("Yamaha", "MT-07");

        miCarro.acelerar(40);
        miCarro.abrirPuerta();
        miCarro.frenar(20);

        System.out.println("----------------------");

        miMoto.acelerar(60);
        miMoto.wheelie();
        miMoto.frenar(30);
    }
}