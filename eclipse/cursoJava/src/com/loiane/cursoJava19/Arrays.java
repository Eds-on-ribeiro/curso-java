package com.loiane.cursoJava19;

public class Arrays {

	public static void main(String[] args) {

		double tempoDia01 = 31.3;
		double tempoDia02 = 32;
		double tempoDia03 = 33.7;
		double tempoDia04 = 34;
		double tempoDia05 = 33.1;
		
		double [] temperaturas = new double[365];
		
		temperaturas[0] = 31;
		temperaturas[1] = 32;
		temperaturas[2] = 33.7;
		temperaturas[3] = 34;
		temperaturas[4] = 33.1;

		System.out.println("A temperatura do dia 1 é: " + temperaturas[0]);
		
		System.out.println("O tamanho do array: " + temperaturas.length);
		
		System.out.println("Valores do array: ");
		
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.println("A temperatura do dia: " + (i + 1) + " é: " + temperaturas[i]);
		}
		
		for (double temp : temperaturas ) {
			System.out.println(temp);
		}

	}

}
