package Tp4.alarmas;

public class Main {

    public static void main(String[] args) {

        System.out.println("ALARMA NORMAL");

        Alarma alarma = new Alarma(true, false, false);
        alarma.comprobar();


        System.out.println("\nALARMA LUMINOSA");

        AlarmaLuminosa alarmaLuminosa = new AlarmaLuminosa(false, true, false);
        alarmaLuminosa.comprobar();


        System.out.println("\nALARMA SIN ACTIVAR");

        Alarma alarmaNormal = new Alarma(false, false, false);
        alarmaNormal.comprobar();
    }
}
