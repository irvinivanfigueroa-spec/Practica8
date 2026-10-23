public class Villano extends Personaje {
    private int amenaza;

    public Villano(String nombre, int vida, int ataque) {
        this(nombre, vida, ataque, 5);
    }

    public Villano(String nombre, int vida, int ataque, int amenaza) {
        super(nombre, vida, ataque);
        this.amenaza = amenaza;
    }

    public int getAmenaza() {
        return amenaza;
    }

    @Override
    public int calcularDano() {
        return getAtaque() + amenaza;
    }

    @Override
    public String toString() {
        return "Villano -> " + super.toString() + " | Amenaza: " + amenaza;
    }
}
