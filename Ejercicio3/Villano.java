public class Villano extends Personaje {
    private int nivelAmenaza;

    public Villano(String nombre, int vida, int nivelAmenaza) {
        super(nombre, vida);
        if (nivelAmenaza < 1 || nivelAmenaza > 10) throw new IllegalArgumentException("El nivel de amenaza debe estar entre 1 y 10.");
        this.nivelAmenaza = nivelAmenaza;
    }

    @Override public String presentarse() {
        return "Villano: " + getNombre() + " | vida: " + getVida() + " | amenaza: " + nivelAmenaza + "/10";
    }
}
