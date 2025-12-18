package putaMierda;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Practica {
	public static void main(String[] args) {
		
	

	ArrayList<Modulo> listaModulos= new ArrayList<Modulo>();
	
	try {
		File file= new File("modulos.txt");
		Scanner sc= new Scanner(file);
		while(sc.hasNextLine()) {
			String data=sc.nextLine();
			String[] lineaModulo=data.split("&");
			ArrayList<Alumno> alumnosModulo= buscarAlumnosEnModulo(Integer.parseInt(lineaModulo[0]));
			
			listaModulos.add(new Modulo(Integer.parseInt(lineaModulo[0]),lineaModulo[1]
                    ,Integer.parseInt(lineaModulo[2])
                    ,Integer.parseInt(lineaModulo[3]), lineaModulo[4],alumnosModulo));
		}
		
	}catch (FileNotFoundException e) {
		System.out.println("An error occurred.");
        e.printStackTrace();
	}
    imprimirListaModulos(listaModulos);   

}

	

	private static ArrayList<Alumno> buscarAlumnosEnModulo(int modulo) {
		
		ArrayList<Alumno>alumnosEnModulo=new ArrayList<>();
		
		try {
			File file=new File("modulo_alumno.txt");
			Scanner sc= new Scanner(file);
			while(sc.hasNextLine()) {
				String data= sc.nextLine();
				String[]linea=data.split(",");
				if(Integer.parseInt(linea[0])==modulo) {
					Alumno alumnoActual=recuperarAlumno(Integer.parseInt(linea[1]));
					alumnosEnModulo.add(alumnoActual);
				}
			}
		}catch (FileNotFoundException e){
			System.out.println("An error occurred.");
            e.printStackTrace();
		}
		
		return alumnosEnModulo;
	}
	
	
	
	private static Alumno recuperarAlumno(int idAlumno) {
		Alumno alumnoActual=null;
		boolean salir = false;
		
		try {
			File file=new File("alumnos.txt");
			Scanner sc= new Scanner(file);
			
			while(sc.hasNextLine()&& !salir) {
				String data=sc.nextLine();
				String[] lineaAlumno=data.split("&");
				if(Integer.parseInt(lineaAlumno[0])==idAlumno) {
					 alumnoActual= new Alumno(Integer.parseInt(lineaAlumno[0]),lineaAlumno[1],lineaAlumno[2],
		                        lineaAlumno[3], lineaAlumno[4], lineaAlumno[5],
		                        Integer.parseInt(lineaAlumno[6]));
		                    salir=true;
				}
					
			}
			
		}catch(FileNotFoundException e){
			System.out.println("An error occurred.");
            e.printStackTrace();
		}
		return alumnoActual;
	}



	private static void imprimirListaModulos(ArrayList<Modulo> listaModulos) {
		for(Modulo modulo: listaModulos) {
			System.out.println(modulo);
			for(Alumno alumno: modulo.getAlumnos()){
				System.out.println(alumno);
			}
		}
		
	}
	
	
	
}