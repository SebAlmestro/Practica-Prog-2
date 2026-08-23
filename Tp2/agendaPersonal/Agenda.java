package Tp2.agendaPersonal;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Reunion> reuniones;

    public Agenda() {
        this.reuniones = new ArrayList<>();
    }

    public boolean hayConflicto(Reunion reunion1, Reunion reunion2) {

        if (!reunion1.getFecha().equals(reunion2.getFecha())) {
            return false;
        }
        // Convertimos las horas de inicio a minutos
        int inicio1 = reunion1.getInicio().getHour() * 60 + reunion1.getInicio().getMinute();
        int inicio2 = reunion2.getInicio().getHour() * 60 + reunion2.getInicio().getMinute(); // Calculamos cuándo
                                                                                              // termina cada reunión
        int fin1 = inicio1 + (int) reunion1.getDuracion().toMinutes();
        int fin2 = inicio2 + (int) reunion2.getDuracion().toMinutes(); // Si una empieza antes de que termine la otra,
                                                                       // hay conflicto
        return inicio1 < fin2 && inicio2 < fin1;
    }

    public boolean hayConflictos() {
        for (int i = 0; i < reuniones.size(); i++) {
            for (int j = i + 1; j < reuniones.size(); j++) {
                if (hayConflicto(reuniones.get(i), reuniones.get(j))) {
                    return true;
                }
            }
        }
        return false;
    }

    public void agregarReunion(Reunion reunion) {
        reuniones.add(reunion);
    }

    public ArrayList<Reunion> getReuniones() {
        return reuniones;
    }

    public void setReuniones(ArrayList<Reunion> reuniones) {
        this.reuniones = reuniones;
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "reuniones=" + reuniones +
                '}';
    }

}
