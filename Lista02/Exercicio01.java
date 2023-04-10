//Crie um programa que solicite ao usuário dois números inteiros. Através de um método, que receba esses 2 números como parâmetros de entrada, verifique e retorne o maior dos dois valores. Restrição: NÃO usar o pacote Math.
 

import java.util.Scanner;

public class Exercicio01 {
	
	public static void main (String[] args) {
		int numero1, numero2;
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Informe o primeiro numero: ");
		numero1 = entrada.nextInt();
		System.out.print("Informe o segundo numero: ");
		numero2 = entrada.nextInt();
		
		entrada.close();
		
		System.out.print("Maior numero digitado: " + maior(numero1, numero2));
		
	}
	
	static int maior (int n1, int n2) {
		return ( n1 > n2 ? n1 : n2 );
	}
}
