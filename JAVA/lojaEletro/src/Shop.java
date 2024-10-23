public class Shop {
    public static void main(String[] args) {
        int qtd = 15;
        Biblioteca []loja = new Biblioteca[qtd];
        double soma = 0, md = 0;
        String filtro = "loja 7";

        for (int i = 0; i < loja.length; i++) {
            loja[i] = new Biblioteca();

            loja[i].inserir(("loja "+i),(double) (Math.random()*99.)+2999.);
           // loja[i].mostrar();
            soma += loja[i].eltroValue;

        }
        md = soma/loja.length;

        for (int i = 0; i < loja.length; i++) {
            if (loja[i].eltroValue < md ){
                loja[i].mostrar();
            }
        }

        for (int i = 0; i < loja.length; i++) {
            String numLimited = String.format("%.2f",loja[i].eltroValue);
            if (loja[i].nome.equals(filtro)){
                System.out.println("A LOJA É FILTRADA\n"+loja[i].nome + " "+numLimited);

            }
        }



//        Biblioteca registro = new Biblioteca();
//        registro.inserir()
    }
}