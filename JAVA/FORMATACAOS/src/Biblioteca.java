import java.text.DecimalFormat;


public class Biblioteca {
    Double vendaValor;
    int numeroParcelas;

    static String formatarMoeda(double valor){
        String formato = "R$ ###,###,###.00";
        DecimalFormat d = new DecimalFormat(formato);
        return d.format(valor);
    }
    public Biblioteca(Double venda, int parcelas){
        this.vendaValor = venda;
        this.numeroParcelas = parcelas;
    }
    void mostraVendaAvista(){
        System.out.println("------------------------------------------");
        System.out.println("Valor da venda: "+formatarMoeda(vendaValor)+" - Total das parcelas: "+numeroParcelas+" Pagamento Avista");
    }void mostraVendaAprazo(){
        System.out.println("------------------------------------------");

        System.out.println("Valor da venda: "+formatarMoeda(vendaValor)+" - Total das parcelas: "+numeroParcelas);
        for (int i = 0; i < numeroParcelas+1; i++) {

        System.out.println("Parcela "+i+" - "+formatarMoeda(vendaValor/numeroParcelas));
        }
    }
//    static String parcelasCalc(double valor, int parc){
//
//    }
}
