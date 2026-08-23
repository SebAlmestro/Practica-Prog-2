package Tp2.gastosPublicos;

import java.util.ArrayList;

public class Provincia {
    private String nombre;
    private ArrayList<Ciudad> ciudades;
    public Provincia(String nombre){
        this.nombre = nombre;
        this.ciudades = new ArrayList<>();
    }
    public boolean mayoriaEnDeficit(){
        int deficit = 0;
        int ciudadGrande = 0;
        for(int i = 0; i < ciudades.size(); i++){
            if(ciudades.get(i).esCiudadGrande()){
                ciudadGrande++;
                if(ciudades.get(i).esDeficitaria()){
                deficit++;
            }
            }
            
        }
        return deficit > ciudadGrande/2;

        
    }
    public void agregarCiudad(Ciudad ciudad){
        ciudades.add(ciudad);
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList<Ciudad> getCiudades() {
        return ciudades;
    }
    @Override
public String toString() {
    return "Provincia{" +
            "nombre='" + nombre + '\'' +
            ", ciudades=" + ciudades +
            '}';
}

}
