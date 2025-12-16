package ejemplo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        
        List<Estudiante> estudiantes = new ArrayList<>();

        /*
        // Carga de datos de prueba
        estudiantes.add(new Estudiante("Ana", 8.5));
        estudiantes.add(new Estudiante("Luis", 6.0));
        estudiantes.add(new Estudiante("Sofía", 9.8));
        estudiantes.add(new Estudiante("Carlos", 5.5));
        estudiantes.add(new Estudiante("Elena", 7.5));
        estudiantes.add(new Estudiante("David", 4.9));
        estudiantes.add(new Estudiante("Laura", 9.0));
        estudiantes.add(new Estudiante("Jorge", 7.1));
        estudiantes.add(new Estudiante("Marta", 3.5));
        estudiantes.add(new Estudiante("Javier", 8.0));
*/
        int cantidad=0;
        
        System.out.println("¿Cuantos estudiantes quieres ingresar?");
        cantidad=sc.nextInt();
        sc.nextLine();
        
        for(int i=0; i<cantidad;i++) {
        	System.out.println("Nombre");
        	String nombre=sc.nextLine();
        	
        	System.out.println("Notas(poner los decimales con puntos)");
        	double notaEvaluacion=sc.nextDouble();
           

        	
        	estudiantes.add(new Estudiante(nombre, notaEvaluacion));
        	 sc.nextLine();
        	
        }
        sc.close();
        
        System.out.println("Lista Sin Ordenar:");
        System.out.println(estudiantes);

        // Ordenar el ArrayList usando el compareTo() de Estudiante
        Collections.sort(estudiantes);

        System.out.println("\nLista Ordenada (por Nota Ascendente):");
        System.out.println(estudiantes);
    }
}