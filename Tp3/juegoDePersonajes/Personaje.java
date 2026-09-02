package Tp3.juegoDePersonajes;

import java.util.ArrayList;

public class Personaje {
    private String nombreReal, nombreSuperHeroe;
    private ArrayList<Caracteristica> caracteristicas;
    public Personaje(String nombreReal, String nombreSuperHeroe) {
        this.nombreReal = nombreReal;
        this.nombreSuperHeroe = nombreSuperHeroe;
        this.caracteristicas = new ArrayList<>();
    }
    public String getNombreReal() {
        return nombreReal;
    }
    public void setNombreReal(String nombreReal) {
        this.nombreReal = nombreReal;
    }
    public String getNombreSuperHeroe() {
        return nombreSuperHeroe;
    }
    public void setNombreSuperHeroe(String nombreSuperHeroe) {
        this.nombreSuperHeroe = nombreSuperHeroe;
    }
    public ArrayList<Caracteristica> getCaracteristicas() {
        return caracteristicas;
    }
    public void agregarCaracteristica(Caracteristica caracteristica){
        caracteristicas.add(caracteristica);
    }
    public String toString(){
        return "Nombre Real: " + nombreReal + "  Super Heroe: " + nombreSuperHeroe;
    }
    
}
