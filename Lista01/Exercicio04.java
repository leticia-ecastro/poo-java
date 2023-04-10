//Escreva um programa que solicite 3 (três) valores double e calcule a Equação do Segundo Grau. O primeiro valor será o ‘a’, o segundo o ‘b’ e o último o ‘c’. Crie um método que receba três valores, 'a', 'b' e 'c', que são os coeficientes da equação do segundo grau e retorne o valor do delta, que é dado por 'b² - 4ac'.


import java.util.Scanner;

public class Exercicio04 {
	
	public static void main (String[] args) {
		double a, b, c;
		Scanner entrada = new Scanner (System.in);
		
		do {
			System.out.print("Digite o valor do coeficiente \'a\': ");
			a = entrada.nextDouble();
			if (a == 0) {
				System.out.println("ERRO! O valor do coeficiente \'a\' deve ser maior que zero!");
			}
		} while (a == 0);
		
		System.out.print("Digite o valor do coeficiente \'b\': ");
		b = entrada.nextDouble();
		System.out.print("Digite o valor do coeficiente \'c\': ");
		c = entrada.nextDouble();
		
		entrada.close(); 
		
		System.out.println("Delta: " + delta(a,b,c));
	}
	
	static double delta (double a, double b, double c) {
		double delta = Math.pow(b, 2) - (4 * a * c);
		return delta;
	}
}

