public class Main {
    public static void main(String[] args) {
        Figura[] figuras = {
            new Triangulo(),
            new Triangulo(4.0, 3.0),
            new Cuadrado(),
            new Cuadrado(2.0),
            new Rectangulo(4.0, 3.0),
            new Circulo(2.0),
            new Pentagono(2.0, 1.4)
        };

        for (Figura figura : figuras) {
            System.out.println(figura);
        }
    }
}
