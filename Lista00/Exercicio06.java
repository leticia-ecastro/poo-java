//Escreva um programa em Java para gerar aleatoriamente (menor que 25) uma matriz N x M de dimensão definidas pelo usuário. Solicitar ao usuário um valor. Imprimir a matriz gerada. Informar se o valor digitado existe na matriz, indicando a posição (linha X coluna) e no final a quantidade de ocorrências. 

import java.util.Random;
import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        int linhas, colunas, valor, contador;
        Scanner entrada = new Scanner (System.in);
        System.out.print("Digite a quantidade de linhas da matriz: ");
        linhas = entrada.nextInt();
        System.out.print("Digite a quantidade de colunas da matriz: ");
        colunas = entrada.nextInt();
        System.out.print("Digite um valor: ");
        valor = entrada.nextInt();
        
        entrada.close();
        
        int matriz[][] = new int[linhas][colunas];
        Random gerador = new Random();
        
        System.out.println();
        System.out.println("Gerando a Matriz A:");
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = gerador.nextInt(6);
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println(); 
        }
        
        System.out.println(); 

        contador = 0;
        
        for (int x = 0; x < matriz.length; x++) {
            for (int y = 0; y < matriz[x].length; y++) {
                if (matriz[x][y] == valor) {
                    contador++;
                    System.out.println("O valor " + valor + " ocupa a posição [" + x + "x" + y + "] "
                            + "na matriz A");
                }  
            }
        }
        System.out.println(valor + " aparece " + contador + " vezes.");
    }
}
