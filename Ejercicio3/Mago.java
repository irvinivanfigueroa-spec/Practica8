public class Mago extends Personaje {
    private int mana;

    public Mago(String nombre) {
        this(nombre, 10, 50);
    }

    public Mago(String nombre, int ataque, int mana) {
        super(nombre, 80, ataque);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    @Override
    public int calcularDano() {
        return getAtaque() + mana / 10;
    }

    @Override
    public String toString() {
        return "Mago -> " + super.toString() + " | Mana: " + mana;
    }
}
