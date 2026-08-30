package Tp3.sistemaDeEncuestas;
import java.util.ArrayList;

public class Encuesta {
    private ArrayList<Pregunta> preguntas;
    private Persona encuestado;
    private Empleado encuestador;
    private int id;
    
    public Encuesta(Persona encuestado, Empleado encuestador, int id) {
        this.preguntas = new ArrayList<>();
        this.encuestado = encuestado;
        this.encuestador = encuestador;
        this.id = id;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Pregunta> getPreguntas() {
        return preguntas;
    }
    public void agregarPregunta(Pregunta p){
        preguntas.add(p);
    }
    public Persona getEncuestado() {
        return encuestado;
    }
    public void setEncuestado(Persona encuestado) {
        this.encuestado = encuestado;
    }
    public Empleado getEncuestador() {
        return encuestador;
    }
    public void setEncuestador(Empleado encuestador) {
        this.encuestador = encuestador;
    }
    

}
