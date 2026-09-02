package Tp3.contactosDeCelular;

import java.time.LocalDate;

public class Contacto {
    //atributos
    private String nombre, apellido, email, direccion, ciudad;
    private LocalDate fechaNac;
    private long telefono;
    //constructor
    public Contacto(String nombre, String apellido, String email, String direccion, LocalDate fechaNac, long telefono, String ciudad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.direccion = direccion;
        this.fechaNac = fechaNac;
        this.telefono = telefono;
        this.ciudad = ciudad;
    }
    //get y set
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public LocalDate getFechaNac() {
        return fechaNac;
    }
    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }
    public long getTelefono() {
        return telefono;
    }
    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int calcularEdad() {
    LocalDate hoy = LocalDate.now();
    int edad = hoy.getYear() - fechaNac.getYear();

    if (hoy.getMonthValue() < fechaNac.getMonthValue() ||
        (hoy.getMonthValue() == fechaNac.getMonthValue() &&
        hoy.getDayOfMonth() < fechaNac.getDayOfMonth())) {
        edad--;
    }
    return edad;
    }
    public boolean equals(Object oo) {
    try {
        if (apellido.equals(((Contacto)oo).getApellido())
                && nombre.equals(((Contacto)oo).getNombre())
                && telefono == (((Contacto)oo).getTelefono())) {
            return true;
        } else {
            return false;
        }
    } catch (Exception ee) {
        return false;
    }
}
public String toString(){
    return "Nombre: " + nombre + "|| Apellido: " + apellido + "|| Telefono: " + telefono;
}
    
}
