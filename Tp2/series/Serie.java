package Tp2.series;

public class Serie {
    //atributos
    private String titulo;
    private String descripcion;
    private String creador;
    private String genero;
    private Temporada[] temporadas;

    //constructor
    public Serie(String titulo, String descripcion, String creador, String genero, Temporada[] temporadas){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.creador = creador;
        this.genero = genero;
        this.temporadas = temporadas;
    }

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
    public String getCreador() {
        return creador;
    }
    public void setCreador(String creador) {
        this.creador = creador;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Temporada[] getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(Temporada[] temporadas) {
        this.temporadas = temporadas;
    }

    
}
