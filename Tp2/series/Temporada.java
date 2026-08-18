package Tp2.series;

public class Temporada {
    private Episodio[] episodios;
    public Temporada(Episodio[] ee){
        this.episodios = ee;
    }
    public Episodio[] getEpisodios() {
        return episodios;
    }
    public void setEpisodios(Episodio[] episodios) {
        this.episodios = episodios;
    }
    
}
