public class Pentagono extends Figura {
    private double lado;
    private double apotema;

    public Pentagono() {
        this(1.0, 1.0);
    }

    public Pentagono(double lado, double apotema) {
        this("Pentagono", lado, apotema);
    }

    public Pentagono(String nombre, double lado, double apotema) {
        super(nombre);
                this.lado = lado;
                this.apotema = apotema;
                System.out.println("[Pentagono] inicializado");
    }

    @Override
    public double calcularArea() {
        return (5.0 * lado * apotema) / 2.0;
    }

    @Override
    public String toString() {
        return super.toString() + " | lado: " + lado + " | apotema: " + apotema + " | area: " + String.format("%.2f", calcularArea());
    }
}
