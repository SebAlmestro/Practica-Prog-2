package Tp2.series;

public class Temporada {
    private Episodio[] episodios;
    public Temporada(Episodio[] ee){
        this.episodios = ee;
    }
    public int getEpisodiosVistosTemporada(){
        int vistos = 0;
        for(int i = 0; i<episodios.length; i++){
            if(episodios[i].getSeVio()){
                vistos++;
            }
        }
        return vistos;
    }
    public double getPromedioCalificacionTemporada(){
        int calificacion = 0;
        int vistos = 0;
        for(int i=0; i<episodios.length; i++){
            if(episodios[i].getSeVio()){
            calificacion += episodios[i].getCalificacion();
            vistos++;
            }

        }
        return (double) calificacion / vistos;

    }
    public Episodio[] getEpisodios() {
        return episodios;
    }
}
