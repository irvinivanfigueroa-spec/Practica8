import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    private static Scanner sc;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        sc = new Scanner(System.in);
        ArrayList<Personaje> personajes = new ArrayList<Personaje>();
        int opcion;

        do {
            mostrarMenu();
            opcion = leerOpcion();

            switch (opcion) {
                case 1:
                    registrarMago(personajes);
                    break;
                case 2:
                    registrarGuerrero(personajes);
                    break;
                case 3:
                    registrarVillano(personajes);
                    break;
                case 4:
                    registrarAldeano(personajes);
                    break;
                case 5:
                    mostrarPersonajes(personajes);
                    break;
                case 6:
                    System.out.println("Fin del programa.");
                    break;
                default:
                    System.out.println("Opcion no disponible.");
            }
        } while (opcion != 6);
    }

    private static void mostrarMenu() {
        System.out.println("\n=== MENU VIDEOJUEGO ===");
        System.out.println("1. Registrar mago");
        System.out.println("2. Registrar guerrero");
        System.out.println("3. Registrar villano");
        System.out.println("4. Registrar aldeano");
        System.out.println("5. Mostrar personajes");
        System.out.println("6. Salir");
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

    private static int leerEntero(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String linea = sc.nextLine().trim();
            try {
                int numero = Integer.parseInt(linea);
                if (numero < 0) {
                    System.out.println("No se permiten valores negativos.");
                } else {
                    return numero;
                }
            } catch (NumberFormatException e) {
                System.out.println("Dato no valido, ingrese un numero entero.");
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

    private static void registrarMago(ArrayList<Personaje> personajes) {
        String nombre = leerTexto("Nombre: ");
        int ataque = leerEntero("Ataque: ");
        int mana = leerEntero("Mana: ");
        personajes.add(new Mago(nombre, ataque, mana));
        System.out.println("Mago registrado: " + nombre);
    }

    private static void registrarGuerrero(ArrayList<Personaje> personajes) {
        String nombre = leerTexto("Nombre: ");
        int ataque = leerEntero("Ataque: ");
        int armadura = leerEntero("Armadura: ");
        personajes.add(new Guerrero(nombre, ataque, armadura));
        System.out.println("Guerrero registrado: " + nombre);
    }

    private static void registrarVillano(ArrayList<Personaje> personajes) {
        String nombre = leerTexto("Nombre: ");
        int vida = leerEntero("Vida: ");
        int ataque = leerEntero("Ataque: ");
        int amenaza = leerEntero("Amenaza: ");
        personajes.add(new Villano(nombre, vida, ataque, amenaza));
        System.out.println("Villano registrado: " + nombre);
    }

    private static void registrarAldeano(ArrayList<Personaje> personajes) {
        String nombre = leerTexto("Nombre: ");
        int oro = leerEntero("Oro: ");
        personajes.add(new Aldeano(nombre, oro));
        System.out.println("Aldeano registrado: " + nombre);
    }

    private static void mostrarPersonajes(ArrayList<Personaje> personajes) {
        if (personajes.isEmpty()) {
            System.out.println("No hay personajes registrados.");
            return;
        }
        System.out.println("\n--- Personajes ---");
        for (Personaje p : personajes) {
            System.out.println(p + " | Dano: " + p.calcularDano());
        }
    }
}
