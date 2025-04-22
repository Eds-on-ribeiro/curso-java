package com.loiane.cursojava13;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com o valor/hora: ");
		double valorHora = scan.nextDouble();
		
		System.out.println("Entre com a quantidade do horas trabalhadas no mes: ");
		double horas = scan.nextDouble();
		
		double salario = valorHora * horas;
		
		System.out.println("O salario é de: " + salario);
	}

}
