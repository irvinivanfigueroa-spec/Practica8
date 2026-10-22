public class Mago extends Personaje {
    private int mana;

    public Mago() {
        this("Mago basico", 1, 50);
    }

    public Mago(String nombre, int nivel, int mana) {
        super(nombre, nivel);
                this.mana = mana;
                System.out.println("[Mago] preparado con " + mana + " puntos de mana");
    }

    @Override
    public String toString() {
        return super.toString() + " | mana: " + mana;
    }
}
