public class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo() {
        this(1.0, 1.0);
    }

    public Triangulo(double base, double altura) {
        this("Triangulo", base, altura);
    }

    public Triangulo(String nombre, double base, double altura) {
        super(nombre);
                this.base = base;
                this.altura = altura;
                System.out.println("[Triangulo] inicializado");
    }

    @Override
    public double calcularArea() {
        return base * altura / 2.0;
    }

    @Override
    public String toString() {
        return super.toString() + " | base: " + base + " | altura: " + altura + " | area: " + String.format("%.2f", calcularArea());
    }
}
