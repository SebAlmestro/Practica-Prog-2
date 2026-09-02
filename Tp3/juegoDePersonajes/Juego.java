package Tp3.juegoDePersonajes;

public class Juego {

    public Personaje enfrentar(Personaje p1, Personaje p2,
            String caracteristicaPrincipal,
            String caracteristicaDesempate) {

        Caracteristica c1 = buscarCaracteristica(p1, caracteristicaPrincipal);
        Caracteristica c2 = buscarCaracteristica(p2, caracteristicaPrincipal);

        if (c1.getNivel() > c2.getNivel()) {
            return p1;
        }

        if (c2.getNivel() > c1.getNivel()) {
            return p2;
        }

        // Empate: usamos la segunda característica
        c1 = buscarCaracteristica(p1, caracteristicaDesempate);
        c2 = buscarCaracteristica(p2, caracteristicaDesempate);

        if (c1.getNivel() > c2.getNivel()) {
            return p1;
        }

        if (c2.getNivel() > c1.getNivel()) {
            return p2;
        }

        // Si también empatan en la segunda
        return null;
    }

    public Caracteristica buscarCaracteristica(Personaje personaje, String tipo) {

        for (int i = 0; i < personaje.getCaracteristicas().size(); i++) {

            Caracteristica caracteristica = personaje.getCaracteristicas().get(i);

            if (caracteristica.getTipo().equals(tipo)) {
                return caracteristica;
            }
        }

        return null;
    }
}