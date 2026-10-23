public class Personaje {
    private String nombre;
    private int vida;
    private int ataque;

    public Personaje(String nombre, int vida, int ataque) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public int calcularDano() {
        return ataque;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " | Vida: " + vida + " | Ataque: " + ataque;
    }
}
