package ultimoEjer;

public class CuentaHipoteca extends Cuenta {

	public CuentaHipoteca(String nombre, String tipoCliente, double saldo, double interes) {
		super(nombre, tipoCliente, saldo, interes);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularInteres(int numeroMeses) {
		double interesTotal = 0.0;
		double tasaNormal = getInteres();
		double tasaReducida = tasaNormal / 2.0;

		if (getTipoCliente().equals("particular")) {
			int mesesLimite = 6;
			
			if (numeroMeses <= mesesLimite) {
				// Caso 1: Todos los meses a tasa reducida
				interesTotal = numeroMeses * tasaReducida;
			} else {
				// Caso 2: 6 meses a tasa reducida + el resto a tasa normal
				double interesPrimerTramo = mesesLimite * tasaReducida;
				double mesesNormales = numeroMeses - mesesLimite;
				double interesSegundoTramo = mesesNormales * tasaNormal;
				
				interesTotal = interesPrimerTramo + interesSegundoTramo;
			}
		} else if (getTipoCliente().equals("empresa")) {
			int mesesLimite = 12;

			if (numeroMeses <= mesesLimite) {
				// Caso 1: Todos los meses a tasa reducida
				interesTotal = numeroMeses * tasaReducida;
			} else {
				// Caso 2: 12 meses a tasa reducida + el resto a tasa normal
				double interesPrimerTramo = mesesLimite * tasaReducida;
				double mesesNormales = numeroMeses - mesesLimite;
				double interesSegundoTramo = mesesNormales * tasaNormal;

				interesTotal = interesPrimerTramo + interesSegundoTramo;
			}
		}
		
		// Retorna 0 si el tipo de cliente no es reconocido o el cálculo final
		return interesTotal;
	}

	@Override
	public void retirar(double cantidad) {
		System.out.println("ERROR: Las cuentas de crédito solo permiten depositar.");		
		
	}

}
