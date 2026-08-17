package geometricos;

public class Rectangulo2 {
    private static final int ES_MAYOR = 1;
    private static final int ES_MENOR = -1;
    private static final int ES_IGUAL = 0;

    // Atributos
    private PuntoGeometrico vertice;
    private double ancho;
    private double alto;
    private int direccionX;
    private int direccionY;

    // Constructor con un vértice, lados y dirección
    public Rectangulo2(PuntoGeometrico vertice, double ancho, double alto,
                    int direccionX, int direccionY) {
        this.vertice = vertice;
        this.ancho = ancho;
        this.alto = alto;
        this.direccionX = direccionX;
        this.direccionY = direccionY;
    }

    // Constructor con los 4 vértices
    public Rectangulo2(PuntoGeometrico v1, PuntoGeometrico v2,
                    PuntoGeometrico v3, PuntoGeometrico v4) {

        this.vertice = v1;

        this.ancho = Math.abs(v2.getX() - v1.getX());
        this.alto = Math.abs(v4.getY() - v1.getY());

        if (v2.getX() > v1.getX()) {
            this.direccionX = 1;
        } else {
            this.direccionX = -1;
        }

        if (v4.getY() > v1.getY()) {
            this.direccionY = 1;
        } else {
            this.direccionY = -1;
        }
    }

    // Responsabilidades

    public void desplazarRectangulo(int desX, int desY) {
        this.vertice.desplazarPuntoGeometrico(desX, desY);
    }

    public double calcularAreaRectangulo() {
        return this.ancho * this.alto;
    }

    public int compararRectangulos(Rectangulo otroRectangulo) {

        double areaActual = this.calcularAreaRectangulo();
        double areaOtro = otroRectangulo.calcularAreaRectangulo();

        if (areaActual > areaOtro) {
            return ES_MAYOR;
        } else if (areaActual < areaOtro) {
            return ES_MENOR;
        } else {
            return ES_IGUAL;
        }
    }

    public boolean esCuadrado() {
        return this.ancho == this.alto;
    }

    public double calcularLargoLadoSuperior() {
        return this.ancho;
    }

    public boolean estaParado() {
        return this.alto > this.ancho;
    }

    // Getters y setters

    public PuntoGeometrico getVertice() {
        return vertice;
    }

    public void setVertice(PuntoGeometrico vertice) {
        this.vertice = vertice;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public int getDireccionX() {
        return direccionX;
    }

    public void setDireccionX(int direccionX) {
        this.direccionX = direccionX;
    }

    public int getDireccionY() {
        return direccionY;
    }

    public void setDireccionY(int direccionY) {
        this.direccionY = direccionY;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "vertice=" + vertice +
                ", ancho=" + ancho +
                ", alto=" + alto +
                ", direccionX=" + direccionX +
                ", direccionY=" + direccionY +
                '}';
    }
}
