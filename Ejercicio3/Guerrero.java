public class Guerrero extends Personaje {
    private String arma;

    public Guerrero(String nombre, int vida, String arma) {
        super(nombre, vida);
        if (arma == null || arma.isBlank()) throw new IllegalArgumentException("El arma no puede estar vacía.");
        this.arma = arma;
    }

    @Override public String presentarse() {
        return "Guerrero: " + getNombre() + " | vida: " + getVida() + " | arma: " + arma;
    }
}
