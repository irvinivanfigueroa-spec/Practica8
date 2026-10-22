public class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(double lado) {
        super("Cuadrado");
        if (lado <= 0 || !Double.isFinite(lado)) throw new IllegalArgumentException("El lado debe ser positivo y finito.");
        this.lado = lado;
    }

    @Override public double calcularArea() { return lado * lado; }
}
