public class Aldeano extends Personaje {
    private String oficio;

    public Aldeano(String nombre, int vida, String oficio) {
        super(nombre, vida);
        if (oficio == null || oficio.isBlank()) throw new IllegalArgumentException("El oficio no puede estar vacío.");
        this.oficio = oficio;
    }

    @Override public String presentarse() {
        return "Aldeano: " + getNombre() + " | vida: " + getVida() + " | oficio: " + oficio;
    }
}
