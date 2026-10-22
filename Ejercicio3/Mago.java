public class Mago extends Personaje {
    private int mana;

    public Mago(String nombre, int vida, int mana) {
        super(nombre, vida);
        if (mana < 0) throw new IllegalArgumentException("El mana no puede ser negativo.");
        this.mana = mana;
    }

    @Override public String presentarse() {
        return "Mago: " + getNombre() + " | vida: " + getVida() + " | mana: " + mana;
    }
}
