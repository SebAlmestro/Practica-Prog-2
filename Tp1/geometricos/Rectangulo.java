package geometricos;

public class Rectangulo {
    private static final int ES_MAYOR = 1;
    private static final int ES_MENOR = -1;
    private static final int ES_IGUAL = 0;
    // atributos
    private PuntoGeometrico vertice1;
    private PuntoGeometrico vertice2;
    private PuntoGeometrico vertice3;
    private PuntoGeometrico vertice4;

    // constructores
    public Rectangulo(PuntoGeometrico v1, PuntoGeometrico v2, PuntoGeometrico v3, PuntoGeometrico v4) {
        this.vertice1 = v1;
        this.vertice2 = v2;
        this.vertice3 = v3;
        this.vertice4 = v4;
    }

    // responsabilidades
    public void desplazarRectangulo(int desX, int desY) {
        vertice1.desplazarPuntoGeometrico(desX, desY);
        vertice2.desplazarPuntoGeometrico(desX, desY);
        vertice3.desplazarPuntoGeometrico(desX, desY);
        vertice4.desplazarPuntoGeometrico(desX, desY);

    }

    public double calcularAreaRectangulo() {
        double base = Math.abs(vertice2.getX() - vertice1.getX());
        double altura = Math.abs(vertice4.getY() - vertice1.getY());
        return base * altura;
    }

    public int compararRectangulos(Rectangulo otroRectangulo) {
        double areaRectangulo1 = this.calcularAreaRectangulo();
        double areaRectangulo2 = otroRectangulo.calcularAreaRectangulo();
        if (areaRectangulo1 > areaRectangulo2) {
            return ES_MAYOR;
        } else if (areaRectangulo1 < areaRectangulo2) {
            return ES_MENOR;
        } else {
            return ES_IGUAL;
        }
    }

    public boolean esCuadrado() {
        double base = Math.abs(vertice2.getX() - vertice1.getX());
        double altura = Math.abs(vertice4.getY() - vertice1.getY());
        return base == altura;
    }

    public double calcularLargoLadoSuperior() {
        return Math.abs(vertice2.getX() - vertice1.getX());
    }

    public boolean estaParado() {
        double ancho = Math.abs(vertice2.getX() - vertice1.getX());
        double alto = Math.abs(vertice4.getY() - vertice1.getY());

        return alto > ancho;
    }

    @Override
    public String toString() {
        return "Rectangulo\n" +
                "vertice1=" + vertice1 + "\n" +
                "vertice2=" + vertice2 + "\n" +
                "vertice3=" + vertice3 + "\n" +
                "vertice4=" + vertice4 + "\n";
    }

}
