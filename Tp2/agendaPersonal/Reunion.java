package Tp2.agendaPersonal;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;

public class Reunion {
    private String lugar, tema;
    private ArrayList<Participante> participantes;
    private Duration duracion;
    private LocalTime inicio;
    public Reunion(String lugar, String tema, Duration duracion, LocalTime inicio) {
        this.lugar = lugar;
        this.tema = tema;
        this.duracion = duracion;
        this.inicio = inicio;
        ArrayList<Participante> participantes = new ArrayList<>();
    }
    public String getLugar() {
        return lugar;
    }
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    public String getTema() {
        return tema;
    }
    public void setTema(String tema) {
        this.tema = tema;
    }
    public ArrayList<Participante> getParticipantes() {
        return participantes;
    }
    public void setParticipantes(ArrayList<Participante> participantes) {
        this.participantes = participantes;
    }
    public Duration getDuracion() {
        return duracion;
    }
    public void setDuracion(Duration duracion) {
        this.duracion = duracion;
    }
    public LocalTime getInicio() {
        return inicio;
    }
    public void setInicio(LocalTime inicio) {
        this.inicio = inicio;
    }
    
    
    
    
}
