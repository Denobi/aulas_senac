package JAVA;

// import java.util.Scanner;

public class matriz5x5 {
    public static void main(String[] args) {
        // Scanner vScanner = new Scanner(System.in);

        int L = 5;
        int C = 5;

   
        String linhao = "";

        int matriz [][] = new int[L][C];
        int soma = 0;

        for(int i = 0; i < matriz.length;i++){
            for(int j = 0; j<matriz[0].length; j++){
              matriz[i][j] = (int) (Math.random()*4)+5;
              linhao+=" "+matriz[i][j];
            }
            System.out.println(linhao);
            linhao="";
        }
        for(int i = 0; i < matriz.length;i++){
            for(int j = 0; j<matriz[0].length; j++){
              if (i == j) {
                soma += matriz[i][j];
              }
            }
            
        }

        System.out.println("A soma dos valores diagonais >>> "+soma);
        // int somaDiagonal = 0;
        // for (int i = 0; i < matriz.length; i++) {
        //     somaDiagonal += matriz[i][i];
        // }

        // // Imprimir a matriz
        // System.out.println("Matriz gerada:");
        // for (int i = 0; i < matriz.length; i++) {
        //     for (int j = 0; j < matriz.length; j++) {
        //         System.out.print(matriz[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        // System.out.println(somaDiagonal);
    }
}
