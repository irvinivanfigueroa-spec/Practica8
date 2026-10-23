public class Circulo extends Figura {
    private double radio;

    public Circulo() {
        this(1.0);
    }

    public Circulo(double radio) {
        this("Circulo", radio);
    }

    public Circulo(String nombre, double radio) {
        super(nombre);
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
        return "Circulo -> " + super.toString() + " | Radio: " + radio
                + " | Area: " + String.format("%.2f", calcularArea());
    }
}
