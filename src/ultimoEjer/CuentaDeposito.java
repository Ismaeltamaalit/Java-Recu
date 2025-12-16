package ultimoEjer;

public class CuentaDeposito extends Cuenta {

	public CuentaDeposito(String nombre, String tipoCliente, double saldo, double interes) {
		// 1. Llama al constructor de la clase base (Cuenta)
		super(nombre, tipoCliente, saldo, interes);
	}

	@Override
	public double calcularInteres(int numeroMeses) {
		
		if (getSaldo() < 1000) {
			return 0.0;
		} else {
			
			return numeroMeses * getInteres();
		}
	}

	@Override
	public void retirar(double cantidad) {
		
		if (getSaldo() >= cantidad) {
			
			setSaldo(getSaldo() - cantidad); 
		} else {
			
			System.out.println("Error: Saldo insuficiente para retirar.");
		}
	}

}