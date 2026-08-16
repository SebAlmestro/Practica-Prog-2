package electrodomesticos;

public class Main {

    public static void main(String[] args) {

        Electrodomestico e = new Electrodomestico("Heladera", 100, "Blanca", 44, 2);
        System.out.println(e);
        System.out.println("Es bajo consumo  " + e.esBajoConsumo());
        System.out.println("Balance  " + e.calcularBalance());
        System.out.println("Es alta gama  " + e.esAltaGama());
    }
}
