package Tp2.gastosPublicos;

import java.util.ArrayList;

public class Pais {
    private String nombre;
    private ArrayList<Provincia> provincias;
    public Pais(String nombre){
        this.nombre = nombre;
        this.provincias = new ArrayList<>();
    }
    public ArrayList<Ciudad> ciudadesEnDeficit(){
        ArrayList<Ciudad> cc = new ArrayList<>();
        for(int i = 0; i< provincias.size(); i++){
            Provincia provincia = provincias.get(i);
            for(int j = 0; j<provincia.getCiudades().size(); j++){
                Ciudad ciudad = provincia.getCiudades().get(j);
                if(ciudad.esCiudadGrande() && ciudad.esDeficitaria()){
                    cc.add(ciudad);

                }
            }
        }
        return cc;
    }
    public ArrayList<Provincia> mayoriaProvinciasDeficit(){
        ArrayList<Provincia> pp = new ArrayList<>();
        for(int i = 0; i< provincias.size(); i++){
            if(provincias.get(i).mayoriaEnDeficit()){
                pp.add(provincias.get(i));
            }
        }
        return pp;
    }

    public void agregarProvincia(Provincia provincia){
        provincias.add(provincia);
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
public String toString() {
    return "Pais{" +
            "nombre='" + nombre + '\'' +
            ", provincias=" + provincias +
            '}';
}
    
}
