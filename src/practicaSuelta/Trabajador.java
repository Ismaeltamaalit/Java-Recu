package practicaSuelta;

public class Trabajador extends Persona implements Comparable<Trabajador> {

	private double salarioHora;
	private double horasTrabajadas;
	private double salarioTotal;
	
	public Trabajador(String nombre, String apellidos, double salarioHora, double horasTrabajadas, double salarioTotal) {
		super(nombre, apellidos);
		this.salarioHora = salarioHora;
		this.horasTrabajadas = horasTrabajadas;
		this.salarioTotal=0.0;
	}

	public double getSalarioHora() {
		return salarioHora;
	}

	public void setSalarioHora(double salarioHora) {
		this.salarioHora = salarioHora;
	}

	public double getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(double horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	
	
	
	public double getSalarioTotal() {
		return salarioTotal;
	}

	public void setSalarioTotal(double salarioTotal) {
		this.salarioTotal = salarioTotal;
	}

	@Override
    public String toString() {
        return "Trabajador: " + getNombre() + " " + getApellidos() + 
               " | Sueldo/Hora: " + salarioHora + 
               " | Horas: " + horasTrabajadas + 
               " | TOTAL: " + salarioTotal + "€";
    }
	
	public double calcularSalario() {
        this.salarioTotal = this.salarioHora * this.horasTrabajadas;
        return this.salarioTotal;
    }

	@Override
	public int compareTo(Trabajador o) {
		// TODO Auto-generated method stub
		return Double.compare(this.getSalarioTotal(), o.getSalarioTotal());
	}
	
	
	
}
