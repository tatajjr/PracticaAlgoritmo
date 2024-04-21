package app;

import java.util.Random;

import util.Algoritmos;

public class Principal {

	public static void main(String[] args) {
		//1. Creo el array con 5 numeros aleatorios del 1 al 10
		 int[] numeros = new int[5];
	        Random rand = new Random();
	        for (int i = 0; i < 5; i++) {
	            numeros[i] = rand.nextInt(10) + 1;
	        }
	    //2.Calculo mediante un bucle los fibonacci de los 5 numeros del array
	        int [] resultadoFibonacci=new int[5];
	        for(int i=0;i<numeros.length;i++) {	        	
	        	resultadoFibonacci[i]=Algoritmos.fibonacci(numeros[i]);	        	
	        }
	        
	   //3. Calculo mediante un bucle el factorial de los 5 numeros del aray y los guardo en resultadoFactorial
	        int [] resultadoFactorial=new int[5];
	        for(int i=0;i<numeros.length;i++) {        	
	        	resultadoFactorial[i]=Algoritmos.factorial(numeros[i]);	        	
	        }
	        
	   //Compruebo mediante un bucle si los 5 numeros del array son primos o no y los guardo en resultadoPrimos
	        boolean [] resultadoPrimos=new boolean[5];
	        for(int i=0;i<numeros.length;i++) {        	
	        	resultadoPrimos[i]=Algoritmos.esPrimo(numeros[i]);	        	
	        }
	        
	}

}
