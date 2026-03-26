package modelo;

import static org.junit.Assert.assertEquals;

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
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CuentaAhorroTest {
	private static ArrayList<CuentaAhorro> listaCuentasAhorro;
	private CuentaAhorro cuentaAhorro;
	private double sueldo;
	private double tasaInteres;
	private double interesEsperado;

	@AfterClass
	public static void afterClass() {
		listaCuentasAhorro = new ArrayList<>();

	}

	@BeforeClass
	public static void beforeClass() {
		listaCuentasAhorro = null;

	}

	@Before
	public void before() {
		cuentaAhorro = new CuentaAhorro("test", sueldo, tasaInteres);

	}

	@After
	public void after() {
		cuentaAhorro = null;
	}

	public CuentaAhorroTest(double sueldo, double tasaInteres, double interesEsperado) {
		this.sueldo = sueldo;
		this.tasaInteres = tasaInteres;
		this.interesEsperado = interesEsperado;
	}

	@Parameterized.Parameters
	public static Collection<Object[]> datos() {
		return Arrays.asList(new Object[][] { { 1000, 0.05, 50 }, { 500, 0.02, 10 }, { 2000, 0.03, 60 },
				{ 1500, 0.04, 60 }, { 0, 0.05, 0 }, { 1000, 0, 0 }, { 1234, 0.05, 61.7 }, { 999, 0.1, 99.9 },
				{ 200, 0.25, 50 }, { 750, 0.08, 60 } });
	}
	
	
	@Test
	public void interes() {
		assertEquals("El interes esperado debe ser igual al real",interesEsperado,cuentaAhorro.calcularInteres(),0.1);
		
	}
	

	
	
}
