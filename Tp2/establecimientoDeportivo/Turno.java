package Tp2.establecimientoDeportivo;

import java.time.LocalDate;

public class Turno {
    private Cancha cancha;
    private Usuario usuario;
    private LocalDate fecha;
    public Turno(Cancha cancha, Usuario usuario, LocalDate fecha) {
        this.cancha = cancha;
        this.usuario = usuario;
        this.fecha = fecha;
    }
    
}
