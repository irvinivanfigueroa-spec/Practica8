import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    private static Scanner sc;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        sc = new Scanner(System.in);
        ArrayList<Figura> figuras = new ArrayList<Figura>();
        int opcion;

        do {
            mostrarMenu();
            opcion = leerOpcion();

            switch (opcion) {
                case 1:
                    figuras.add(new Circulo());
                    System.out.println("Circulo por defecto registrado.");
                    break;
                case 2:
                    registrarCirculo(figuras);
                    break;
                case 3:
                    registrarCirculoConNombre(figuras);
                    break;
                case 4:
                    mostrarFiguras(figuras);
                    break;
                case 5:
                    System.out.println("Fin del programa.");
                    break;
                default:
                    System.out.println("Opcion no disponible.");
            }
        } while (opcion != 5);
    }

    private static void mostrarMenu() {
        System.out.println("\n=== MENU FIGURAS ===");
        System.out.println("1. Crear circulo por defecto (radio 1.0)");
        System.out.println("2. Crear circulo con radio");
        System.out.println("3. Crear circulo con nombre y radio");
        System.out.println("4. Mostrar figuras");
        System.out.println("5. Salir");
        System.out.print("Opcion: ");
    }

    private static int leerOpcion() {
        String linea = sc.nextLine().trim();
        try {
            return Integer.parseInt(linea);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private static double leerRadio() {
        while (true) {
            System.out.print("Radio: ");
            String linea = sc.nextLine().trim();
            try {
                double radio = Double.parseDouble(linea);
                if (Double.isNaN(radio) || Double.isInfinite(radio)) {
                    System.out.println("Dato no valido, ingrese un numero finito.");
                } else if (radio < 0) {
                    System.out.println("No se permiten valores negativos.");
                } else if (radio == 0) {
                    System.out.println("El radio debe ser mayor que cero.");
                } else {
                    return radio;
                }
            } catch (NumberFormatException e) {
                System.out.println("Dato no valido, ingrese un numero.");
            }
        }
    }

    private static String leerTexto(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String texto = sc.nextLine().trim();
            if (!texto.isEmpty()) {
                return texto;
            }
            System.out.println("El texto no puede estar vacio.");
        }
    }

    private static void registrarCirculo(ArrayList<Figura> figuras) {
        double radio = leerRadio();
        figuras.add(new Circulo(radio));
        System.out.println("Circulo registrado.");
    }

    private static void registrarCirculoConNombre(ArrayList<Figura> figuras) {
        String nombre = leerTexto("Nombre: ");
        double radio = leerRadio();
        figuras.add(new Circulo(nombre, radio));
        System.out.println("Circulo registrado: " + nombre);
    }

    private static void mostrarFiguras(ArrayList<Figura> figuras) {
        if (figuras.isEmpty()) {
            System.out.println("No hay figuras registradas.");
            return;
        }
        System.out.println("\n--- Figuras registradas ---");
        for (Figura f : figuras) {
            System.out.println(f);
        }
    }
}
