public class Main {
    public static void main(String[] args) {
        Personaje personaje = new Personaje();
        Mago mago = new Mago("Merlin", 8, 120);
        Guerrero guerrero = new Guerrero("Arthas", 10, "Espada legendaria");
        Villano villano = new Villano("Sombra", 12, 9);
        Aldeano aldeano = new Aldeano("Tom", 2, "Herrero");

        System.out.println(personaje);
        System.out.println(mago);
        System.out.println(guerrero);
        System.out.println(villano);
        System.out.println(aldeano);
    }
}
