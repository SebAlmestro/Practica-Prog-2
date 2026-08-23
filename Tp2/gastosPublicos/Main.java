package Tp2.gastosPublicos;

public class Main {

    public static void main(String[] args) {

        // =========================
        // CREAR CIUDADES
        // =========================

        // Provincia 1
        Ciudad c1 = new Ciudad("Ciudad A",
                1000, 1000, 1000, 1000, 1000,
                6000, 200000); // Recauda 5000, gasta 6000 -> DEFICITARIA

        Ciudad c2 = new Ciudad("Ciudad B",
                2000, 2000, 2000, 2000, 2000,
                5000, 150000); // Recauda 10000 -> NO deficitaria

        Ciudad c3 = new Ciudad("Ciudad C",
                500, 500, 500, 500, 500,
                3000, 80000); // Menos de 100.000 -> NO se analiza


        // Provincia 2
        Ciudad c4 = new Ciudad("Ciudad D",
                1000, 1000, 1000, 1000, 1000,
                7000, 300000); // Recauda 5000 -> DEFICITARIA

        Ciudad c5 = new Ciudad("Ciudad E",
                3000, 3000, 3000, 3000, 3000,
                5000, 250000); // Recauda 15000 -> NO deficitaria

        Ciudad c6 = new Ciudad("Ciudad F",
                500, 500, 500, 500, 500,
                3000, 50000); // Menos de 100.000 -> NO se analiza


        // =========================
        // CREAR PROVINCIAS
        // =========================

        Provincia provincia1 = new Provincia("Provincia 1");

        provincia1.agregarCiudad(c1);
        provincia1.agregarCiudad(c2);
        provincia1.agregarCiudad(c3);


        Provincia provincia2 = new Provincia("Provincia 2");

        provincia2.agregarCiudad(c4);
        provincia2.agregarCiudad(c5);
        provincia2.agregarCiudad(c6);


        // =========================
        // CREAR PAIS
        // =========================

        Pais pais = new Pais("Argentina");

        pais.agregarProvincia(provincia1);
        pais.agregarProvincia(provincia2);


        // =========================
        // PROBAR CIUDADES DEFICITARIAS
        // =========================

        System.out.println("CIUDADES GRANDES DEFICITARIAS:");

        for (Ciudad ciudad : pais.ciudadesEnDeficit()) {
            System.out.println("- " + ciudad.getNombre());
        }


        // =========================
        // PROBAR PROVINCIAS
        // =========================

        System.out.println("\nPROVINCIAS CON MAYORIA EN DEFICIT:");

        for (Provincia provincia : pais.mayoriaProvinciasDeficit()) {
            System.out.println("- " + provincia.getNombre());
        }
    }
}