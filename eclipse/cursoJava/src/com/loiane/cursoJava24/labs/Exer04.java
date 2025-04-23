package com.loiane.cursoJava24.labs;

import java.util.Date;

public class Exer04 {
	
	public static void main(String[] args) {
	
	LivroBiblioteca livro= new LivroBiblioteca();
	
	livro.nome = "Mastering ExtJS";
	livro.autor = "Loiane groner";
	livro.anoLancamento = 2015;
	
	livro.emprestimo = true; 
	livro.dataEntrega = new Date();
	livro.emprestimo = "Loiane" != null;
	
	System.out.println("Nome do livro= " + livro.nome );

	}
}
	
