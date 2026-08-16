package geometricos;

public class Main {
    public static void main(String[] args) {
        PuntoGeometrico pg = new PuntoGeometrico(1, 1);
        System.out.println(pg);
        pg.desplazarPuntoGeometrico(pg.getX(), pg.getY(), 2, 2);
        System.out.println(pg);
        
    }
}
