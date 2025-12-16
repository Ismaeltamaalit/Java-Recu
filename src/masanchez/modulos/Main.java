package masanchez.modulos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Modulo> listaModulos = new ArrayList<Modulo>();
		
		//Recorremos los módulos
        try {
            File myObjMod = new File("./assets/files/modulos.txt");
            Scanner myReaderMod = new Scanner(myObjMod);
            while (myReaderMod.hasNextLine()) {
                String data = myReaderMod.nextLine();
                String[] lineaModulo = data.split("&");

                //obtenemos todos los alumnos del modulo
                ArrayList<Alumno> alumnosModulo= buscarAlumnosEnModulo(Integer.parseInt(lineaModulo[0]));

                //Añadimos el objeto modulo con sus alumnos
                listaModulos.add(new Modulo(Integer.parseInt(lineaModulo[0]),lineaModulo[1]
                        ,Integer.parseInt(lineaModulo[2])
                        ,Integer.parseInt(lineaModulo[3]), lineaModulo[4],alumnosModulo));
            }
            myReaderMod.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        //Imprimimos los módulos y sus alumnos
        imprimirListaModulos(listaModulos);   
		
		
	}

	
	public static ArrayList<Alumno> buscarAlumnosEnModulo(int modulo){
		
		ArrayList<Alumno> alumnosEnModulo=new ArrayList<>();
		
		try {
            File myObj = new File("./assets/files/modulo_alumno.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] linea = data.split(",");
                    if (Integer.parseInt(linea[0])==modulo) {
                        Alumno alumnoActual=recuperarAlumno(Integer.parseInt(linea[1]));
                        alumnosEnModulo.add(alumnoActual);
                    }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
		
		
		return alumnosEnModulo;
		
	}
	
	public static Alumno recuperarAlumno(int idAlumno) {
		
		Alumno alumnoActual=null;
		boolean salir = false;
		
		try {
            File myObjAlum = new File("./assets/files/alumnos.txt");
            Scanner myReader = new Scanner(myObjAlum);
            while (myReader.hasNextLine() && !salir) {
                String data = myReader.nextLine();
                String[] lineaAlumno = data.split("&");

                if(Integer.parseInt(lineaAlumno[0])==idAlumno){
                    alumnoActual= new Alumno(Integer.parseInt(lineaAlumno[0]),lineaAlumno[1],lineaAlumno[2],
                        lineaAlumno[3], lineaAlumno[4], lineaAlumno[5],
                        Integer.parseInt(lineaAlumno[6]));
                    salir=true;
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
		
		
		return alumnoActual;
	
		
	}
	
    
	public static void imprimirListaModulos(ArrayList<Modulo> listaModulos) {
        
		for(int i=0; i<listaModulos.size(); i++) {
           
			System.out.println(listaModulos.get(i).toString());
			
            System.out.println("\tAlumnos en módulo: ");
            
            for(int j=0;j<listaModulos.get(i).getAlumnos().size();j++){
                
            	Alumno alumnoActual =listaModulos.get(i).getAlumnos().get(j);
            	            	
            	System.out.println("\t"+ alumnoActual.toString());
            }
            
        }
    }
    
	
	
	
}
