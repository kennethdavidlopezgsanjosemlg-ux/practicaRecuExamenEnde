package modelo;

import static org.junit.Assert.*;

import org.junit.Test;

public class CuentaCorrienteTest2 {
	
	private CuentaBancaria cuentaBancaria;

	@Test
	public void ingresar() {
		cuentaBancaria = new CuentaCorriente("Test",234,0.3);	
		
		Exception exception = assertThrows( IllegalArgumentException.class, () -> cuentaBancaria.ingresar(-123) );
		
		assertEquals("No se pueden ingresar cantidades negativas",exception.getMessage());
		
	}
	
	@Test
	public void reintegrar() {
		cuentaBancaria = new CuentaCorriente("Test",234,0.3);	
		
		Exception exception = assertThrows( IllegalArgumentException.class, () -> cuentaBancaria.reintegrar(-123) );
		
		assertEquals("No se pueden retirar cantidades negativas",exception.getMessage());
		
	}
	
	@Test
	public void reintegrar2() {
		cuentaBancaria = new CuentaCorriente("Test",234,0.3);	
		
		Exception exception = assertThrows( IllegalArgumentException.class, () -> cuentaBancaria.reintegrar(3452345) );
		
		assertEquals("No hay suficiente saldo para realizar la operación",exception.getMessage());
		
	}

}
