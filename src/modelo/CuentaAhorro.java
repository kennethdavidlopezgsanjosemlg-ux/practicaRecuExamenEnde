package modelo;
/**
 * Clase que extiende de {@link CuentaBancaria.java}. Esta clase
 * esta clase representa una cuenta de ahorros.
 * El interes se calcula a partir del sueldo y la tasa de interes.
 */
public class CuentaAhorro extends CuentaBancaria {
	/** Variable que indica la tasa de interes */
	private double tasaInteres;
	
	/**
	 * Constructor de la cuenta de ahorro por defecto
	 * @param titular - nombre del titular de la cuenta
	 * @param saldoInicial - saldo inicial de la cuenta
	 * @param tasaInteres - tasa de interes sujeta a la cuenta
	 */
	public CuentaAhorro(String titular, double saldoInicial, double tasaInteres) {
		super(titular, saldoInicial);
		this.tasaInteres = tasaInteres;
	}
	
	/**
	 * Método que calcula el interes de la cuenta 
	 * @return interes calculado en función del saldo y el interes de la cuenta
	 */
	@Override
	public double calcularInteres() {
		return this.saldo * this.tasaInteres;

	}

}
