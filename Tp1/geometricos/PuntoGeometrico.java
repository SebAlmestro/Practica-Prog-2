package geometricos;

public class PuntoGeometrico {
    //defecto y const globales
    private final static int defecY = 0;
    private final static int defecX = 0;

    //atributos
    private int X;
    private int Y;

    //contructores
    public PuntoGeometrico(){
        this.X = defecX;
        this.Y = defecY;
    }

    public PuntoGeometrico(int X, int Y){
        this.X = X;
        this.Y = Y;
    }

    //responsabilidades
    public void desplazarPuntoGeometrico(int X, int Y, int desX, int desY){
     this.X += (desX);
    this.Y += (desY);
        
    }

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }

    // toString
    @Override
    public String toString() {
        return "Electrodomestico{" +
                "X= " + X + '\'' +
                ", Y= " + Y +
                '}';
    }





}
