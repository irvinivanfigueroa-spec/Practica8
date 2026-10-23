public class Pentagono extends Figura {
    private double lado;

    public Pentagono(double lado) {
        super("Pentagono");
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return 5 * lado * lado / (4 * Math.tan(Math.PI / 5));
    }

    @Override
    public String toString() {
        return "Pentagono -> " + super.toString() + " | Lado: " + lado;
    }
}
