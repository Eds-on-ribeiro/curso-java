package com.loiane.cursojava13;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com a temperatura em Celcius: ");
		double celcius = scan.nextDouble();
			
		double f = (5 * (celcius * 1.8) / 32);
		
		System.out.println("A temperatura " + celcius + " Celcius é igual a " + f + " F " );
		}

	}
