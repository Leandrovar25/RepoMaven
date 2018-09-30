package Calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculadora {

/*
 * Verifica si el resultado obtenido al ejecutar el metodo sumar, es valido.
 */
	@Test
	public void testSuma() {
		int result = Calculadora.sumar(7,7);
		int esp = 14;
		assertEquals (esp,result);
	}

	/*
	 * Verifica si el resultado obtenido al ejecutar el metodo restar, es valido.
	 */
	@Test
	public void testResta() {
		int result= Calculadora.restar(7,7);
		int esp= 0;
		assertEquals(esp,result);
	}

	/*
	 * Verifica si el resultado obtenido al ejecutar el metodo multiplicar, es valido.
	 */
	@Test
	public void testMultiplicar() {
		int result= Calculadora.multiplicar(7,7);
		int esp= 49;
		assertEquals(esp,result);
	}

	/*
	 * Verifica si el resultado obtenido al ejecutar el metodo dividir, es valido.
	 */
	@Test
	public void testDividir() {
		int result= Calculadora.dividir(14,2);
		int esp= 7;
		assertEquals(esp,result);
	}


	@Test (expected=ArithmeticException.class)
	public void testDivideCero2() {
		int result= Calculadora.dividir(14,0);
		int esp= 0;
		assertEquals(esp,result);	
	
}
}