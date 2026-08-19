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
    //responsabilidades
    public int getEpisodiosVistosSerie(){
        int vistosSerie = 0;
        
        for(int i = 0; i < temporadas.length; i++){
            vistosSerie += temporadas[i].getEpisodiosVistosTemporada();

        }
        return vistosSerie;
    }
    public double getPromedioCalificacionSerie(){
        int promedio = 0;

        for(int i = 0; i< temporadas.length; i++){
            promedio += temporadas[i].getPromedioCalificacionTemporada();
            
        }
        return promedio / temporadas.length;
    }//rehacer

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


    
}
