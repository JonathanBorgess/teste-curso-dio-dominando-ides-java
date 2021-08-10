package br.com.dio.calculadora;

import java.util.Scanner; 

public class Calculadora {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			Double a, b;
			
			System.out.println("Digite o primeiro valor: ");
			a = scan.nextDouble ();
			System.out.println("Digite o segundo valor: ");
			b = scan.nextDouble();
			
			double soma = soma(a,b);
			double subtracao = subtracao(a,b);
			double multiplicacao = multiplicacao (a,b);
			double divisao = divisao (a,b); 
					
			System.out.println("soma " + soma);
			System.out.println("sub " + subtracao);
			System.out.println("mult " + multiplicacao);
			System.out.println("div " + divisao);
		}

	}
	
	private static double divisao(Double a, Double b) {
		return a / b;
	}

	private static double multiplicacao(Double a, Double b) {
		return a * b;
	}

	private static double subtracao(Double a, Double b) {
		return a - b;
	}

	private static double soma(Double a, Double b) {
		return a + b;
	}

	
}
