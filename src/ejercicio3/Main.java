package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    	
    	List<Estudiante> listaEstudiantes = new ArrayList<>();

        // 2. Cargar con datos de prueba (10 estudiantes)
        System.out.println("--- Lista Original (Desordenada) ---");
        
        listaEstudiantes.add(new Estudiante("Ana García", "Garcia", "sobresaliente"));
        listaEstudiantes.add(new Estudiante("Ana García", "Garcia", "sobresaliente"));
        listaEstudiantes.add(new Estudiante("Ana García", "Garcia", "sobresaliente"));
        listaEstudiantes.add(new Estudiante("Ana García", "Garcia", "sobresaliente"));
        listaEstudiantes.add(new Estudiante("Ana García", "Garcia", "sobresaliente"));
        listaEstudiantes.add(new Estudiante("Ana García", "Garcia", "sobresaliente"));
        listaEstudiantes.add(new Estudiante("Ana García", "Garcia", "sobresaliente"));
        listaEstudiantes.add(new Estudiante("Ana García", "Garcia", "sobresaliente"));
        listaEstudiantes.add(new Estudiante("Ana García", "Garcia", "sobresaliente"));
        listaEstudiantes.add(new Estudiante("Ana García", "Garcia", "sobresaliente"));
        imprimirLista(listaEstudiantes);
        
        // 3. Ordenar la lista por apellidos y mostrarla por pantalla	
        listaEstudiantes.sort((e1, e2) -> e1.getApellidos().compareTo(e2.getApellidos()));
        
        
       
        System.out.println("--- Prueba de la clase Trabajador ---");
       
        Trabajador t1 = new Trabajador("Carlos", "Gomez", 0.0, 160.0); 

       
        double precioPorHora = 15.50;
        
        double sueldoCalculado = t1.calcularSueldo(precioPorHora); 
        
        
        t1.setSalario(sueldoCalculado);
        
      
        System.out.println(t1.toString()); 
        System.out.println("Resultado del cálculo: " + sueldoCalculado + "€");
        
      
        System.out.println("\n--- Prueba de la clase Estudiante ---");
        
      
        Estudiante e1 = new Estudiante("Ana", "Pérez", "Sobresaliente");
        
        
        System.out.println(e1); 
        
    
        String evaluacionActual = e1.getEvaluacion();
        System.out.println("Ana tiene una evaluación de: " + evaluacionActual);
        
   
        e1.setEvaluacion("Notable");
        System.out.println("Evaluación actualizada: " + e1.getEvaluacion());
    }
    
    private static void imprimirLista(List<Estudiante> estudiantes) {
        for (Estudiante e : estudiantes) {
            System.out.println(e);
        }
}
}