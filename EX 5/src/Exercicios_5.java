import java.util.Scanner;

public class Exercicios_5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int [] [] matrizA = new int[5][5];
        int [] [] matrizB = new int[5][5];
        int [] [] matrizS = new int[5][5];

        System.out.println("Defina matriz A " );
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                matrizA[i][j] = ler.nextInt(); 
            }
        }
        System.out.println("Defina matriz B " );
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                matrizB[i][j] = ler.nextInt(); 
            }
        }

        for (int i = 0; i < matrizS.length; i++) {
            for (int j = 0; j < matrizS[i].length; j++) {
                matrizS[i][j] = matrizA[i][j] + matrizB[i][j]; 
            }
        }
        System.out.println("matrizA: " );
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("matrizB: " );
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                System.out.print(+matrizB[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("matrizS: " );
        for (int i = 0; i < matrizS.length; i++) {
            for (int j = 0; j < matrizS[i].length; j++) {
                System.out.print(matrizS[i][j] + " ");
            }
            System.out.println();
        }

    }
}
