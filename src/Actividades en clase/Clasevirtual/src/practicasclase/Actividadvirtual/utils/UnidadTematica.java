package practicasclase.Actividadvirtual.utils;

public class UnidadTematica {
    private String nombre;

    public UnidadTematica(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
