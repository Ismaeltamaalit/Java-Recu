package ejercicio1;

public class Trabajador extends Persona {

	public Trabajador(String nombre, String apellidos) {
		super(nombre, apellidos);
		// TODO Auto-generated constructor stub
	}
	
	public Trabajador(String nombre, String apellidos, double salario, double horasTrabajadas) {
		super(nombre, apellidos);
		this.salario = salario;
		this.horasTrabajadas = horasTrabajadas;
	}

	private double salario;
	private double horasTrabajadas;
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getHorasTrabajadas() {
		return horasTrabajadas;
	}
	public void setHorasTrabajadas(double horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}
	
	@Override
	public String toString() {
	    return super.toString() + " | Salario: " + this.salario + " | Horas Trabajadas: " + this.horasTrabajadas;
	}
	
	public double calcularSueldo(double precioPorHora) {
	    return this.salario * this.horasTrabajadas;
	}

}
