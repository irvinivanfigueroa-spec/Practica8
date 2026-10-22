public abstract class Figura {
    private String nombre;

    public Figura() {
        this("Figura");
    }

    public Figura(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre de la figura no puede estar vacío.");
        }
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract double calcularArea();

    @Override
    public String toString() {
        return "Figura: " + nombre;
    }
}
