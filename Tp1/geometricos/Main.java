package geometricos;

public class Main {
    public static void main(String[] args) {
        PuntoGeometrico pg = new PuntoGeometrico(2, 3);
        PuntoGeometrico pg2 = new PuntoGeometrico(1, 1);
        //rectangulo
        PuntoGeometrico p1 = new PuntoGeometrico(2, 3);
        PuntoGeometrico p2 = new PuntoGeometrico(6, 3);
        PuntoGeometrico p3 = new PuntoGeometrico(6, 7);
        PuntoGeometrico p4 = new PuntoGeometrico(2, 7);

        PuntoGeometrico p5 = new PuntoGeometrico(2, 3);
        PuntoGeometrico p6 = new PuntoGeometrico(6, 3);
        PuntoGeometrico p7 = new PuntoGeometrico(6, 7);
        PuntoGeometrico p8 = new PuntoGeometrico(2, 7);
        System.out.println(pg);
        pg.desplazarPuntoGeometrico(4, -1);
        System.out.println("Punto Desplazado " + pg);
        System.out.println("Distancia Euclidea " + pg.calcularDistanciaEuclidea(pg2));
        //rectangulo
        Rectangulo rec = new Rectangulo(p1, p2, p3, p4);
        Rectangulo rec2 = new Rectangulo(p5, p6, p7, p8);
        rec.desplazarRectangulo(1, 3);
        System.out.println(rec);
        System.out.println("Area Rectangulo: " + rec.calcularAreaRectangulo());
        System.out.println(rec.compararRectangulos(rec2));
        System.out.println("Es cuadrado: " + rec.esCuadrado());
        System.out.println("Está parado: " + rec.estaParado());
        
        
    }
}
