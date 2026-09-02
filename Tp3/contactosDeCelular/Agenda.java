package Tp3.contactosDeCelular;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contacto> contactos;
    public Agenda(){
        this.contactos = new ArrayList<>();
    }
    //funcionalidad

    public void totalidadContactos(){
        for(int i=0; i<contactos.size(); i++){
            System.out.println("Nombre: " +contactos.get(i).getNombre()+
            "||  Apellido: " + contactos.get(i).getApellido() +
            "||  Telefono: " +contactos.get(i).getTelefono());
            
        }
    }
    //devuelve listado de contactos repetidos por nombre, apellido y telefono
    public ArrayList<Contacto> contactosRepetidos(){
        ArrayList<Contacto> repetidos = new ArrayList<>();
        for(int i = 0; i< contactos.size(); i++){
            for(int j = i+1; j<contactos.size(); j++){
                if(contactos.get(i).equals(contactos.get(j))){
                    repetidos.add(contactos.get(i));
                }
            }
        }
        return repetidos;
    }
    //devuelve listado de contactos con mismo numero de telefono
    public ArrayList<Contacto> telefonosRepetidos(){
        ArrayList<Contacto> telefonoRepetido = new ArrayList<>();
        for(int i = 0; i < contactos.size(); i++){
            for(int j = i+1; j< contactos.size(); j++)
            if(contactos.get(i).getTelefono() == contactos.get(j).getTelefono()){
                telefonoRepetido.add(contactos.get(i));
            }
        }
        return telefonoRepetido;
    }
    public double promedioDeEdad(){
        double suma = 0;
        double cantidad = 0;
        for(int i = 0; i<contactos.size(); i++){
            suma+= contactos.get(i).calcularEdad();
            cantidad++;
        }
        return suma / cantidad;
    }
    public void agregarContacto(Contacto contacto){
        contactos.add(contacto);
    }
}
