package com.loiane.cursojava13;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com a temperatura em Farenheit: ");
		double farenheit = scan.nextDouble();
		
		double c = (5 * (farenheit-32) / 9);
		
		System.out.println("A temperatura" + farenheit + " Farenheit é igual a " + c + " c " );
	}

}
