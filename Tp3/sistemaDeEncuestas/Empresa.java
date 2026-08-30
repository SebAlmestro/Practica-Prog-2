package Tp3.sistemaDeEncuestas;

import java.util.ArrayList;


public class Empresa {
    private final static int PLUS = 5000;
    private final static int ENCUESTAS_REALIZADAS_PLUS = 10;
    private ArrayList<Encuesta> encuestas;
    private ArrayList<Empleado> empleados;
    public Empresa() {
        this.encuestas = new ArrayList<>();
        this.empleados = new ArrayList<>();
    }
    public int encuestasRealizadasEmpleado(Empleado empleado){
        int encuestasRealizadas = 0;
            for(int i = 0; i < encuestas.size(); i++){
                if(encuestas.get(i).getEncuestador().equals(empleado)){
                    encuestasRealizadas++;
                }
                }
                return encuestasRealizadas;
            }
    public int plusPorEncuestasRealizadas(Empleado empleado){
        int cobro = empleado.getSueldo();
        if(encuestasRealizadasEmpleado(empleado) >= ENCUESTAS_REALIZADAS_PLUS){
            cobro+= PLUS;
        }
        return cobro;

    }
    public void agregarEncuesta(Encuesta encuesta) {

    for (int i = 0; i < encuestas.size(); i++) {

        Encuesta e = encuestas.get(i);

        if (e.getId() == encuesta.getId()
                && e.getEncuestado().getDni() == encuesta.getEncuestado().getDni()) {

            System.out.println("La persona ya respondio esta encuesta.");
            return;
        }
    }

    encuestas.add(encuesta);
}
    public void agregarEmpleado(Empleado empleado){
        empleados.add(empleado);
    }
    public ArrayList<Encuesta> getEncuestas() {
        return encuestas;
    }
    
    
}
