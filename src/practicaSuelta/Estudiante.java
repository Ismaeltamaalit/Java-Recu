package practicaSuelta;

public class Estudiante extends Persona implements Comparable<Estudiante> {

	
	private String nre;
	private double notas;
	
	public Estudiante(String nombre, String apellidos, String nre, double notas) {
		super(nombre, apellidos);
		this.nre = nre;
		this.notas = notas;
	}

	public String getNre() {
		return nre;
	}

	public void setNre(String nre) {
		this.nre = nre;
	}

	public double getNotas() {
		return notas;
	}

	public void setNotas(double notas) {
		this.notas = notas;
	}
	
	@Override
    public String toString() {
        return "Estudiante: " + getNombre() + " " + getApellidos() + 
               " [NRE: " + nre + ", Nota Media: " + notas + "]";
    }
	
	public double notaMedia(double nota1, double nota2, double nota3) {
		double resultado=(nota1 + nota2 + nota3)/3;
		this.notas=resultado;
		
		return resultado ;
		
	}
	
	

	@Override
	public int compareTo(Estudiante o) {
		// TODO Auto-generated method stub
		return this.getNombre().compareTo(o.getNombre());
	}
	

}
