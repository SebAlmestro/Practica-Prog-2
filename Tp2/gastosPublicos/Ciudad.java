package Tp2.gastosPublicos;

public class Ciudad {
    private static final int GRANDE = 100000;
    //atributos
    private String nombre;
    private int imp1, imp2, imp3, imp4, imp5, mantenimiento;
    private int habitantes;
    
    //constructores
    public Ciudad(String nombre){
        this.nombre = nombre;
    }
    public Ciudad(String nombre, int imp1, int imp2, int imp3, int imp4, int imp5, int mantenimiento, int habitantes) {
        this.nombre = nombre;
        this.imp1 = imp1;
        this.imp2 = imp2;
        this.imp3 = imp3;
        this.imp4 = imp4;
        this.imp5 = imp5;
        this.mantenimiento = mantenimiento;
        this.habitantes = habitantes;
    }
    //responsabilidad
    public boolean esDeficitaria(){
        if(mantenimiento > getRecaudacion()){
            return true;
        }else{
            return false;
        }
    }
    public boolean esCiudadGrande(){
        if(habitantes > GRANDE){
            return true;
        }else{
            return false;
        }
    }
    public int getRecaudacion(){
        return imp1 + imp2 + imp3 + imp4 + imp5;
    }

    //getters y setters

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getImp1() {
        return imp1;
    }
    public void setImp1(int imp1) {
        this.imp1 = imp1;
    }
    public int getImp2() {
        return imp2;
    }
    public void setImp2(int imp2) {
        this.imp2 = imp2;
    }
    public int getImp3() {
        return imp3;
    }
    public void setImp3(int imp3) {
        this.imp3 = imp3;
    }
    public int getImp4() {
        return imp4;
    }
    public void setImp4(int imp4) {
        this.imp4 = imp4;
    }
    public int getImp5() {
        return imp5;
    }
    public void setImp5(int imp5) {
        this.imp5 = imp5;
    }
    public int getMantenimiento() {
        return mantenimiento;
    }
    public void setMantenimiento(int mantenimiento) {
        this.mantenimiento = mantenimiento;
    }
    public int getHabitantes() {
        return habitantes;
    }
    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }
    @Override
public String toString() {
    return "Ciudad{" +
            "nombre='" + nombre + '\'' +
            ", imp1=" + imp1 +
            ", imp2=" + imp2 +
            ", imp3=" + imp3 +
            ", imp4=" + imp4 +
            ", imp5=" + imp5 +
            ", mantenimiento=" + mantenimiento +
            ", habitantes=" + habitantes +
            '}';
}
}
