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
    public Cancha getCancha() {
        return cancha;
    }
    public void setCancha(Cancha cancha) {
        this.cancha = cancha;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    
}
