package Tp3.juegoDePersonajes;

public class Main {
    public static void main(String[] args) {
        Personaje heroe = new Personaje("Sebastian", "Ironman");
        Personaje villano = new Personaje("Lara", "SuperGirl");

        Caracteristica fuerza = new Caracteristica(50, "Fuerza");
        Caracteristica visionNocturna = new Caracteristica(20, "Vision Nocturna");

        Caracteristica fuerza1 = new Caracteristica(40, "Fuerza");
        Caracteristica visionNocturna1 = new Caracteristica(10, "Vision Nocturna");

        heroe.agregarCaracteristica(visionNocturna1);
        heroe.agregarCaracteristica(fuerza1);

        villano.agregarCaracteristica(visionNocturna);
        villano.agregarCaracteristica(fuerza);
        Juego juego = new Juego();

        Personaje ganador = juego.enfrentar(
                heroe,
                villano,
                "Fuerza",
                "Velocidad");
        System.out.println("Ganador/a= " + ganador);

    }
}
