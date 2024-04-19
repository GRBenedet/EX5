import java.util.Scanner;

public class Exercicios_8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        
        int[][] matriz = new int[10][10];


        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = ler.nextInt();
            }
        }

        double somaDiagonalPrincipal = 0;
        for (int i = 0; i < 10; i++) {
            somaDiagonalPrincipal += matriz[i][i];
        }
        double mediaDiagonalPrincipal = somaDiagonalPrincipal / 10;
        System.out.println("A média dos elementos da diagonal principal é: " + mediaDiagonalPrincipal);

        // NOTA: acho que float funcionaria tbm... pesquisar mais ! ! !
    }
}
