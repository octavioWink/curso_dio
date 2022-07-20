package br.com.dio.metodos;

public class Calculadora {
	//criando o metodo
public static void soma(double numero1, double numero2) {
	//criando um double para somar o "numero 1 + o numero2"
	double resultado = numero1 + numero2;
	//mostrando o valor"resultado"
	System.out.println("a soma de "+numero1+" + "+numero2+" = "+resultado);
}


public static void subitracao(double numero1, double numero2) {
	
	double resultado = numero1 - numero2;
	
	System.out.println("a subtracao de "+numero1+" - "+numero2+" = "+resultado);
}	


public static void divisao(double numero1, double numero2) {
	
    double resultado = numero1 / numero2;

    System.out.println("a divisao de "+numero1+" / "+numero2+" = "+resultado);
}


public static void mutiplicacao(double numero1, double numero2) {
	
    double resultado = numero1 * numero2;

    System.out.println("a mutiplicacao de "+numero1+" * "+numero2+" = "+resultado);
}


public static void resto(double numero1, double numero2) {
	
    double resultado = numero1 % numero2;

    System.out.println("o resto de "+numero1+" % "+numero2+" = "+resultado);
}



}