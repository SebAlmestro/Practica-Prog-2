package Tp3.fabricaDeMuebles;

public class Producto {
    private String tipo, color, madera;
    private double peso;
    private int costo;

    public Producto(String tipo, String color, String madera, double peso, int costo) {
        this.tipo = tipo;
        this.color = color;
        this.madera = madera;
        this.peso = peso;
        this.costo = costo;
    }
    public double calcularPrecioVenta() {
    return costo * 1.35;
}

    // getters y setters
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMadera() {
        return madera;
    }

    public void setMadera(String madera) {
        this.madera = madera;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String toString(){
        return " Producto: " + tipo + ", Color: " + color + ", Madera: " + madera +
        ", Peso: " + peso + ", Valor de Venta: " + calcularPrecioVenta() + ", Costo: " + costo + "\n";

    }

}
