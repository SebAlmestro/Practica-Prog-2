package Tp2.agendaPersonal;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Reunion {
    private String lugar, tema;
    private ArrayList<Participante> participantes;
    private Duration duracion;
    private LocalTime inicio;
    private LocalDate fecha;

    public Reunion(String lugar, String tema, Duration duracion, LocalTime inicio, LocalDate fecha) {
        this.lugar = lugar;
        this.tema = tema;
        this.duracion = duracion;
        this.inicio = inicio;
        this.participantes = new ArrayList<>();
        this.fecha = fecha;
    }

    public void agregarParticipante(Participante participante) {
        participantes.add(participante);
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
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

    @Override
    public String toString() {
        return "Reunion{" +
                "lugar='" + lugar + '\'' +
                ", tema='" + tema + '\'' +
                ", duracion=" + duracion +
                ", horaInicio=" + inicio +
                ", participantes=" + participantes +
                '}';
    }

}
