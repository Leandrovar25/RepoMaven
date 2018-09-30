package Calculadora;

public class Calculadora {

	//Calcula la suma de 2 numeros enteros.
	public static int sumar (int i, int j){
		return i+j;
	}

	//Calcula la diferencia de 2 numeros enteros.
	public static int restar(int i, int j) {
			return i-j;
		}

	//Calcula el producto de 2 numeros enteros.
	public static int multiplicar(int i, int j) {
			
			return i*j;
		}

	//Calcula la division de 2 numeros enteros.
	public static int dividir(int i, int j) {
			return i/j;
		}

	//Calcula la potencia de 2 numeros enteros.
	public static double potencia(int i, int j){
			return Math.pow(i, j);
	}
	
	// Verifica la division por cero de un valor determinado.
	public int dividir0(int dividendo, int divisor) {
		try {
			return dividendo / divisor;
		} catch(Exception e) {
			return 0;
		}
	}
	
}
