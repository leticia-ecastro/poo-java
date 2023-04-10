/*
 * Crie programa que solicite ao usuário um número tipo double. Após verifique se o número é positivo ou não. A verificação deve ser feita através de um método que receba um valor (parâmetro de entrada) e informe se ele é positivo ou negativo através de um retorno do tipo boolean. Assuma o número zero como positivo. Declare como: boolean isPositivo ( double num ). Exemplo:
 * Entrada: Entre com um número: -1,48
 * Saída: O número -1.48 é negativo.
 */
 
 
import java.util.Scanner;

public class Exercicio01_v2 {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner (System.in);
		double valor;

		System.out.print("Digite um valor: ");
		valor = entrada.nextDouble();
		
		System.out.println("O numero " + valor + " é " + (isPositivo (valor) ? "positivo." : "negativo."));
	}
	
	static boolean isPositivo (double numero) {
		return numero >= 0;
	}
}

