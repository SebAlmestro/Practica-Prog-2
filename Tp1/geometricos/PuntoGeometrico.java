package geometricos;

public class PuntoGeometrico {
    //defecto y const globales
    private static final int X_DEFEC = 0;
    private static final int Y_DEFEC = 0;

    //atributos
    private int x;
    private int y;

    //contructores
    public PuntoGeometrico(){
        this(X_DEFEC, Y_DEFEC);
    }

    public PuntoGeometrico(int x, int y){
        this.x = x;
        this.y = y;
    }

    //responsabilidades
    public void desplazarPuntoGeometrico(int desX, int desY){
    this.x += desX;
    this.y += desY;
    }
    public double calcularDistanciaEuclidea(PuntoGeometrico otroPunto){
        double diferenciaX = otroPunto.x - this.x;
        double diferenciaY = otroPunto.y - this.y;
        double distancia = Math.sqrt((diferenciaX * diferenciaX) + (diferenciaY * diferenciaY));
        return distancia;
    }
    //getters y setters

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // toString
    @Override
public String toString() {
    return "PuntoGeometrico{" +
            "X=" + x +
            ", Y=" + y +
            '}';
}
}
