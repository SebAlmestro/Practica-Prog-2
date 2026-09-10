package Tp4.alarmas;

public class AlarmaLuminosa extends Alarma{
    private Luz luz;

    public AlarmaLuminosa(boolean seRompio, boolean seAbrio, boolean movimiento) {
        super(seRompio, seAbrio, movimiento);
        this.luz = new Luz();
    }
    public boolean comprobar(){
        if(super.comprobar()){
            luz.encender();
            return true;
        }else{
            return false;
        }
        
    }
    
    
}
