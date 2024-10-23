public class Biblioteca {
    String nome;
    double eltroValue;

    void inserir (String s, double eletro){
        nome = s;
        eltroValue = eletro;
    }
    void mostrar(){
        String numLimited = String.format("%.2f",eltroValue);
        System.out.println("Nome: "+nome+"\n Preço do item: "+numLimited+" \n");
    }
}
