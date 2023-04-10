//Baseado no exercício anterior, crie uma nova versão, que calcula as raízes de uma equação do segundo grau: ax² + bx + c = 0. Para ela existir, o coeficiente 'a' deve ser diferente de zero. Caso o delta seja maior ou igual a zero, as raízes serão reais. Caso o delta seja negativo, as reais serão complexas e da forma, assim retorne zero.
 

import java.util.Scanner;

public class Exercicio05_v2 {
	
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
        
        double[] r = raizes(a, b, c);
        if (r.length == 0) {
            System.out.println("Não existem raízes reais!");
        } else {
            for (int i = 0; i < r.length; i++) {
                System.out.println("Raiz x" + (i + 1) + ": "+ r[i]);
            }
        }
    }

    static double delta (double a, double b, double c) {
        double delta = Math.pow(b, 2) - (4 * a * c);
        return delta;
    }

    static double[] raizes (double a, double b, double c) {
        double[] raizes = new double[0];
        double delta = delta(a, b, c);

        if (delta == 0) {
            raizes = new double[1];
            raizes[0] = (-b / (2 * a));
        }

        if (delta > 0) {
            raizes = new double[2];
            raizes[0] = (-b + (Math.sqrt(delta))) / (2 * a);
            raizes[1] = (-b - (Math.sqrt(delta))) / (2 * a);
        }
        return raizes;
    }
}
