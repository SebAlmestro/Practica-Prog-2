package Tp2.series;

public class Episodio {
    // constantes globales
    private static final int MIN_CALIF = 0;
    private static final int MAX_CALIF = 5;
    private static final int NO_SE_VIO = -1;
    // atributos
    private String titulo;
    private String descripcion;
    private boolean seVio;
    private int calificacion;

    // constructor
    public Episodio(String titulo, String descripcion, boolean seVio, int calificacion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.seVio = seVio;
        if (!seVio) {
            this.calificacion = NO_SE_VIO;
        } else if (calificacion >= MIN_CALIF && calificacion <= MAX_CALIF) {
            this.calificacion = calificacion;
        } else {
            this.calificacion = NO_SE_VIO;
        }
    }

    // responsabilidades
    public void calificarEpisodio(int nuevaCalificacion) {
        if (seVio && nuevaCalificacion >= MIN_CALIF && nuevaCalificacion <= MAX_CALIF) {
            this.calificacion = nuevaCalificacion;
        } else {
            System.out.println("Calificacion No Valida");
        }

    }

    // getters y setters

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

    if (!seVio) {
        this.calificacion = NO_SE_VIO;
    }
}

    public int getCalificacion() {
        return calificacion;
    }

}
