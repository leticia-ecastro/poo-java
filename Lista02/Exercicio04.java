//Crie um programa que solicite ao usuário dois números inteiros. Através de um método, que receba esses 2 números como parâmetros de entrada, verifique e retorne o menor dos dois valores. Restrição: USAR o pacote Math, em específico, o método min().
 

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main (String[] args) {
		int numero1, numero2;
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Informe o primeiro número: ");
		numero1 = entrada.nextInt();
		System.out.print("Informe o segundo número: ");
		numero2 = entrada.nextInt();
		
		entrada.close();
		
		System.out.print("Menor número digitado: " + menor(numero1, numero2));
		
	}
	
	static int menor (int n1, int n2) {
		return (Math.min(n1,n2));
	}
}
