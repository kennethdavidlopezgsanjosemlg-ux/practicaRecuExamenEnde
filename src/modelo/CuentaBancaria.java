package modelo;

public abstract class CuentaBancaria {

    protected String titular;
    protected double saldo;

    public CuentaBancaria(String titular, double saldoInicial) {
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("El saldo inicial no puede ser negativo");
        }
        this.titular = titular;
        this.saldo = saldoInicial;
    }
    
    public abstract double calcularInteres();

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void ingresar(double cantidad) {
    	if (cantidad < 0) {
    		throw new IllegalArgumentException("La cantidad a ingresar no puede ser menor a 0");
    	}
    	
    	
        saldo += cantidad;
    }

    public void reintegrar(double cantidad) {
    	if (cantidad < 0) {
    		throw new IllegalArgumentException("La cantidad a ingresar no puede ser menor a 0");
    	}
    	
    	  if (cantidad > saldo) {
              throw new IllegalArgumentException("No hay suficiente saldo para realizar la operación");
          }

        saldo -= cantidad;
    }

}
