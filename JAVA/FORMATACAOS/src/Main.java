import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int qtdRes = 1000;

        ArrayList<Biblioteca> shop = new ArrayList<Biblioteca>();


        for (int i = 0; i < qtdRes ; i++) {
            Double y = (Double)(Math.random()*4900)+100;
            int u = 0;
            for (int j = 0; j < qtdRes; j++) {
             u = (int) ((Math.random()*12));

            }
                shop.add(new Biblioteca(y,u));
            //System.out.println(Biblioteca.formatarMoeda(y));
        } for (int i = 0; i < qtdRes ; i++) {

            int parceladoEm = shop.get(i).numeroParcelas;
            if (parceladoEm == 0){
                shop.get(i).mostraVendaAvista();

            }if (parceladoEm > 0){
                shop.get(i).mostraVendaAprazo();
            }
            //System.out.println(Biblioteca.formatarMoeda(y));
        }
    }
}