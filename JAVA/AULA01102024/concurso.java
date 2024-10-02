package JAVA.AULA01102024;

public class concurso {
    public static void main(String[] args) {
        int qtdAlunos = 15;
        String nomes[] = new String[qtdAlunos];
        double media[] = new double[qtdAlunos];
        int inscricao[] = new int[qtdAlunos];
        double notas[][] = new double[qtdAlunos][3];
        

        int mate = 2;
        int port = 3;
        int espec = 4;

        String name = "";
        int cont = 0;
        for (int i = 0; i < nomes.length; i++) {
            for (int j = 0; j < qtdAlunos; j++) {
                char letrasAle = (char) ((int) (Math.random() * 25 + 65));
                name += letrasAle;
            }
            nomes[i] = name+" ";
            cont++;
            inscricao[i] = cont;
            name="";

            // System.out.println(inscricao[i]);
            // System.out.println(nomes[i]);
        }
        for(int i = 0 ; i < qtdAlunos;i++){
            double tempN = ((double) (Math.random()*10)+91);
           
            notas[i][i]=tempN;
            System.out.println(notas[i][i]);
        }

    }
}
