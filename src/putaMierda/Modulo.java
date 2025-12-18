package putaMierda;

import java.util.ArrayList;

public class Modulo {
	
	private int id;
    private String nombre;
    private int curso;
    private int horas;
    private String profesor;
    private ArrayList<Alumno> alumnos;
	
    
    
    public Modulo(int id, String nombre, int curso, int horas, String profesor) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.curso = curso;
		this.horas = horas;
		this.profesor = profesor;
	}



	public Modulo(int id, String nombre, int curso, int horas, String profesor, ArrayList<Alumno> alumnos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.curso = curso;
		this.horas = horas;
		this.profesor = profesor;
		this.alumnos = alumnos;
	}
	
	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}

    
	@Override
    public String toString() {
        return "Modulo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", curso=" + curso +
                ", horas=" + horas +
                ", profesor='" + profesor + '\'' +
                '}';
        
	}
	
}



	


	