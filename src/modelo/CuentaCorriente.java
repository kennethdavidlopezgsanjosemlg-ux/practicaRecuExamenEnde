package modelo;

/**
 * Clase que extiende de {@link CuentaBancaria}.
 * Esta clase representa una cuenta corriente.
 * El interes es igual a la comisión sujeta a la cuenta.
 */
public class CuentaCorriente extends CuentaBancaria {
	/** Variable que representa la comisión de la cuenta*/
	private double comision;
	
	/**
	 * Construtor por defecto de CuentaCorriente
	 * 
	 * @param titular- nombre del titular de la cuenta
	 * @param saldoInicial - saldo inicial de la cuenta
	 * @param comision - comsión sujeta a la cuenta
	 */
	public CuentaCorriente(String titular, double saldoInicial,double comision) {
		super(titular, saldoInicial);
		this.comision=comision;
	}
	/**
	 * Método que calcula el interes de la cuenta en funcion a la comsión de esta
	 * @return la comision que es el interes de la cuenta
	 */
	@Override
	public double calcularInteres() {
		return -comision;
	}

}
