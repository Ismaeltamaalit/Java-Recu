package ultimoEjer;

public class CuentaCredito extends Cuenta {

	public CuentaCredito(String nombre, String tipoCliente, double saldo, double interes) {
		super(nombre, tipoCliente, saldo, interes);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularInteres(int numeroMeses) {
		if(getTipoCliente().equals("particular")) {
			if(numeroMeses<=3) {
				return 0.0;
			}else {
				return (numeroMeses-3)*getInteres();
			}
		}else if(getTipoCliente().equals("empresa")){
			if(numeroMeses<=2) {
				return 0;
			}else {
				return(numeroMeses-2)*getInteres();
			}
		}
		return 0;
	}

	@Override
	public void retirar(double cantidad) {
		System.out.println("ERROR: Las cuentas de crédito solo permiten depositar.");		
	}

}
