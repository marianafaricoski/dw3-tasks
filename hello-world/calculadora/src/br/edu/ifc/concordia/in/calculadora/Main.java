package br.edu.ifc.concordia.in.calculadora;

import java.util.Scanner;

public class Main {
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a operação desejada: seja soma, subtração, multiplicação ou divisão");
		int operacao = scan.nextInt();
		System.out.println ("digite o número A:");
		double a = scan.nextDouble();
		System.out.println ("DIgite o numero B:");
		double b = scan.nextDouble();
		
		Calculadora calc = new Calculadora ();
		double resultado = 0;
		if (operacao ==1){
			resultado = calc.soma(a, b);
		} else if (operacao ==2){
			resultado = calc.multiplicacao(a, b);
		}else if (operacao ==3){
			resultado = calc.subtracao(a, b);
		}else if (operacao ==4){
		resultado = calc.divisao(a, b);
		}
		
		System.out.printf("Resultado = %f\n", String.valueOf(resultado));
		scan.close();
	}
}
