public class Cuadrado extends Figura {
    private double lado;

    public Cuadrado() {
        this(1.0);
    }

    public Cuadrado(double lado) {
        this("Cuadrado", lado);
    }

    public Cuadrado(String nombre, double lado) {
        super(nombre);
                this.lado = lado;
                System.out.println("[Cuadrado] inicializado");
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public String toString() {
        return super.toString() + " | lado: " + lado + " | area: " + String.format("%.2f", calcularArea());
    }
}
