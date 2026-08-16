package persona;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        
        Persona p1 = new Persona(45459752, "Sebastian", "Almestro", 22, "Masculino",
        LocalDate.of(2004, 2, 20), 90, 1.82);
        
        System.out.println(p1);
        System.out.println("Indice de Masa  " + p1.calculoIndiceMasaCorporal());
        System.out.println("Esta en forma  " + p1.estaEnForma());
        System.out.println("Es el cumple  " + p1.estaCumpliendoAnios());
        System.out.println("Es mayor de edad  " + p1.esMayorDeEdad());
        System.out.println("Puede votar  " + p1.puedeVotar());
        System.out.println("Es coherente  " + p1.esCoherente());

        
        

        
        
    }
}
