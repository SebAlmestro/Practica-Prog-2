package Tp3.sistemaDeEncuestas;

public class Main {

    public static void main(String[] args) {

        // PERSONAS ENCUESTADAS
        Persona p1 = new Persona("Sebastian", "Almestro", 11111111);
        Persona p2 = new Persona("Juan", "Perez", 22222222);
        

        // EMPLEADOS
        Empleado e1 = new Empleado("Carlos", "Lopez", 44444444, 1, 50000);
        Empleado e2 = new Empleado("Maria", "Diaz", 55555555, 2, 50000);

        // PREGUNTAS
        Pregunta preg1 = new Pregunta("¿Está satisfecho con el servicio?");
        Pregunta preg2 = new Pregunta("¿Recomendaría el servicio?");
        Pregunta preg3 = new Pregunta("¿Cómo calificaría la atención?");

        // EMPRESA
        Empresa empresa = new Empresa();

        empresa.agregarEmpleado(e1);
        empresa.agregarEmpleado(e2);

        // ENCUESTAS
        // La encuesta 1 tiene ID 1
        Encuesta encuesta1 = new Encuesta(p1, e1, 1);
        encuesta1.agregarPregunta(preg1);
        encuesta1.agregarPregunta(preg2);
        encuesta1.agregarPregunta(preg3);

        // Misma encuesta (ID 1), pero respondida por otra persona
        Encuesta encuesta1Persona2 = new Encuesta(p2, e1, 1);
        encuesta1Persona2.agregarPregunta(preg1);
        encuesta1Persona2.agregarPregunta(preg2);
        encuesta1Persona2.agregarPregunta(preg3);

        // Encuesta diferente (ID 2), respondida por p1
        Encuesta encuesta2 = new Encuesta(p1, e2, 2);
        encuesta2.agregarPregunta(preg1);
        encuesta2.agregarPregunta(preg2);

        // AGREGAMOS LAS ENCUESTAS
        empresa.agregarEncuesta(encuesta1);
        empresa.agregarEncuesta(encuesta1Persona2);
        empresa.agregarEncuesta(encuesta2);

        // INTENTAMOS QUE p1 RESPONDA NUEVAMENTE LA ENCUESTA 1
        Encuesta encuesta1Repetida = new Encuesta(p1, e2, 1);
        encuesta1Repetida.agregarPregunta(preg1);
        encuesta1Repetida.agregarPregunta(preg2);
        encuesta1Repetida.agregarPregunta(preg3);

        empresa.agregarEncuesta(encuesta1Repetida);

        // RESULTADOS
        System.out.println("ENCUESTAS REALIZADAS POR CARLOS:");
        System.out.println(empresa.encuestasRealizadasEmpleado(e1));

        System.out.println();

        System.out.println("ENCUESTAS REALIZADAS POR MARIA:");
        System.out.println(empresa.encuestasRealizadasEmpleado(e2));

        System.out.println();

        System.out.println("SUELDO DE CARLOS CON PLUS:");
        System.out.println(empresa.plusPorEncuestasRealizadas(e1));

        System.out.println();

        System.out.println("TOTAL DE ENCUESTAS GUARDADAS:");
        System.out.println(empresa.getEncuestas().size());

    }
}
