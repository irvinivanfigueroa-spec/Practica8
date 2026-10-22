import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        try {
            System.out.println("=== Cálculo de áreas ===");
            System.out.print("Base del triángulo: ");
            double baseTri = leerNumero(entrada);
            System.out.print("Altura del triángulo: ");
            double alturaTri = leerNumero(entrada);
            System.out.print("Lado del cuadrado: ");
            double ladoCua = leerNumero(entrada);
            System.out.print("Base del rectángulo: ");
            double baseRec = leerNumero(entrada);
            System.out.print("Altura del rectángulo: ");
            double alturaRec = leerNumero(entrada);
            System.out.print("Radio del círculo: ");
            double radio = leerNumero(entrada);
            System.out.print("Lado del pentágono regular: ");
            double ladoPen = leerNumero(entrada);
            System.out.print("Apotema del pentágono regular: ");
            double apotema = leerNumero(entrada);

            Figura[] figuras = {
                new Triangulo(baseTri, alturaTri), new Cuadrado(ladoCua),
                new Rectangulo(baseRec, alturaRec), new Circulo(radio), new Pentagono(ladoPen, apotema)
            };
            System.out.println("\nResultados:");
            for (Figura figura : figuras) System.out.println(figura);
        } catch (NumberFormatException e) {
            System.out.println("Error: todas las entradas deben ser números.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            entrada.close();
        }
    }

    private static double leerNumero(Scanner entrada) {
        return Double.parseDouble(entrada.nextLine().trim());
    }
}
