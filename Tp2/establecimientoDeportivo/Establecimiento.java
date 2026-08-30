package Tp2.establecimientoDeportivo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Establecimiento {
    private static final int MINIMO_TURNOS = 4;
    private String nombre;
    private ArrayList<Usuario> socios;
    private ArrayList<Turno> turnos;

    public Establecimiento(String nombre) {
        this.nombre = nombre;
        this.socios = new ArrayList<>();
        this.turnos = new ArrayList<>();
    }

    public boolean cumpleCondicionSocio(Usuario uu) {
        int turnosJugados = 0;
        LocalDate fechaDosMesesAtras = LocalDate.now().minusMonths(2);
        for (int i = 0; i < turnos.size(); i++) {
            if (turnos.get(i).getFecha().isAfter(fechaDosMesesAtras)) {
                if (turnos.get(i).getUsuario().equals(uu)) {
                    turnosJugados++;
                }
            }
        }
        if (turnosJugados >= MINIMO_TURNOS) {
            return true;
        } else {
            return false;
        }

    }

    public ArrayList<Usuario> listaDeSocios() {
        for (int i = 0; i < turnos.size(); i++) {

            Usuario usuario = turnos.get(i).getUsuario();

            if (cumpleCondicionSocio(usuario) && !socios.contains(usuario)) {
                socios.add(usuario);
            }
        }

        return socios;

    }

    public ArrayList<Usuario> getSocios() {
        return socios;
    }

    public ArrayList<Turno> getTurnos() {
        return turnos;
    }

    public void agregarTurno(Turno turno) {
        turnos.add(turno);
    }

    public void agregarSocio(Usuario socio) {
        socios.add(socio);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
