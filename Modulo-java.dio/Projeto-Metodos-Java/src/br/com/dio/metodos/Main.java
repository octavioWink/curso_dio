package br.com.dio.metodos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Calculadora
		System.out.println("\t\t\t\t<----Exercicio Calculadora---->");
		Calculadora.soma(10, 20);
		Calculadora.mutiplicacao(15, 20);
		Calculadora.subitracao(20, 10);
		Calculadora.divisao(50, 10);
		Calculadora.resto(60, 27);
		//calculadora
		
		//mensagem 
		System.out.println("\n\t\t\t\t<----Exercicio Mensagem---->");
		Mensagem.obterMensagem(11);
		Mensagem.obterMensagem(15);
		Mensagem.obterMensagem(23);
		//mensagem 
		
	    // Emprestimo
		System.out.println("\n\t\t\t\t<----exercicio Emprestimo---->");
		Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
		Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
		//quantidade mais de tres parcelas"oque nao e permitido"
		Emprestimo.calcular(1000, 6);
		// Emprestimo
	}

}
