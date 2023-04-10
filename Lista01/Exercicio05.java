//Baseado no exercício anterior, crie uma nova versão, que calcula as raízes de uma equação do segundo grau: ax² + bx + c = 0. Para ela existir, o coeficiente 'a' deve ser diferente de zero. Caso o delta seja maior ou igual a zero, as raízes serão reais. Caso o delta seja negativo, as reais serão complexas e da forma, assim retorne zero.
 

import java.util.Scanner;

public class Exercicio05 {
	
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
        System.out.println();

        System.out.println("Delta: " + delta(a,b,c));
        System.out.println("Raizes da equacao: \n" + calcularRaizes(a, b, c));
    }

    static double delta (double a, double b, double c) {
        double delta = Math.pow(b, 2) - (4 * a * c);
        return delta;
    }

    static String calcularRaizes (double a, double b, double c) {
        double delta = delta (a, b, c);
        if (delta < 0) {
            return String.format("Nao existem raizes reais.");
        }

        if (delta == 0) {
            return "x\' = x\'' = " + (-b / (2 * a));
        }

        if (delta > 0) {
            double x1 = (-b + (Math.sqrt(delta))) / (2 * a);
            double x2 = (-b - (Math.sqrt(delta))) / (2 * a);
            return String.format("x\' = %.2f \t x\'' = %.2f", x1, x2);
        }
        return "";
    }
}
