public class Figura {
    private String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public double calcularArea() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre;
    }
}
