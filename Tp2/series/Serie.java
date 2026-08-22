package Tp2.series;
import java.util.ArrayList;
public class Serie {
    //atributos
    private String titulo;
    private String descripcion;
    private String creador;
    private String genero;
    private ArrayList<Temporada> temporadas;

    //constructor
    public Serie(String titulo, String descripcion, String creador, String genero) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.creador = creador;
        this.genero = genero;
        temporadas = new ArrayList<>();
    }
    //responsabilidades
    public int getEpisodiosVistosSerie(){
        int vistosSerie = 0;
        
        for(int i = 0; i < temporadas.size(); i++){
            vistosSerie += temporadas.get(i).getEpisodiosVistosTemporada();

        }
        return vistosSerie;
    }
    public boolean seVieronTodos(){
        int vistosSerie = getEpisodiosVistosSerie();
        int episodios = 0;
        for(int i=0; i<temporadas.size(); i++){
            episodios+= temporadas.get(i).getEpisodios().size();

        }
        return vistosSerie == episodios;
    }

    public double getPromedioCalificacionSerie(){
        int calificaciones = 0;
        int vistosSerie = getEpisodiosVistosSerie();
        for(int i = 0; i<temporadas.size(); i++){
            calificaciones+= temporadas.get(i).getCalificacionesTemporada();
        }
        return (double) calificaciones / vistosSerie;

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

    public ArrayList<Temporada> getTemporadas() {
        return temporadas;
    }
    public void agregarTemporada(Temporada temporada) {
    temporadas.add(temporada);
}


    
}
