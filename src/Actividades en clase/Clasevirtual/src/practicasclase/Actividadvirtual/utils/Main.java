package practicasclase.Actividadvirtual.utils;

public class Main {
    public static void main(String[] args) {

        Profesor profesor = new Profesor("P001", "Juan Pérez", "Ingeniería de Sistemas");

        Curso curso = new Curso("C001", "Programación Orientada a Objetos", 4);
        curso.setProfesor(profesor);
        profesor.getCursosAsignados().add(curso);

        Estudiante e1 = new Estudiante("E001", "Laura Martínez", "Ingeniería de Sistemas");
        Estudiante e2 = new Estudiante("E002", "Carlos Torres", "Ingeniería Electrónica");

        curso.matricularEstudiante(e1);
        curso.matricularEstudiante(e2);

        UnidadTematica u1 = new UnidadTematica("Introducción a POO");
        UnidadTematica u2 = new UnidadTematica("Clases y Objetos");
        UnidadTematica u3 = new UnidadTematica("Herencia y Polimorfismo");

        curso.getUnidadesTematicas().add(u1);
        curso.getUnidadesTematicas().add(u2);
        curso.getUnidadesTematicas().add(u3);

        Proyecto proyecto = new Proyecto(
                "PR001",
                "Sistema de Gestión Universitaria",
                "Sistema para administrar cursos, estudiantes y profesores"
        );

        proyecto.setProfesorDirector(profesor);
        profesor.getProyectosDirigidos().add(proyecto);

        curso.getProyectosAsociados().add(proyecto);
        proyecto.getCursosRelacionados().add(curso);

        proyecto.agregarParticipante(e1);
        proyecto.agregarParticipante(e2);

        System.out.println("=== INFORMACIÓN DEL CURSO ===");
        System.out.println("Curso: " + curso.getNombre() + " (" + curso.getCodigo() + ")");
        System.out.println("Créditos: " + curso.getCreditos());
        System.out.println("Profesor: " + curso.getProfesor().getNombre());

        System.out.println("\n--- Estudiantes Matriculados ---");
        for (Estudiante est : curso.getEstudiantesMatriculados()) {
            System.out.println("* " + est.getNombre() + " - " + est.getPrograma());
        }

        System.out.println("\n--- Unidades Temáticas del Curso ---");
        for (UnidadTematica ut : curso.getUnidadesTematicas()) {
            System.out.println("* " + ut.getNombre());
        }

        System.out.println("\n--- Proyecto Asociado ---");
        System.out.println("Proyecto: " + proyecto.getTitulo());
        System.out.println("Director: " + proyecto.getProfesorDirector().getNombre());

        System.out.println("\nParticipantes del Proyecto:");
        for (Estudiante est : proyecto.getParticipantes()) {
            System.out.println("* " + est.getNombre());
        }
    }
}
