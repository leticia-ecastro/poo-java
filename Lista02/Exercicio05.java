//Crie um programa que solicite ao usuário três números inteiros. Através de um método, que receba esses 3 números como parâmetros de entrada, verifique e retorne o maior dos três valores. Restrição: USAR a técnica de sobrecarga para o método, um com 2 e outro com 3 parâmetros.
 

import java.util.Scanner;

public class Exercicio05 {
	
	public static void main (String[] args) {
		int numero1, numero2, numero3;
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Informe o primeiro número: ");
		numero1 = entrada.nextInt();
		System.out.print("Informe o segundo número: ");
		numero2 = entrada.nextInt();
		System.out.print("Informe o terceiro número: ");
		numero3 = entrada.nextInt();
		
		entrada.close();
		
		System.out.println("Entre os dois primeiros números, o maior valor digitado foi: " + maior(numero1, numero2));
		System.out.print("Maior número digitado: " + maior(numero1, numero2, numero3));
		
	}
	
	static int maior (int n1, int n2) {
		return (n1 > n2 ? n1 : n2);
	}
	
	static int maior (int n1, int n2, int n3) {
		if (n1 > n2 && n1 > n3) {
			return n1;
		} else if (n2 > n1 && n2 > n3) {
			return n2;
		} else {
			return n3;
		}
	}
}
