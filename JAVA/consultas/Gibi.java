package JAVA.consultas;

public class Gibi {
    String nome;
    int ano;
    int numero;
    double valor;

    void inserir ( String n, int a, int num, double v){
        nome = n;
        ano = a;
        numero = num;
        valor =v;

    }
    void imprimir(){
        String linha = "nome: "+nome+"\n Ano: "+ano+"\n numero: "+numero+"\n Valor: "+valor+"\n";
        System.out.println(linha);

    }
}
