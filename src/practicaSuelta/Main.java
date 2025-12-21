package practicaSuelta;

public class Main {

    public static void main(String[] args) {

        // ARRAY DE OBJETOS
        Estudiante[] estudiantes = new Estudiante[2];
        Trabajador[] trabajadores = new Trabajador[2];

        // Crear objetos
        estudiantes[0] = new Estudiante("Ana", "López", "1234567", 0);
        estudiantes[0].calcularNota(7, 8, 9);

        estudiantes[1] = new Estudiante("Luis", "Martín", "7654321", 8.5);

        trabajadores[0] = new Trabajador("Carlos", "Ruiz", 12.5, 40);
        trabajadores[1] = new Trabajador("María", "Gómez", 15, 35);

        // Mostrar datos
        System.out.println("=== ESTUDIANTES ===");
        for (Estudiante e : estudiantes) {
            System.out.println(e);
        }

        System.out.println("\n=== TRABAJADORES ===");
        for (Trabajador t : trabajadores) {
            System.out.println(t);
        }
    }
}
