public class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo() {
        this(1.0, 1.0);
    }

    public Rectangulo(double base, double altura) {
        this("Rectangulo", base, altura);
    }

    public Rectangulo(String nombre, double base, double altura) {
        super(nombre);
                this.base = base;
                this.altura = altura;
                System.out.println("[Rectangulo] inicializado");
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public String toString() {
        return super.toString() + " | base: " + base + " | altura: " + altura + " | area: " + String.format("%.2f", calcularArea());
    }
}
