package persona;

import java.time.LocalDate;

public class Persona {
    // valores por defecto
    private static final double ALTURA_DEFEC = 1.0;
    private static final double PESO_DEFEC = 1.0;
    private static final String NOMBRE_DEFEC = "N";
    private static final String APELLIDO_DEFEC = "N";
    private static final String SEXO_DEFEC = "Femenino";
    private static final double MIN_INDICE = 18.5;
    private static final double MAX_INDICE = 25;
    private static final int MAYOR_DE_EDAD = 18;
    private static final int APTO_VOTO = 16;
    // atributos de la clase
    private String nombre, apellido, sexo;
    private int dni, edad;
    private LocalDate nacimiento;
    private double altura, peso;

    // constructor que pone dni obligatorio y toma resto por defecto
    public Persona(int dni) {
        this(dni, NOMBRE_DEFEC, APELLIDO_DEFEC, 8, SEXO_DEFEC,
                LocalDate.of(2001, 1, 2), PESO_DEFEC, ALTURA_DEFEC);
    }

    // constructor completo
    public Persona(int dni, String nombre, String apellido, int edad, String sexo, LocalDate nacimiento, double peso,
            double altura) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.nacimiento = nacimiento;
        this.peso = peso;
        this.altura = altura;
    }
    // getters y setters

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null) {
            this.nombre = nombre;
        } else
            this.nombre = NOMBRE_DEFEC;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        if (apellido != null) {
            this.apellido = apellido;
        } else {
            this.apellido = APELLIDO_DEFEC;
        }
    }
    public int getEdad() {
    return edad;
}

public void setEdad(int edad) {
    this.edad = edad;
}

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        if (sexo != null) {
            this.sexo = sexo;
        } else {
            this.sexo = SEXO_DEFEC;
        }
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
        } else {
            this.peso = PESO_DEFEC;
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            this.altura = ALTURA_DEFEC;
        }
    }
    // responsabilidades de la clase

    public double calculoIndiceMasaCorporal() {
        return peso / (altura * altura);
    }

    public boolean estaEnForma() {
        double indice = calculoIndiceMasaCorporal();
        return indice >= MIN_INDICE && indice <= MAX_INDICE;
    }
    public boolean estaCumpliendoAnios(){
        return this.nacimiento.getDayOfMonth() == LocalDate.now().getDayOfMonth() &&
        this.nacimiento.getMonth() == LocalDate.now().getMonth();
            
    }
    public boolean esMayorDeEdad(){
        return calcularEdad() >= MAYOR_DE_EDAD;
    }
    public boolean puedeVotar(){
        return calcularEdad() >= APTO_VOTO;
    }
    public int calcularEdad() {
    LocalDate hoy = LocalDate.now();
    int edad = hoy.getYear() - nacimiento.getYear();

    if (hoy.getMonthValue() < nacimiento.getMonthValue() ||
        (hoy.getMonthValue() == nacimiento.getMonthValue() &&
        hoy.getDayOfMonth() < nacimiento.getDayOfMonth())) {
        edad--;
    }

    return edad;
}
public boolean esCoherente(){
    return this.edad == calcularEdad();
}


    // toString
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni=" + dni +
                ", sexo='" + sexo + '\'' +
                ", nacimiento=" + nacimiento +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

}
