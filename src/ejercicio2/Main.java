package ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Alumno a1=new Alumno("Laura", "Stram", "DAW", 0.0, 0);
		
		System.out.println("--- Cálculo de la Nota Media para " + a1.getNombre() + " ---");
		
		System.out.println("Ingrese la nota del 1º Trimestre(ingrese el numero con punto en vez de coma)");
		double nota1=sc.nextDouble();
		
		System.out.println("Ingrese la nota del 2º Trimestre(ingrese el numero con punto en vez de coma)");
		double nota2=sc.nextDouble();
		
		System.out.println("Ingrese la nota del 3º Trimestre(ingrese el numero con punto en vez de coma)");
		double nota3=sc.nextDouble();
		
		
		double mediaCalculada=(nota1+nota2+nota3)/3.0;
		
		a1.setNotaMedia(mediaCalculada);
		
		int notaAproximada=a1.getNotaMediaRedondeada();
		
		System.out.println("\n--- Resultados de POO ---");
        System.out.printf("La media SIN aproximar es: %.2f%n", a1.getNotaMedia());
        System.out.println("La nota final APROXIMADA es: " + notaAproximada);
        
        sc.close();
		
	}

}
