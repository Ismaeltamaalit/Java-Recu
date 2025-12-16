package ejercicio2;

public class Alumno extends Persona {

	
	private String curso;
	private double notaMedia;
	private int notaFinal;
	
	public Alumno(String nombre, String apellido, String curso, double notaMedia, int notaFinal) {
		super(nombre, apellido);
		this.curso=curso;
		this.notaMedia=notaMedia;
		this.notaFinal=notaFinal;
	}
	
	
	
	
	
	public String getCurso() {
		return curso;
	}





	public void setCurso(String curso) {
		this.curso = curso;
	}





	public double getNotaMedia() {
		return notaMedia;
	}





	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}





	public int getNotaFinal() {
		return notaFinal;
	}





	public void setNotaFinal(int notaFinal) {
		this.notaFinal = notaFinal;
	}





	public int getNotaMediaRedondeada() {
		return (int) Math.round(this.notaMedia);
	}
	
	
	
}
