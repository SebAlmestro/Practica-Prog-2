package Tp3.fabricaDeMuebles;

public class Main {
    public static void main(String[] args) {
        Producto silla1 = new Producto("silla", "blanco", "roble", 10, 2500);
        Producto banco1 = new Producto("banco", "negro", "acasia", 12, 3000);
        Producto mesa1 = new Producto("mesa", "rojo", "acasia", 20, 4000);

        Fabrica fabrica = new Fabrica();
    
        fabrica.agregarProducto(silla1);
        fabrica.agregarProducto(banco1);
        fabrica.agregarProducto(mesa1);
        System.out.println(fabrica);
        System.out.println("Costo total de Fabrica: " + fabrica.calcularCostoStock());
        System.out.println("Venta total de Fabrica: " + fabrica.calcularVentaStock());
        System.out.println("El precio de venta de " + silla1.calcularPrecioVenta());
        
    }
    

    
}
