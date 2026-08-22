package Tp2.series;

import java.util.ArrayList;

public class Temporada {
    private ArrayList<Episodio> episodios;
    public Temporada(){
        episodios = new ArrayList<>();
    }
    public int getEpisodiosVistosTemporada(){
        int vistos = 0;
        for(int i = 0; i<episodios.size(); i++){
            if(episodios.get(i).getSeVio()){
                vistos++;
            }
        }
        return vistos;
    }
    public double getPromedioCalificacionTemporada(){
        int calificacion = 0;
        int vistos = 0;
        for(int i=0; i<episodios.size(); i++){
            if(episodios.get(i).getSeVio()){
            calificacion += episodios.get(i).getCalificacion();
            vistos++;
            }
        }
        return (double) calificacion / vistos;
    }
    public int getCalificacionesTemporada(){
        int calificacion = 0;

    for (int i = 0; i < episodios.size(); i++) {
        if (episodios.get(i).getSeVio()) {
            calificacion += episodios.get(i).getCalificacion();
        }
    }

    return calificacion;
    }
    public ArrayList<Episodio> getEpisodios() {
        return episodios;
    }
    public void setEpisodios(ArrayList<Episodio> episodios) {
        this.episodios = episodios;
    }
    public void agregarEpisodio(Episodio episodio) {
    episodios.add(episodio);
}

    
}
