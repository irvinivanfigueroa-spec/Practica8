public class Villano extends Personaje {
    private int nivelAmenaza;

    public Villano() {
        this("Villano basico", 1, 5);
    }

    public Villano(String nombre, int nivel, int nivelAmenaza) {
        super(nombre, nivel);
                this.nivelAmenaza = nivelAmenaza;
                System.out.println("[Villano] nivel de amenaza " + nivelAmenaza);
    }

    @Override
    public String toString() {
        return super.toString() + " | nivel de amenaza: " + nivelAmenaza;
    }
}
