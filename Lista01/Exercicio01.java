/* 
 * Crie programa que solicite ao usuário um número tipo double. Após verifique se o número é positivo ou não. A verificação deve ser feita através de um método que receba um valor (parâmetro de entrada) e informe se ele é positivo ou negativo através de um retorno do tipo boolean. Assuma o número zero como positivo. Declare como: boolean isPositivo ( double num ). Exemplo:
 * Entrada: Entre com um número: -1,48
 * Saída: O número -1.48 é negativo.
 */
 
 
import java.util.Scanner;

public class Exercicio01 {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner (System.in);
		double numero;

		System.out.print("Digite um número: ");
		numero = entrada.nextDouble();
		if (isPositivo (numero)) {
			System.out.printf("O numero %.1f é positivo.", numero);
		} else {
			System.out.printf("O numero %.1f é negativo.", numero);
		}
	}
	
	static boolean isPositivo (double valor) {
		return valor >= 0;
	}
}

