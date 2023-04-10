//Crie um programa que pergunte ao usuário se ele deseja lançar/jogar um dado. Por meio de um método chamado dado(), retorne, através de sorteio aleatório, um número de 1 até 6. O programa deve ser executado enquanto o usuário quiser continuar jogando o dado.


import java.util.Scanner;
import java.util.Random;

public class Exercicio07 {
	
	public static void main (String[] args) {
		char resposta = ' ';
		int numero = 0, contador = 0;
		Scanner entradaStr = new Scanner (System.in);
		
		do {
			System.out.print("Jogar o dado? [s/n] : ");
			resposta = entradaStr.nextLine().toLowerCase().charAt(0);
			System.out.println("Valor: " + dado());
		} while (resposta == 's');
	}
	
	static int dado () {
		Random dado = new Random();
		return (dado.nextInt(6) + 1);
	}
}
