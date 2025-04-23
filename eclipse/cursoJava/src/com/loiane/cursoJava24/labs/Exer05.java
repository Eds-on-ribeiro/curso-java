package com.loiane.cursoJava24.labs;

public class Exer05 {

	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		conta.numero = "12345";
		conta.agencia = "12343";
		conta.especia = "true";
		conta.limiteEspecial = 500;
		conta.saldo = -0;
		
		System.out.println("Saldo da conta" + conta.numero + " = " + conta.saldo);

	}

}
