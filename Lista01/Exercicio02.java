//Crie programa que solicite ao usuário um número tipo double. Após verifique se o número é zero ou não. A verificação deve ser feita através de um método que receba um valor (parâmetro de entrada) e informe se ele é zero ou não através de um retorno do tipo boolean. Declare como: boolean isZero ( double num ).
 

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double numero;
        
        System.out.print("Digite um número: ");
        numero = entrada.nextDouble();
        
        System.out.println("O número " + numero + (isZero (numero) ? " é zero." : " não é zero." ));
    }
    
    static boolean isZero (double numero) {
        return numero == 0;
    }
}
