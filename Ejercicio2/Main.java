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
                    registrarTriangulo(figuras);
                    break;
                case 2:
                    registrarCuadrado(figuras);
                    break;
                case 3:
                    registrarRectangulo(figuras);
                    break;
                case 4:
                    registrarCirculo(figuras);
                    break;
                case 5:
                    registrarPentagono(figuras);
                    break;
                case 6:
                    mostrarFiguras(figuras);
                    break;
                case 7:
                    mostrarAreaTotal(figuras);
                    break;
                case 8:
                    System.out.println("Fin del programa.");
                    break;
                default:
                    System.out.println("Opcion no disponible.");
            }
        } while (opcion != 8);
    }

    private static void mostrarMenu() {
        System.out.println("\n=== MENU FIGURAS GEOMETRICAS ===");
        System.out.println("1. Registrar triangulo");
        System.out.println("2. Registrar cuadrado");
        System.out.println("3. Registrar rectangulo");
        System.out.println("4. Registrar circulo");
        System.out.println("5. Registrar pentagono");
        System.out.println("6. Mostrar figuras y area");
        System.out.println("7. Mostrar area total");
        System.out.println("8. Salir");
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

    private static double leerMedida(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String linea = sc.nextLine().trim();
            try {
                double valor = Double.parseDouble(linea);
                if (Double.isNaN(valor) || Double.isInfinite(valor)) {
                    System.out.println("Dato no valido, ingrese un numero finito.");
                } else if (valor < 0) {
                    System.out.println("No se permiten valores negativos.");
                } else if (valor == 0) {
                    System.out.println("El valor debe ser mayor que cero.");
                } else {
                    return valor;
                }
            } catch (NumberFormatException e) {
                System.out.println("Dato no valido, ingrese un numero.");
            }
        }
    }

    private static void registrarTriangulo(ArrayList<Figura> figuras) {
        double base = leerMedida("Base: ");
        double altura = leerMedida("Altura: ");
        figuras.add(new Triangulo(base, altura));
        System.out.println("Triangulo registrado.");
    }

    private static void registrarCuadrado(ArrayList<Figura> figuras) {
        double lado = leerMedida("Lado: ");
        figuras.add(new Cuadrado(lado));
        System.out.println("Cuadrado registrado.");
    }

    private static void registrarRectangulo(ArrayList<Figura> figuras) {
        double base = leerMedida("Base: ");
        double altura = leerMedida("Altura: ");
        figuras.add(new Rectangulo(base, altura));
        System.out.println("Rectangulo registrado.");
    }

    private static void registrarCirculo(ArrayList<Figura> figuras) {
        double radio = leerMedida("Radio: ");
        figuras.add(new Circulo(radio));
        System.out.println("Circulo registrado.");
    }

    private static void registrarPentagono(ArrayList<Figura> figuras) {
        double lado = leerMedida("Lado: ");
        figuras.add(new Pentagono(lado));
        System.out.println("Pentagono registrado.");
    }

    private static void mostrarFiguras(ArrayList<Figura> figuras) {
        if (figuras.isEmpty()) {
            System.out.println("No hay figuras registradas.");
            return;
        }
        System.out.println("\n--- Figuras registradas ---");
        for (Figura f : figuras) {
            System.out.println(f + " | Area: " + String.format("%.2f", f.calcularArea()));
        }
    }

    private static void mostrarAreaTotal(ArrayList<Figura> figuras) {
        if (figuras.isEmpty()) {
            System.out.println("No hay figuras registradas.");
            return;
        }
        double total = 0;
        for (Figura f : figuras) {
            total += f.calcularArea();
        }
        System.out.println("Area total: " + String.format("%.2f", total));
    }
}
