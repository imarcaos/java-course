/* enunciado.
Fazer um programa para ler dois números inteiros M e N, e depois ler
uma matriz de M linhas por N colunas contendo números inteiros,
podendo haver repetições. Em seguida, ler um número inteiro X que
pertence à matriz. Para cada ocorrência de X, mostrar os valores à
esquerda, acima, à direita e abaixo de X, quando houver, conforme
exemplo.
 */
package application;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m, n, search;

        System.out.println("Digite as dimensões da Matriz M: linhas x N: colunas: ");
        m = sc.nextInt();
        n = sc.nextInt();

        //System.out.printf("M= %d, N= %d\n", m, n);  // teste leitura
        int[][] matriz = new int[m][n];

        // ler valores para a matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("linha %d, coluna %d\n", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }

        // escrita valores da matriz conforme enunciado
        System.out.println("Digite a número a pesquisar: ");
        search = sc.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == search) {
                    // apresenta os números a volta
                    System.out.printf("Position %d,%d:\n", i, j);
                    if (j > 0) {
                        System.out.println("Left: " + matriz[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + matriz[i - 1][j]);
                    }
                    if (j < matriz[i].length - 1) {
                        System.out.println("Right: " + matriz[i][j + 1]);
                    }
                    if (i < matriz.length - 1) {
                        System.out.println("Down: " + matriz[i + 1][j]);
                    }
                }
            }
        }

        sc.close();
    } //main
}
