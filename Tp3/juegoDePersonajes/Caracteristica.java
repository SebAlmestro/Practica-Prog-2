package Tp3.juegoDePersonajes;

public class Caracteristica {
    private int nivel;
    private String tipo;
    public Caracteristica(int nivel, String tipo) {
        this.nivel = nivel;
        this.tipo = tipo;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    


}
