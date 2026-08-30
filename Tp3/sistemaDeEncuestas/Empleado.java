package Tp3.sistemaDeEncuestas;

public class Empleado extends Persona {
    private int legajo;
    private int sueldo;

    public Empleado(String nombre, String apellido, int dni, int legajo, int sueldo) {
        super(nombre, apellido, dni);
        this.legajo = legajo;
        this.sueldo = sueldo;

    }
    public int getSueldo(){
        return sueldo;
    }
    public void setSueldo(int sueldo){
        this.sueldo = sueldo;
    }
    public int getLegajo() {
    return legajo;
    }

    public void setLegajo(int legajo) {
    this.legajo = legajo;
    }
    
    
}
