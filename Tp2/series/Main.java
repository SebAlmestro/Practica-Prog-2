package Tp2.series;

public class Main {
    public static void main(String[] args) {

        // =========================
        // EPISODIOS TEMPORADA 1
        // =========================

        Episodio e1 = new Episodio(
                "Episodio 1",
                "Primer episodio",
                true,
                5);

        Episodio e2 = new Episodio(
                "Episodio 2",
                "Segundo episodio",
                true,
                4);

        Episodio e3 = new Episodio(
                "Episodio 3",
                "Tercer episodio",
                false,
                0);

        // =========================
        // TEMPORADA 1
        // =========================

        Temporada temporada1 = new Temporada();

        temporada1.agregarEpisodio(e1);
        temporada1.agregarEpisodio(e2);
        temporada1.agregarEpisodio(e3);

        // =========================
        // EPISODIOS TEMPORADA 2
        // =========================

        Episodio e4 = new Episodio(
                "Episodio 1",
                "Primer episodio de la segunda temporada",
                true,
                3);

        Episodio e5 = new Episodio(
                "Episodio 2",
                "Segundo episodio de la segunda temporada",
                false,
                0);

        // =========================
        // TEMPORADA 2
        // =========================

        Temporada temporada2 = new Temporada();

        temporada2.agregarEpisodio(e4);
        temporada2.agregarEpisodio(e5);

        // =========================
        // SERIE
        // =========================

        Serie serie = new Serie(
                "Mi Serie",
                "Una serie de prueba",
                "Seba",
                "Comedia");

        serie.agregarTemporada(temporada1);
        serie.agregarTemporada(temporada2);

        // =========================
        // PRUEBAS
        // =========================

        System.out.println("===== PRUEBAS =====");

        // Episodios vistos por temporada
        System.out.println(
                "Episodios vistos T1: "
                        + temporada1.getEpisodiosVistosTemporada());

        System.out.println(
                "Episodios vistos T2: "
                        + temporada2.getEpisodiosVistosTemporada());

        // Episodios vistos de la serie
        System.out.println(
                "Episodios vistos de la serie: "
                        + serie.getEpisodiosVistosSerie());

        // Promedio temporada
        System.out.println(
                "Promedio T1: "
                        + temporada1.getPromedioCalificacionTemporada());

        System.out.println(
                "Promedio T2: "
                        + temporada2.getPromedioCalificacionTemporada());

        // Promedio serie
        System.out.println(
                "Promedio de la serie: "
                        + serie.getPromedioCalificacionSerie());

        // ¿Se vieron todos?
        System.out.println(
                "¿Se vieron todos los episodios?: "
                        + serie.seVieronTodos());

        // =========================
        // PROBAR CALIFICACIÓN
        // =========================

        System.out.println("\n===== CALIFICAR EPISODIO =====");

        System.out.println(
                "Calificación anterior: "
                        + e1.getCalificacion());

        e1.calificarEpisodio(3);

        System.out.println(
                "Nueva calificación: "
                        + e1.getCalificacion());

        // Probar calificación inválida
        e1.calificarEpisodio(8);

        System.out.println(
                "Calificación después de ingresar 8: "
                        + e1.getCalificacion());
    }
}
