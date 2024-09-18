package JAVA;

import java.util.Scanner;
/**
 * vetor
 */
public class matriz {

    public static void main(String[] args) {

        Scanner vScanner = new Scanner(System.in);

        int L = 0;
        int C = 0;

        int faixa = 0;
        String linhao = "";

        System.out.println("Digite a Linha >>>>>");
        L = vScanner.nextInt();
        System.out.println("Digite a Coluna >>>>>");
        C = vScanner.nextInt();
        System.out.println("Digite a faixa de valores >>>>>");
        faixa = vScanner.nextInt();

        int matriz [][] = new int[L][C];

        for(int i = 0; i < matriz.length;i++){
            for(int j = 0; j<matriz[0].length; j++){
              matriz[i][j] = (int) (Math.random()*faixa);

              if(j==0){
                
                  linhao = linhao + "" + matriz[i][j];
                }else{
                  linhao = linhao + "\t" + matriz[i][j];

              }

            }
            System.out.println(linhao);
            linhao="";
        }
        
    }
}