package ejer_suelto;

import java.util.Scanner;

public class GestorAlumnos {

    public static void main(String[] args) {
        // Objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // --- 1. Solicitar cantidad de alumnos y crear el array ---
        System.out.println("🎓 GESTOR DE ALUMNOS 🎓");
        System.out.print("Introduce la cantidad de alumnos a registrar: ");
        int cantidadAlumnos = 0;
        try {
            cantidadAlumnos = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.err.println("Entrada inválida. Se registrará 1 alumno por defecto.");
            cantidadAlumnos = 1;
        }

        // Crear el array de objetos Alumno
        Alumno[] listaAlumnos = new Alumno[cantidadAlumnos];

        // --- 2. Solicitar datos en bucle para cada alumno ---
        System.out.println("\n--- INGRESO DE DATOS DE ALUMNOS ---");
        for (int i = 0; i < cantidadAlumnos; i++) {
            System.out.println("\nDatos para el Alumno #" + (i + 1) + ":");
            
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Apellidos: ");
            String apellidos = scanner.nextLine();

            System.out.print("NRE (Número Regional de Estudiante): ");
            String nre = scanner.nextLine();

            System.out.print("Email: ");
            String email = scanner.nextLine();

            System.out.print("Dirección: ");
            String direccion = scanner.nextLine();

            // Crear y guardar el objeto Alumno en el array
            listaAlumnos[i] = new Alumno(nombre, apellidos, nre, email, direccion);
            System.out.println("** Alumno #" + (i + 1) + " registrado exitosamente. **");
        }

        // --- 3. Mostrar en lista toda la información de cada alumno ---
        mostrarListaCompleta(listaAlumnos);

        // --- 4. Menú interactivo ---
        menuInteractivo(scanner, listaAlumnos);
        
        // Cerrar el scanner
        scanner.close();
        System.out.println("\nPrograma finalizado. ¡Hasta luego!");
    }

    // Método para mostrar toda la información de todos los alumnos
    private static void mostrarListaCompleta(Alumno[] listaAlumnos) {
        System.out.println("\n==============================================");
        System.out.println("         LISTA COMPLETA DE ALUMNOS");
        System.out.println("==============================================");
        
        if (listaAlumnos.length == 0) {
             System.out.println("No hay alumnos registrados.");
             return;
        }

        for (int i = 0; i < listaAlumnos.length; i++) {
            System.out.println("\n[ ALUMNO #" + (i + 1) + " ]");
            // Usamos el método getInformacion() de la clase Alumno
            System.out.println(listaAlumnos[i].getInformacion());
        }
        System.out.println("==============================================");
    }
    
    // Método para crear el menú y mostrar la información selectiva
    private static void menuInteractivo(Scanner scanner, Alumno[] listaAlumnos) {
        if (listaAlumnos.length == 0) {
             return;
        }
        
        int opcion = -1;
        while (opcion != 0) {
            System.out.println("\n==============================================");
            System.out.println("        MENÚ DE INFORMACIÓN INDIVIDUAL");
            System.out.println("==============================================");
            
            // Opciones del menú (un número por alumno)
            for (int i = 0; i < listaAlumnos.length; i++) {
                // Muestra solo el número y el nombre
                System.out.println((i + 1) + ". " + listaAlumnos[i].getNombre() + " " + listaAlumnos[i].getApellidos());
            }
            System.out.println("----------------------------------------------");
            System.out.println("0. Salir del menú");
            System.out.print("Seleccione un número para ver la información completa: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());

                if (opcion > 0 && opcion <= listaAlumnos.length) {
                    // La opción seleccionada corresponde al índice del array - 1
                    int indiceAlumno = opcion - 1; 
                    
                    System.out.println("\n*** INFORMACIÓN COMPLETA DE: " + listaAlumnos[indiceAlumno].getNombre() + " ***");
                    // Muestra la información completa
                    System.out.println(listaAlumnos[indiceAlumno].getInformacion());
                    System.out.println("************************************************\n");
                    
                } else if (opcion != 0) {
                    System.out.println("Opción no válida. Intente de nuevo.");
                }
            } catch (NumberFormatException e) {
                System.err.println("Entrada no numérica. Por favor, introduzca el número de opción.");
                opcion = -1; // Para asegurar que el bucle continúe
            }
        }
    }
}