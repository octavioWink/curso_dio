package br.com.dio.metodos;

public class Emprestimo {
	
public static int getDuasParcelas() {
	return 2;
}

public static int getTresParcelas() {
	return 3;
}

public static double taxaDuasParcelas() {
	return 0.22;
}

public static double taxaTresParcelas() {
	return 0.33;
}

public static void calcular(double valor, int parcelas) {
	
	if (parcelas == 2) {
		
		double valorFinal = valor +(valor * taxaDuasParcelas());
		
		System.out.println("O valor do emprestimo com os juros de DUAS parcelas é "+valorFinal);
		
		}
	
	else if (parcelas == 3) {
		
			double valorFinal = valor + (valor * taxaTresParcelas());
			
			System.out.println("O valor do emprestimo com os juros de TRES parcelas é "+valorFinal);
			
		}
	else {
		
			System.out.println("Nao trabalhamos com essa quantia de parcelas :(");
			
		}
}



}
