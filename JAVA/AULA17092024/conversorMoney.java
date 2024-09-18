public class conversorMoney {
    public static void main(String[] args) {
        int mensal[][] = new int[5][30];
        String paises[] = {"Brasil","China","Russia", "Gabão","Egito"};
        double vtotal[]=new double[5];
        String linha = "";
        int inicio = 1000, fim = 9999, faixa = fim - inicio;

        int codigo;
        Double qtde, euro = 6.10;

        for (int i = 0; i < mensal.length; i++) {
            for (int j = 0; j < mensal[0].length; j++) {
                mensal[i][j] = (int) (Math.random()*faixa)+inicio;
                linha = linha + " " + mensal[i][j];
            }
            System.out.println(linha);
            linha="";
        }
        for (int i = 0; i < mensal.length; i++) {
            for (int j = 0; j < mensal[0].length; j++) {
                codigo = mensal[i][j]/1000;
                qtde = mensal[i][j]%1000.;
                Double calcConv = (qtde/euro);
                // vtotal[codigo - 1] = vtotal[codigo - 1] + calcConv;
                System.out.println(calcConv);
                // vtotal[codigo-1]= vtotal[codigo-1] + calcConv;
            }
        }
        System.out.println("================%___________________%====================");

        for (int i = 0; i < vtotal.length; i++) {
            System.out.println(i+1 + " ☞ " +paises[i]+"\t\t\t\t"+vtotal[i]);
        }

    }
}
