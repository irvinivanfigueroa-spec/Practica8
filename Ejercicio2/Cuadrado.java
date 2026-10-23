public class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(double lado) {
        super("Cuadrado");
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public String toString() {
        return "Cuadrado -> " + super.toString() + " | Lado: " + lado;
    }
}
