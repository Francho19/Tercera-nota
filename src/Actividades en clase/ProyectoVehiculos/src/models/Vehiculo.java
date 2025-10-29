

public class Vehiculo {
    private String marca;
    private String modelo;
    private int velocidad;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = 0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    protected void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void acelerar(int incremento) {
        velocidad += incremento;
        System.out.println(marca + " " + modelo + " aceleró a " + velocidad + " km/h");
    }

    public void frenar(int decremento) {
        if (velocidad - decremento < 0) {
            velocidad = 0;
        } else {
            velocidad -= decremento;
        }
        System.out.println(marca + " " + modelo + " frenó. Velocidad actual: " + velocidad + " km/h");
    }
}