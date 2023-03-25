//Escreva um programa em Java para ler 2 matrizes N x M (definido pelo usuário) e calcular a soma entre elas gerando uma terceira matriz.

import java.util.Random;
import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        int linhas, colunas, soma;
        Scanner entrada = new Scanner (System.in);
        System.out.print("Digite a quantidade de linhas das matrizes A e B: ");
        linhas = entrada.nextInt();
        System.out.print("Digite a quantidade de colunas das matrizes A e B: ");
        colunas = entrada.nextInt();
        
        entrada.close();
        
        int a[][] = new int[linhas][colunas];
        int b[][] = new int[linhas][colunas];
        Random gerador = new Random();
        
        System.out.println();
        System.out.println("Gerando a Matriz A:");
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = gerador.nextInt(11);
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        
        System.out.println();
        
        System.out.println("Gerando a Matriz B:");
        
        for (int k = 0; k < b.length; k++) {
            for (int l = 0; l < b[k].length; l++) {
                b[k][l] = gerador.nextInt(11);
                System.out.print(b[k][l] + "\t");
            }
            System.out.println();
        }
        
        System.out.println();
        
        System.out.println("C = A + B:");
        
        for (int x = 0; x < b.length; x++) {
            for (int y = 0; y < b[x].length; y++) {
                soma = a[x][y] + b[x][y];
                System.out.print(soma + "\t");
            }
            System.out.println();
        }
    }
    
}
