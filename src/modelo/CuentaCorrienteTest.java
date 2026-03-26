package modelo;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class CuentaCorrienteTest {

	private static ArrayList<CuentaCorriente> listaCuentasCorrientes;
	private CuentaCorriente cuentaCorriente;
	private double saldoInicial;
	private double comision;
	private double interesEsperado;

	@BeforeClass
	public static void beforeClass() {
		listaCuentasCorrientes = new ArrayList<>();
	}

	@AfterClass
	public static void afterClass() {
		listaCuentasCorrientes = null;
	}

	@Before
	public void before() {
		cuentaCorriente = new CuentaCorriente("Test", saldoInicial, comision);

	}

	@After
	public void after() {
		cuentaCorriente = null;
	}

	public CuentaCorrienteTest(double saldoInicial, double comision,double interesEsperado) {
		super();
		this.saldoInicial = saldoInicial;
		this.comision = comision;
		this.interesEsperado=interesEsperado;
	}
	
    @Parameterized.Parameters
    public static Collection<Object[]> datos() {
        return Arrays.asList(new Object[][] {
            {1000, 10, -10},
            {500, 5, -5},
            {2000, 20, -20},
            {1500, 0, 0},
            {0, 15, -15},
            {1000, 100, -100},
            {1234, 50, -50},
            {999, 25, -25},
            {200, 0, 0},
            {750, 10, -10}
        });
    }
    
    @Test
    public void interes() {
    	assertEquals("El interes esperado y el actual deberian ser iguales",interesEsperado,cuentaCorriente.calcularInteres(),0.1);
    }
    
    @Test
     @Ignore
     public void testFiscal() {
    	
    }

}
