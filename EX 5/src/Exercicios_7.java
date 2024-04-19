import java.util.Scanner;

public class Exercicios_7 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);


        int[][] matriz = new int[5][5];


        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = ler.nextInt();
            }
        }

        System.out.println("Matriz M[5][5]:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int somaLinha4 = 0;
        for (int j = 0; j < 5; j++) {
            somaLinha4 += matriz[3][j];
        }
        System.out.println("Soma da linha 4 de M: " + somaLinha4 + "\n");

        int somaColuna2 = 0;
        for (int i = 0; i < 5; i++) {
            somaColuna2 += matriz[i][1];
        }
        System.out.println("Soma da coluna 2 de M: " + somaColuna2 + "\n");

        int somaDiagonalPrincipal = 0;
        for (int i = 0; i < 5; i++) {
            somaDiagonalPrincipal += matriz[i][i];
        }
        System.out.println("Soma da diagonal principal de M: " + somaDiagonalPrincipal + "\n");

        int somaTotal = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                somaTotal += matriz[i][j];
            }
        }
        System.out.println("Soma de todos os elementos de M: " + somaTotal);
    }
}
