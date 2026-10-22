public class Main {
    public static void main(String[] args) {
        Figura figura = new Figura();
        Figura figura2 = new Figura("Figura de prueba");
        Circulo circulo1 = new Circulo();
        Circulo circulo2 = new Circulo(2.0);
        Circulo circulo3 = new Circulo("Circulo grande", 4.0);

        System.out.println(figura);
        System.out.println(figura2);
        System.out.println(circulo1);
        System.out.println(circulo2);
        System.out.println(circulo3);
    }
}
