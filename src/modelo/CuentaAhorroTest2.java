package modelo;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class CuentaAhorroTest2 {
	private CuentaAhorro cuentaAhorro;

	@Test
	public void testIngresar() {
		cuentaAhorro = new CuentaAhorro("Test", 123, 0.05);
		Exception exception = assertThrows( IllegalArgumentException.class, () -> cuentaAhorro.ingresar(-1234) );
		
		assertEquals("No se pueden ingresar cantidades negativas",exception.getMessage());
	}
	
	@Test
	public void testReintegrar() {
		cuentaAhorro = new CuentaAhorro("Test", 123, 0.05);
		Exception exception = assertThrows( IllegalArgumentException.class, () -> cuentaAhorro.reintegrar(-1234) );
		
		assertEquals("La cantidad a ingresar no puede ser menor a 0",exception.getMessage());
	}
	
	@Test
	public void testReintegrar2() {
		cuentaAhorro = new CuentaAhorro("Test", 123, 0.05);
		Exception exception = assertThrows( IllegalArgumentException.class, () -> cuentaAhorro.reintegrar(1234) );
		
		assertEquals("No hay suficiente saldo para realizar la operación",exception.getMessage());
	}

}
