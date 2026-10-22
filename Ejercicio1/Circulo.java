public class Circulo extends Figura {
    private double radio;

    public Circulo() {
        this("Circulo basico", 1.0);
    }

    public Circulo(double radio) {
        this("Circulo", radio);
    }

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
        System.out.println("[Circulo] inicializado con radio " + radio);
    }

    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public String toString() {
        return super.toString() + " | radio: " + radio + " | area: " + String.format("%.2f", calcularArea());
    }
}
