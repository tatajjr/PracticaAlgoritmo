package util;

public abstract class Algoritmos {
/**
 * 
 * @param numero Introducimos un numero
 * @return	Nos devolverá el numero fibonacci de este numero
 */
	 public static int fibonacci(int numero) {
	        if (numero <= 1) {
	            return numero;
	        } else {
	            return fibonacci(numero - 1) + fibonacci(numero - 2);
	        }
	    }
/**
 * 
 * @param numero	Introducimos un numero	
 * @return	No devolverá el factorial de dicho numero
 */
	    public static int factorial(int numero) {
	        if (numero == 0) {
	            return 1;
	        } else {
	            return numero * factorial(numero - 1);
	        }
	    }
/**
 * 
 * @param numero	Introducimos un numero	
 * @return	No devolverá true/false en funcion si el numero es primo o no
 */
	    public static boolean esPrimo(int numero) {
	        if (numero <= 1) {
	            return false;
	        }
	        if (numero <= 3) {
	            return true;
	        }
	        if (numero % 2 == 0 || numero % 3 == 0) {
	            return false;
	        }
	        int i = 5;
	        while (i * i <= numero) {
	            if (numero % i == 0 || numero % (i + 2) == 0) {
	                return false;
	            }
	            i += 6;
	        }
	        return true;
	    }
}
