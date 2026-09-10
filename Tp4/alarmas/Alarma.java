package Tp4.alarmas;

public class Alarma {
    protected boolean seRompio;
    protected boolean seAbrio;
    protected boolean movimiento;
    protected Timbre timbre;
    public Alarma(boolean seRompio, boolean seAbrio, boolean movimiento) {
        this.seRompio = seRompio;
        this.seAbrio = seAbrio;
        this.movimiento = movimiento;
        this.timbre = new Timbre();
    }

    public boolean comprobar(){
        if(seAbrio || seRompio || movimiento){
            timbre.hacerSonar();
            return true;
        }else{
            System.out.println("calladito");
            return false;
        }
    }


    public boolean isSeRompio() {
        return seRompio;
    }
    public void setSeRompio(boolean seRompio) {
        this.seRompio = seRompio;
    }
    public boolean isSeAbrio() {
        return seAbrio;
    }
    public void setSeAbrio(boolean seAbrio) {
        this.seAbrio = seAbrio;
    }
    public boolean isMovimiento() {
        return movimiento;
    }
    public void setMovimiento(boolean movimiento) {
        this.movimiento = movimiento;
    }
    

    
}
