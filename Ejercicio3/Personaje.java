public class Personaje {
    private String nombre;
    private int nivel;

    public Personaje() {
        this("Personaje sin nombre", 1);
    }

    public Personaje(String nombre) {
        this(nombre, 1);
    }

    public Personaje(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
        System.out.println("[Personaje] creando " + nombre);
    }

    @Override
    public String toString() {
        return nombre + " | nivel: " + nivel;
    }
}
