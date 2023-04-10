//Crie um programa que solicite ao usuário números inteiros. A cada número inserido, perguntar ao usuário se ele deseja informar outro número. Através de um método, verifique e retorne o menor dos valores.
 

import java.util.Scanner;

public class Exercicio06 {
	
	public static void main (String[] args) {
		int numero, contador = 0, menor = 0;
		char resposta = ' ';
		Scanner entrada = new Scanner (System.in);
		Scanner entradaStr = new Scanner (System.in);
		
		do {
			System.out.print("Digite um numero: ");
			numero = entrada.nextInt();
			System.out.print("Deseja inserir mais um numero? [S/N] : ");
			resposta = entradaStr.nextLine().toLowerCase().charAt(0);
			if (contador == 0) {
				menor = numero;
				contador++;
			} else {
				menor = menorNumero(menor, numero);
			}
		} while (resposta == 's');
		
		entrada.close();
		entradaStr.close();
		
		System.out.print(menor);
	}
	
	static int menorNumero (int menorAtual, int numeroRespondido) {
		return Math.min(menorAtual, numeroRespondido);
	}
}
