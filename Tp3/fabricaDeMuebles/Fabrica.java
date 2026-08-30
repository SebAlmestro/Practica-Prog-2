package Tp3.fabricaDeMuebles;

import java.util.ArrayList;

public class Fabrica {
    private ArrayList<Producto> productos;
    public Fabrica(){
        this.productos = new ArrayList<>();
    }
    public void agregarProducto(Producto producto){
        productos.add(producto);
    }
    public int calcularCostoStock(){
        int costoTotal = 0;
        for(int i = 0; i< productos.size(); i++){
            costoTotal+= productos.get(i).getCosto();
        }
        return costoTotal;
    }
    public int calcularVentaStock(){
        int ventaTotal = 0;
        for(int i = 0; i<productos.size(); i++){
            ventaTotal+=productos.get(i).calcularPrecioVenta();

        }
        return ventaTotal;
    }
    


    public String toString() {
    return "Fabrica{" +
            "stock=" + productos +
            '}';
}
}
