//Utilizando o método dado(), criado no exercício anterior, lance o dado 1 milhão de vezes. Conte quantas vezes cada número saiu. A probabilidade deu certo? Ou seja, a porcentagem dos números foi parecida?


import java.util.Random;

public class Exercicio08 {
	
    public static void main(String[] args) {
        int[] quantidadeVezes = new int[6];
        
        for (int i = 0; i < 1000000; i++) {
            quantidadeVezes[dado() - 1]++;
        }
        
        for (int i = 0; i < 6; i++) {
            System.out.println((i + 1) + ": " + quantidadeVezes[i] + " ocorrências (" + (quantidadeVezes[i] / 10000 + "%)"));
        }
    }

    static int dado() {
        Random dado = new Random();
        return (dado.nextInt(6) + 1);
    }
}
