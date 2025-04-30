package com.loiane.cursoJava27.labs;

public class Lampada {
	
	String modelo;
	String tensao;
	int portencia;
	String cor;
	String tipoLuz;
	int garantiaMeses;
	String[] tipos;
	boolean tipoAbajour;
	
	boolean ligada;
	
	void ligar() {
		ligada = true;
		
	}
	
	void desligar() {
		ligada = false;
	}
	
	void mostrarEstado(){
		
		if(ligada) {
			System.out.println("A Lâmpada esta ligada");
		}else {
			System.out.println("A Lâmpada esta desligada");
		}
	}
	
	void mudarEstado() {
		if(ligada) {
			desligar();
		}else {
			ligar();
		}
	}
}
