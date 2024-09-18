

public class armazem {

    public static void main(String[] args) {

        int armazem[][]= new int [10][15];

        String vprod[] = {"madeira","palha","tijolo", "areia","cimento", "porta","janela","tinta", "prego"};
        int vtotal[]=new int[9];
        String linha = "";
        int inicio = 1000, fim = 9999, faixa = fim - inicio;

        int codigo,qtde;

        for (int i = 0; i < armazem.length; i++) {
            for (int j = 0; j < armazem[0].length; j++) {
                armazem[i][j] = (int) (Math.random()*faixa)+inicio;
                linha = linha + " " + armazem[i][j];
            }
            System.out.println(linha);
            linha="";
        }

        for (int i = 0; i < armazem.length; i++) {
            for (int j = 0; j < armazem[0].length; j++) {
                codigo = armazem[i][j]/1000;
                qtde = armazem[i][j]%1000;
                vtotal[codigo-1]= vtotal[codigo-1]+qtde;
            }
        }

        System.out.println("================%___________________%====================");

        for (int i = 0; i < vtotal.length; i++) {
            System.out.println(i+1 + " ☞ " +vprod[i]+"\t\t\t\t"+vtotal[i]);
        }


       
        
        
    }
}