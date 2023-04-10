//Com base nos dois exercícios anteriores, crie programa que solicite ao usuário um número tipo double. Após verifique se o número é positivo, negativo ou zero. As verificações devem ser feitas através de métodos. 


import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double numero;
        
        System.out.print("Digite um número: ");
        numero = entrada.nextDouble();
        
        if (isZero (numero)) {
            System.out.println("O número " + numero + " é zero.");
        } else {
            System.out.println("O número " + numero + (isPositivo (numero) ? " é positivo." : " é negativo."));
        }
    }
    
    static boolean isZero (double numero) {
        return numero == 0;
    }
    
    static boolean isPositivo (double numero) {
        return numero > 0;
    }
}
