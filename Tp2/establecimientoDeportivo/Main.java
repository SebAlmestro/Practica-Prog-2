package Tp2.establecimientoDeportivo;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cancha canchaFutbol1 = new Cancha(400, "Futbol");
        Cancha canchaFutbol2 = new Cancha(400, "Futbol");

        Cancha canchaPadel1 = new Cancha(100, "Padel");
        Cancha canchaPadel2 = new Cancha(100, "Padel");
        Cancha canchaPadel3 = new Cancha(100, "Padel");
        Cancha canchaPadel4 = new Cancha(100, "Padel");

        Usuario usuario1 = new Usuario("Sebastian", "Almestro");

        Turno turno1 = new Turno(canchaPadel4, usuario1, LocalDate.of(2026, 8, 20));
    }
}
