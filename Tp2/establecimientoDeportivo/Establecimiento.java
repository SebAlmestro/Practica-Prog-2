package Tp2.establecimientoDeportivo;

import java.util.ArrayList;

public class Establecimiento {
    private String nombre;
    private ArrayList<Usuario> socios;
    private ArrayList<Turno> turnos;
    

    public Establecimiento(String nombre) {
        this.nombre = nombre;
        this.socios = new ArrayList<>();
        this.turnos = new ArrayList<>();
    }
    
    public ArrayList<Usuario> getSocios() {
        return socios;
    }
    public ArrayList<Turno> getTurnos() {
        return turnos;
    }

    public void agregarTurno(Turno turno){
        turnos.add(turno);
    }
    public void agregarSocio(Usuario socio){
        socios.add(socio);
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
