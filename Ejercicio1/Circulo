public class Circulo extends Figura {
    private double radio;

    public Circulo() {
        this(1.0);
    }

    public Circulo(double radio) {
        super("Círculo");
        if (radio <= 0 || !Double.isFinite(radio)) {
            throw new IllegalArgumentException("El radio debe ser un número positivo y finito.");
        }
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public String toString() {
        return super.toString() + " | radio: " + radio + " | área: " + String.format("%.2f", calcularArea());
    }
}
