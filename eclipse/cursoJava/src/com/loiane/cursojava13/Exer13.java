package com.loiane.cursojava13;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com o valor/hora: ");
		double valorHora = scan.nextDouble();
		
		System.out.println("Entre com a quantidade do horas trabalhadas no mes: ");
		double horas = scan.nextDouble();
		
		double salarioBruto = valorHora * horas;
		double inss = (salarioBruto / 100) * 8;
		double sindicato = (salarioBruto / 100) * 5;
		double ir = (salarioBruto / 100) * 11;
		double totalDescontos = inss + sindicato + ir;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		
		System.out.println("O salario bruto: " + salarioBruto);
		System.out.println("INSS: " + inss);
		System.out.println("Sindicato: " + sindicato);
		System.out.println("IR: " + ir);
		System.out.println("Total descontos: " + totalDescontos);
		System.out.println("Salario líquido: " + salarioLiquido);
	}

}

