public class Guerrero extends Personaje {
    private String arma;

    public Guerrero() {
        this("Guerrero basico", 1, "Espada");
    }

    public Guerrero(String nombre, int nivel, String arma) {
        super(nombre, nivel);
                this.arma = arma;
                System.out.println("[Guerrero] equipado con " + arma);
    }

    @Override
    public String toString() {
        return super.toString() + " | arma: " + arma;
    }
}
