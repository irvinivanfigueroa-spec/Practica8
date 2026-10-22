public class Aldeano extends Personaje {
    private String oficio;

    public Aldeano() {
        this("Aldeano basico", 1, "Granjero");
    }

    public Aldeano(String nombre, int nivel, String oficio) {
        super(nombre, nivel);
                this.oficio = oficio;
                System.out.println("[Aldeano] oficio " + oficio);
    }

    @Override
    public String toString() {
        return super.toString() + " | oficio: " + oficio;
    }
}
