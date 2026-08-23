package Tp2.agendaPersonal;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Participante p1 = new Participante("Sebastian", "2284410227", "Sebalmestro@gmail.com");
        Participante p2 = new Participante("Rodolfo", "2285587589", "Rdofolg@gmail.com");
        Participante p3 = new Participante("Santino", "2284575212", "santino@gmail.com");
        Participante p4 = new Participante("Francisco", "2284569632", "fran@gmail.com");
        Participante p5 = new Participante("Juan", "2284562878", "juan@gmail.com");
        Participante p6 = new Participante("Luis", "2284596212", "luis@gmail.com");
        Participante p7 = new Participante("Ariel", "2284659784", "ariel@gmail.com");
        Participante p8 = new Participante("Lautaro", "2284563124", "lauta@gmail.com");
        Participante p9 = new Participante("lisa", "228545454", "lisa@gmail.com");

        Reunion reunion1 = new Reunion("Municipalidad", "Impuestos", Duration.ofHours(2), LocalTime.of(15, 30), LocalDate.of(2026,8,25));
        Reunion reunion2 = new Reunion("Ayuntamiento", "Taxes", Duration.ofHours(3), LocalTime.of(20, 30), LocalDate.of(2026,8,25));
        Reunion reunion3 = new Reunion("Camuzzi", "Gas", Duration.ofHours(2), LocalTime.of(21, 30), LocalDate.of(2026,8,25));

        reunion1.agregarParticipante(p1);  reunion2.agregarParticipante(p5); reunion3.agregarParticipante(p7);
        reunion1.agregarParticipante(p2); reunion2.agregarParticipante(p4); reunion3.agregarParticipante(p8);
        reunion1.agregarParticipante(p3); reunion2.agregarParticipante(p6); reunion3.agregarParticipante(p9);
        

        Agenda agenda = new Agenda();
        agenda.agregarReunion(reunion1); agenda.agregarReunion(reunion3); agenda.agregarReunion(reunion2);
        System.out.println(agenda);
        System.out.println(agenda.hayConflictos());
        System.out.println(agenda.hayConflicto(reunion1, reunion3));
        
    }
}
