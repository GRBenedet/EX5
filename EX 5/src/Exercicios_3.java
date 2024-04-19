import java.util.Random;

public class Exercicios_3 {

    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        Random rand = new Random();
        int[] somaColunas = new int[5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = rand.nextInt(100) + 1;
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                somaColunas[j] += matriz[i][j];
            }
        }

        System.out.println("Matriz:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nSoma de cada coluna:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Coluna " + (i + 1) + ": " + somaColunas[i]);
        }
    }
}