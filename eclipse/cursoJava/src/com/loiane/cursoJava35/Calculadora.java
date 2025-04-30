package com.loiane.cursoJava35;

public class Calculadora {
		
	public static int soma(int num1, int num2) {
		return num1 + num2;
	}
	
	public static double soma(double num1, double num2) {
		return num1 + num2;
	}
	
	public static int soma(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	
	public static int soma(int[] vetorInteiros) {
		
		int total = 0;
		
		for (int i = 0; i < vetorInteiros.length; i++){
			total += vetorInteiros[i];
		}
		
		return total;
	}
	
	public static int fatorialNaoRecursivo(int num) {
		if (num == 0){
		return 1;	
		}
		
		int total = 1;
		for (int i = num; i > 1; i--) {
			total *= i;
		}
		
		return total;
	}
	
	public static int fatorial(int num) {
		
		if ( num == 0) {
			return 1;
		}
		return num * fatorial(num-1);
	}

}