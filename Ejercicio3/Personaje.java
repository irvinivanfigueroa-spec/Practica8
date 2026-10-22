public class Personaje {
    private String nombre;
    private int vida;

    public Personaje() {
        this("Personaje", 100);
    }

    public Personaje(String nombre, int vida) {
        if (nombre == null || nombre.isBlank()) throw new IllegalArgumentException("El nombre no puede estar vacío.");
        if (vida <= 0) throw new IllegalArgumentException("La vida debe ser mayor que cero.");
        this.nombre = nombre;
        this.vida = vida;
    }

    public String getNombre() { return nombre; }
    public int getVida() { return vida; }

    public String presentarse() {
        return "Personaje: " + nombre + " | vida: " + vida;
    }

    @Override public String toString() { return presentarse(); }
}
