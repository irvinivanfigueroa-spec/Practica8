public class Figura {
    private String nombre;

    public Figura() {
        this("Figura sin nombre");
    }

    public Figura(String nombre) {
        this.nombre = nombre;
        System.out.println("[Figura] creando " + nombre);
    }

    @Override
    public String toString() {
        return nombre;
    }
}
