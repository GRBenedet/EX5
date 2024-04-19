import java.util.Scanner;

public class Exercicios_9 {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        double somaDiagonalSec = 0;
        double mediaDiagonalSecundaria;

        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = ler.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            somaDiagonalSec += matriz[i][2 - i];
        }
            mediaDiagonalSecundaria = somaDiagonalSec / 3;

        for (int i = 0; i < 3; i++) {
            matriz[i][i] *= mediaDiagonalSecundaria;
        }


        System.out.println("Matriz resultante");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

