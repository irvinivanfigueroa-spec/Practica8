import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        try {
            System.out.print("Ingresa el radio del círculo (mayor que 0): ");
            double radio = Double.parseDouble(entrada.nextLine().trim());
            Circulo circulo = new Circulo(radio);
            System.out.println("\nResultado:");
            System.out.println(circulo);
        } catch (NumberFormatException e) {
            System.out.println("Error: debes ingresar un valor numérico.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            entrada.close();
        }
    }
}
