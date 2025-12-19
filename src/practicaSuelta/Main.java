package practicaSuelta;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
        ArrayList<Trabajador> listaTrabajadores = new ArrayList<>();

        int opciones = -1;

        while (opciones != 0) {
        	System.out.println("\n===== MENÚ PRINCIPAL =====");
            System.out.println("1. Añadir Estudiante");
            System.out.println("2. Añadir Trabajador");
            System.out.println("3. Mostrar Estudiantes");
            System.out.println("4. Mostrar Trabajadores");
            System.out.println("5. Ordenar Estudiantes");
            System.out.println("6. Ordenar Trabajadores");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opciones = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opciones) {

                // ================= CASE 1 =================
                case 1:
                    System.out.println("¿Cuántos estudiantes quieres crear?");
                    int numEstudiantes = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < numEstudiantes; i++) {

                        System.out.println("\n--- Estudiante " + (i + 1) + " ---");

                        System.out.print("Nombre: ");
                        String nombre = sc.nextLine();

                        System.out.print("Apellidos: ");
                        String apellidos = sc.nextLine();

                        System.out.print("NRE: ");
                        String nre = sc.nextLine();

                        System.out.print("Nota 1: ");
                        double nota1 = sc.nextDouble();

                        System.out.print("Nota 2: ");
                        double nota2 = sc.nextDouble();

                        System.out.print("Nota 3: ");
                        double nota3 = sc.nextDouble();
                        sc.nextLine();

                        double media = (nota1 + nota2 + nota3) / 3;

                        Estudiante e = new Estudiante(nombre, apellidos, nre, media);
                        listaEstudiantes.add(e);
                    }
                    System.out.println("Estudiantes añadidos correctamente.");
                    break;

                // ================= CASE 2 =================
                case 2:
                    System.out.println("¿Cuántos trabajadores quieres crear?");
                    int numTrabajadores = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < numTrabajadores; i++) {

                        System.out.println("\n--- Trabajador " + (i + 1) + " ---");

                        System.out.print("Nombre: ");
                        String nombre = sc.nextLine();

                        System.out.print("Apellidos: ");
                        String apellidos = sc.nextLine();

                        System.out.print("Salario por hora: ");
                        double salarioHora = sc.nextDouble();

                        System.out.print("Horas trabajadas: ");
                        double horasTrabajadas = sc.nextDouble();
                        sc.nextLine();

                        // Creamos el trabajador (salarioTotal se inicializa a 0)
                        Trabajador t = new Trabajador(
                                nombre,
                                apellidos,
                                salarioHora,
                                horasTrabajadas,
                                0.0
                        );

                        // Calculamos el salario total
                        t.calcularSalario();

                        listaTrabajadores.add(t);
                    }
                    System.out.println("Trabajadores añadidos correctamente.");
                    break;


                case 3:
                    System.out.println("== Mostrar Estudiantes ==");
                    for(Estudiante e:listaEstudiantes) {
                    	System.out.println(e);
                    }
                    break;

                case 4:
                    System.out.println("== Mostrar Trabajadores ==");
                    for(Trabajador t:listaTrabajadores) {
                    	System.out.println(t);
                    }
                    break;

                case 5:
                    System.out.println("== Ordenar Estudiantes ==");
                    Collections.sort(listaEstudiantes);
                    for(Estudiante e:listaEstudiantes) {
                    	System.out.println(e);
                    }
                    
                    break;

                case 6:
                	System.out.println("== Trabajadores ordenados por salario ==");
                    Collections.sort(listaTrabajadores); // Implementado
                    for(Trabajador trab : listaTrabajadores) System.out.println(trab);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }

        sc.close();
    }
}
