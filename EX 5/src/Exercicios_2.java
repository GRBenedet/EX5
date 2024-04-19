import java.util.Random;

public class Exercicios_2 {
    public static void main(String[] args) {
        int min = -100, max = 100, i, j, s = 0;

        Random aleatorio = new Random();

        int [][] matriz = new int[4][7];
        int[] vetorC = new int[4];

        for (i = 0; i < matriz.length; i++){
            for(j = 0; j < matriz[i].length; j++){
                matriz[i] [j] = aleatorio.nextInt((max - min) +1) + min;
            }
        }

        for (i = 0; i < matriz.length; i++ ){
            for(j = 0; j < matriz[i].length; j++){
                System.out.print(matriz [i] [j] + " ");
            }
            System.out.println();
        }

        for( i = 0; i < matriz.length; i++){
            for(j = 0; j < matriz[i].length; j++){
                if (matriz[i] [j] < 0) {
                    vetorC[i]++;
                } else{
                }
            }
        }
        for( i = 0; i < vetorC.length; i++){
            System.out.println(vetorC[i]);
        }
    }
}
