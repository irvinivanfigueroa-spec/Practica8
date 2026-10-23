public class Guerrero extends Personaje {
    private int armadura;

    public Guerrero(String nombre) {
        this(nombre, 15, 20);
    }

    public Guerrero(String nombre, int ataque, int armadura) {
        super(nombre, 120, ataque);
        this.armadura = armadura;
    }

    public int getArmadura() {
        return armadura;
    }

    @Override
    public String toString() {
        return "Guerrero -> " + super.toString() + " | Armadura: " + armadura;
    }
}
