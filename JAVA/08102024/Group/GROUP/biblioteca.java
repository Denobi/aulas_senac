package GROUP;
public class biblioteca {

    static double arredondar (double valor){
        return((int) ((valor * 100)+0.5))/100.;
    }
    static double raio (double R){
        double elev = Math.pow(R,3);
        return (4.0/3)*3.14*elev;
    }
    static int calcIdade(int ano,int mes, int dia){
        ano = ano*360;
        mes = mes*30;
        return ano+mes+dia;
    }
    static boolean parOrImp(int valOrig){
        boolean arm;
        if (valOrig%2==0){
        return true;

        }else{
            return false;
        }
    }
    static String compVal(int valUm,int valDois){
        if (valUm>valDois){
            return ("O primeiro valor é "+valUm+" ele é maior");
        }if(valUm == valDois){
            return ("O primeiro valor é "+valUm  +"\nO segundo valor é "+ valDois+" eles são iguais ");
        }
        else {
        return ("O segundo valor é "+valDois+" ele é maior");
        }

    }
    static int[] gerarVetor(int tamanho,int faixa){
        int novoVetor[] = new int[tamanho];
        for(int i = 0;i<novoVetor.length;i++)
            novoVetor[i] = gerarNumero(faixa);

        return novoVetor;
    }

    static int[][] gerarMatriz(int linha, int coluna,int faixa){
        int novaMatriz[][] = new int[linha][coluna];
        for(int i = 0;i<novaMatriz.length;i++){
            for(int j = 0;j<novaMatriz[0].length;j++)
            {
                novaMatriz[i][j] = gerarNumero(faixa);
            }
        }
        return novaMatriz;
    }

    static void imprimirMatriz(int m[][]){
        String linha  = "";
        for(int i = 0;i<m.length;i++){
            for(int j = 0;j<m[0].length;j++)
            {
                linha+="\t"+m[i][j];
            }
            System.out.println(linha);
            linha = "";
        }
    }





    static int maiorValor(int v[]){
        int aux = 0;
        for(int i = 0;i<v.length;i++){
            if(i==0)
                aux = v[0];

            if(v[i]>aux)
                aux = v[i];
        }
        return aux;
    }


    static int qtasVezes(int vetor[],int pesquisa){
        int vezes = 0;
        for(int i=0;i<vetor.length;i++){
            if(vetor[i]==pesquisa)
                vezes++;
        }
        return vezes;
    }

    static void mostrarRelatVendas(double venda[][],String nome[],String nomeFilial){
        double resultado[] = new double[venda.length];
        double totalFilial = 0;
        for(int i = 0;i<venda.length;i++){
            for(int j=0;j<venda[0].length;j++)
                resultado[i]+=venda[i][j];
        }

        System.out.println("Empresas Patinhas LTDA.======"+(nomeFilial==null ? "Sem nome":nomeFilial));
        for(int i = 0;i<venda.length;i++){
            System.out.println(nome[i]+" === "+arredondar(resultado[i]));
            totalFilial+=arredondar(resultado[i]);
        }
        System.out.println("Total Geral da Filial ======"+arredondar(totalFilial));
    }

    static String[] equacao2grau(double a, double b, double c)
    {
        double delta = Math.pow(-b,2)-4*a*c;
        double x1=0,x2=0;
        int flag = 0;
        String erro="";

        if(delta<0){
            flag = 1;
            erro = "Nao existem raizes reais";
        }
        else{
            flag = 2;
            x1 = (-b + Math.sqrt(delta))/2*a;
            x2 = (-b - Math.sqrt(delta))/2*a;
        }

        String v[] = new String[flag];

        if(flag == 1)
            v[0] = erro;
        else
        {
            v[0] = "Raiz x1="+x1;
            v[1] = "Raiz x2="+x2;
        }

        return v;
    }
//    static int maiorValor(int valInit[]){
//        int valMaior = 0;
//        for (int i = 0; i<valInit.length;i++){
//            if (valInit[i]>=valMaior){
//                valMaior = valInit[i];
//            }
//        }
//        return valMaior;
//
//    }
//    static  int[]gerarVetor(int tamanho, int faixa){
//        int novoVetor[]=new int [tamanho];
//        for (int i = 0; i < novoVetor.length; i++) {
//            novoVetor[i] = gerarValores(faixa);
//        }
//        return novoVetor;
//    }

//    static double ordenarVetor ( double arrayRec[]){
//        double [] valor = new double [0] ;
//        for (int i = 0; i < arrayRec.length; i++) {
//            for (int j = 0; j < valor.length; j++) {
//                if (arrayRec[i]>valor[j]){
//                    valor=arrayRec[i].;
//                }
//            }
//        }
//    }
    static  int gerarValores(int faixa){
        return (int) (Math.random()*faixa);
    }
    static int qtasVezes(int vetor[],int pesquisa){
        int vezes = 0;
        for(int i=0;i<vetor.length;i++){
            if(vetor[i]==pesquisa)
                vezes++;
        }
        return vezes;
    }

    static void mostrarRelatVendas(double venda[][],String nome[],String nomeFilial){
        double resultado[] = new double[venda.length];
        double totalFilial = 0;
        for(int i = 0;i<venda.length;i++){
            for(int j=0;j<venda[0].length;j++)
                resultado[i]+=venda[i][j];
        }

        System.out.println("Empresas Patinhas LTDA.======"+(nomeFilial==null ? "Sem nome":nomeFilial));
        for(int i = 0;i<venda.length;i++){
            System.out.println(nome[i]+" === "+arredondar(resultado[i]));
            totalFilial+=arredondar(resultado[i]);
        }
        System.out.println("Total Geral da Filial ======"+arredondar(totalFilial));
    }



    static String[] equacao2grau(double a, double b, double c)
    {
        double delta = Math.pow(-b,2)-4*a*c;
        double x1=0,x2=0;
        int flag = 0;
        String erro="";

        if(delta<0){
            flag = 1;
            erro = "Nao existem raizes reais";
        }
        else{
            flag = 2;
            x1 = (-b + Math.sqrt(delta))/2*a;
            x2 = (-b - Math.sqrt(delta))/2*a;
        }

        String v[] = new String[flag];

        if(flag == 1)
            v[0] = erro;
        else
        {
            v[0] = "Raiz x1="+x1;
            v[1] = "Raiz x2="+x2;
        }

        return v;
    }



}
