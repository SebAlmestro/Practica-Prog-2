package Tp2.series;

public class Episodio {
    //atributos
    private String titulo;
    private String descripcion;
    private boolean seVio;
    private int calificacion;
    //constructor
    public Episodio(String titulo, String descripcion, boolean seVio, int calificacion){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.seVio = seVio;
        this.calificacion = calificacion;
    }
    //responsabilidades

    //getters y setters

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public boolean getSeVio() {
        return seVio;
    }
    public void setSeVio(boolean seVio) {
        this.seVio = seVio;
    }
    public int getCalificacion() {
        return calificacion;
    }
    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    

    



}
