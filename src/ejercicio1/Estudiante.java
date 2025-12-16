package ejercicio1;

public class Estudiante extends Persona {

	
	
	
	
	public Estudiante(String nombre, String apellidos, String evaluacion) {
		super(nombre, apellidos);
		this.evaluacion = evaluacion;
	}



	private String evaluacion;
	
	public String getEvaluacion() {
		return evaluacion;
	}
	public void setEvaluacion(String evaluacion) {
		this.evaluacion = evaluacion;
	}
	@Override
	public String toString() {
	    return super.toString() + " | Evaluación: " + this.evaluacion;
	}
	
	public String compareToString() {
	    return super.toString() + " | Evaluación: " + this.evaluacion;
	}
	

}
