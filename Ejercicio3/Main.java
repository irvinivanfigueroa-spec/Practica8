import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        try {
            System.out.println("=== Creador de personajes ===");
            System.out.print("Nombre del mago: ");
            String nombreMago = entrada.nextLine().trim();
            System.out.print("Vida del mago: ");
            int vidaMago = Integer.parseInt(entrada.nextLine().trim());
            System.out.print("Mana del mago (0 o más): ");
            int mana = Integer.parseInt(entrada.nextLine().trim());

            System.out.print("Nombre del guerrero: ");
            String nombreGuerrero = entrada.nextLine().trim();
            System.out.print("Vida del guerrero: ");
            int vidaGuerrero = Integer.parseInt(entrada.nextLine().trim());
            System.out.print("Arma del guerrero: ");
            String arma = entrada.nextLine().trim();

            System.out.print("Nombre del villano: ");
            String nombreVillano = entrada.nextLine().trim();
            System.out.print("Vida del villano: ");
            int vidaVillano = Integer.parseInt(entrada.nextLine().trim());
            System.out.print("Nivel de amenaza (1 a 10): ");
            int amenaza = Integer.parseInt(entrada.nextLine().trim());

            System.out.print("Nombre del aldeano: ");
            String nombreAldeano = entrada.nextLine().trim();
            System.out.print("Vida del aldeano: ");
            int vidaAldeano = Integer.parseInt(entrada.nextLine().trim());
            System.out.print("Oficio del aldeano: ");
            String oficio = entrada.nextLine().trim();

            Personaje[] personajes = {
                new Mago(nombreMago, vidaMago, mana),
                new Guerrero(nombreGuerrero, vidaGuerrero, arma),
                new Villano(nombreVillano, vidaVillano, amenaza),
                new Aldeano(nombreAldeano, vidaAldeano, oficio)
            };
            System.out.println("\n=== Personajes creados ===");
            for (Personaje personaje : personajes) System.out.println(personaje.presentarse());
        } catch (NumberFormatException e) {
            System.out.println("Error: vida, mana y nivel de amenaza deben ser números enteros.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            entrada.close();
        }
    }
}
