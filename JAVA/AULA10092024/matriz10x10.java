package JAVA;

// import java.util.Scanner;

public class matriz10x10 {
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
              linhao="";
            }
        }
        for(int i = 0; i < matriz.length;i++){
            for(int j = 0; j<matriz[0].length; j++){
              if (i < j) {
                matriz[i][j] = (2*i + 7*j - 2);
              }else{
                if (i == j) {
                  matriz[i][j] = (3*i*i - 1);
                }else{
                  matriz[i][j]= (4*i*i*i - 5*j*j +1);
                }
              }
              linhao+="\t"+matriz[i][j];
            }
            
        }

        System.out.println(linhao);
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
