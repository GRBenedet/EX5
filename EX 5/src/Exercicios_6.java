import java.util.Scanner;

public class Exercicios_6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[][] matrizM = new int[6][6];
        int[] vetorMulti = new int[36];
        int index = 0, a;

        System.out.println("Digite os elementos da matriz M:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                matrizM[i][j] = ler.nextInt();
            }
        }

        System.out.println("Digite o valor do multiplicador:");
        a = ler.nextInt();

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                vetorMulti[index] = matrizM[i][j] * a;
                index++;
            }
        }

        System.out.println("Vetor V:");
        for (int i = 0; i < 36; i++) {
            System.out.print(vetorMulti[i] + " ");
        }
    }
}