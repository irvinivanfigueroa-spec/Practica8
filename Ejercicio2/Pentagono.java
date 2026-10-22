public class Pentagono extends Figura {
    private double lado;
    private double apotema;

    public Pentagono(double lado, double apotema) {
        super("Pentágono regular");
        if (lado <= 0 || apotema <= 0 || !Double.isFinite(lado) || !Double.isFinite(apotema)) {
            throw new IllegalArgumentException("El lado y la apotema deben ser positivos y finitos.");
        }
        this.lado = lado;
        this.apotema = apotema;
    }

    @Override public double calcularArea() { return (5 * lado * apotema) / 2.0; }
}
