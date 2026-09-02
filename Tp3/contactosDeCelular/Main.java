package Tp3.contactosDeCelular;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        
    Contacto seba = new Contacto("Sebastian", "Almestro", "Sebalmestro@gmail", "Uriburu 740", LocalDate.of(2004, 2, 20), 228441022, "Tandil");
    Contacto lara = new Contacto("Lara ", "Meijboom", "LaraMMeij@gmail", "Arana 230", LocalDate.of(2003, 9, 15) , 228461244, "Tandil");
    Contacto lara2 = new Contacto("hola ", "Meijboom", "LaraMMeij@gmail", "Arana 230", LocalDate.of(2003, 9, 15) , 228461244, "Tandil");

    Agenda agendaTelefonica = new Agenda();
    System.out.println("Totalidad");
    agendaTelefonica.agregarContacto(seba);
    agendaTelefonica.agregarContacto(lara2);
    agendaTelefonica.agregarContacto(lara);
    agendaTelefonica.totalidadContactos();
    System.out.println("Repetidos");
    System.out.println(agendaTelefonica.contactosRepetidos());
    System.out.println("Promedio de edad");
    System.out.println(agendaTelefonica.promedioDeEdad());
    System.out.println("Telefonos Repetidos");
    System.out.println(agendaTelefonica.telefonosRepetidos());

    }
}
