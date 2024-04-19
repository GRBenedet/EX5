import java.util.Random;

public class Exercicios_1 {

    public static void main(String[] args) {
        Random aletorio = new Random();
        int i, j, soma = 0;
        int[][] matriz = new int[7][9];


        for (i = 0; i < matriz.length; i++ ){
            for(j = 0; j < matriz[i].length; j++){
                matriz[i] [j] = aletorio.nextInt(100);
            }
        }

        for (i = 0; i < matriz.length; i++ ){
            for(j = 0; j < matriz[i].length; j++){
                System.out.print(matriz [i] [j] + " ");
            }
            System.out.println();
        }

        for (i = 0; i < matriz.length; i++ ){
            for(j = 0; j < matriz[i].length; j++){
                soma += matriz[i][j];
            }
        }
        System.out.println("a soma da matriz é: " + soma);


    }
}