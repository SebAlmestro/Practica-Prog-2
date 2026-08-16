package electrodomesticos;

public class Electrodomestico{
    //valores por defecto y constantes
    private static final String COLOR_DEFEC = "Gris Plata";
    private static final int PRECIO_DEFEC = 100;
    private static final int CONSUMO_DEFEC = 10;
    private static final double PESO_DEFEC = 2;
    private static final int BAJO_CONSUMO = 45;
    private static final int ALTA_GAMA = 3;


    //atributos
private String nombre;
private double precio;
private String color;
private int consumoEnergetico;
private double peso;
//constructores
public Electrodomestico(String nombre){
    this(nombre, PRECIO_DEFEC);
}
public Electrodomestico(String nombre, double precio){
    this(nombre, precio, COLOR_DEFEC);
}
public Electrodomestico(String nombre, double precio, String color){
    this(nombre, precio, color, CONSUMO_DEFEC);
}
public Electrodomestico(String nombre, double precio, String color, int consumoEnergetico){
    this(nombre, precio, color, consumoEnergetico, PESO_DEFEC);
}
public Electrodomestico(String nombre, double precio, String color, int consumoEnergetico, double peso){
    this.nombre = nombre;
    this.precio = precio;
    this.color = color;
    this.consumoEnergetico = consumoEnergetico;
    this.peso = peso;
}
//getters y setters
public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public double getPrecio() {
    return precio;
}
public void setPrecio(double precio) {
    if(precio >= 0){
    this.precio = precio;
    }else{
        this.precio = PRECIO_DEFEC;
    }
}
public String getColor() {
    return color;
}
public void setColor(String color) {
    this.color = color;
}
public int getConsumoEnergetico() {
    return consumoEnergetico;
}
public void setConsumoEnergetico(int consumoEnergetico) {
    if(consumoEnergetico >= 0){
    this.consumoEnergetico = consumoEnergetico;
    }else{
        this.consumoEnergetico = CONSUMO_DEFEC;
    }
}
public double getPeso() {
    return peso;
}
public void setPeso(double peso) {
    if(peso >= 0){
    this.peso = peso;
    }else{
        this.peso = PESO_DEFEC;
    }
}
//responsabilidades de la clase
public boolean esBajoConsumo(){
    return this.consumoEnergetico < BAJO_CONSUMO;
}
public double calcularBalance(){
    return this.precio / this.peso;
}
public boolean esAltaGama(){
    return calcularBalance() > ALTA_GAMA;
}

// toString
    @Override
    public String toString() {
        return "Electrodomestico{" +
                "nombre='" + nombre + '\'' +
                ", precio='" + precio + '\'' +
                ", color=" + color +
                ", consumo='" + consumoEnergetico + '\'' +
                ", peso=" + peso +
                '}';
    }

}