//Escreva um programa em Java para ler uma matriz A de 4 linhas por 5 colunas e imprimir seus elementos.

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int[][] a = new int[4][5];
        System.out.println("Informe os elementos para construir a matriz A:");
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print("Elemento [" + i + "]" + "[" + j + "]" + ": "); 
                a[i][i] = entrada.nextInt();
            }
            System.out.println();
        }
        
        System.out.println("Exibindo a matriz A:");
        
        for (int x = 0; x < a.length; x++) {
            for (int y = 0; y < a[x].length; y++) {
                System.out.print(a[x][y] + "\t");
            }
            System.out.println();
        }
    }
}
