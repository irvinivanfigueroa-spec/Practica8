public abstract class Figura {
    private String nombre;

    public Figura(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre de la figura no puede estar vacío.");
        }
        this.nombre = nombre;
    }

    public String getNombre() { return nombre; }
    public abstract double calcularArea();

    @Override
    public String toString() {
        return nombre + " | área: " + String.format("%.2f", calcularArea());
    }
}
