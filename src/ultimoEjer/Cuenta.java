package ultimoEjer;

public abstract class Cuenta {
	private String nombre;
	private String tipoCliente;
	private double saldo;
	private double interes;
	
	public Cuenta(String nombre, String tipoCliente, double saldo, double interes) {
		super();
		this.nombre = nombre;
		this.tipoCliente = tipoCliente;
		this.saldo = saldo;
		this.interes = interes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}
	
	public void depositar(double cantidad) {
	    this.saldo += cantidad; // Asumiendo que has quitado el setter del saldo y usas esta lógica
	}
	
	public abstract double calcularInteres(int numeroMeses); 

	public abstract void retirar(double cantidad);
	
	
}
