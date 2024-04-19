import java.util.Random;

public class Exercicios_4 {

    public static void main(String[] args) {
        int somaPares = 0;
        int[][] matriz = new int[10][10];
        Random rand = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rand.nextInt(100); 
            }
        }
        /*NOTA tbm dava para para fazer i+=2 assim ela ja ia pulando de dois em dois */ 
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i % 2 == 0) {
                    somaPares += matriz[i][j];
                }else{}
            }
        }

        System.out.println("Matriz 10x10:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nSoma das linhas pares: " + somaPares);
    }
}