public class Aldeano extends Personaje {
    private int oro;

    public Aldeano(String nombre) {
        this(nombre, 0);
    }

    public Aldeano(String nombre, int oro) {
        super(nombre, 30, 0);
        this.oro = oro;
    }

    public int getOro() {
        return oro;
    }

    @Override
    public int calcularDano() {
        return 0;
    }

    @Override
    public String toString() {
        return "Aldeano -> " + super.toString() + " | Oro: " + oro;
    }
}
