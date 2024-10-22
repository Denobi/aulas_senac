package GROUP;

public class Main {
    public static void main(String[] args) {
//      double N;
//     N = biblioteca.arredondar(289.99);
//     System.out.println(N+"");
//
//     double R;
//     R = biblioteca.raio(5);
//        System.out.println(R+"");
//        int idade = biblioteca.calcIdade(22,9,27);
//        System.out.println(idade+"");
//        int restDiv = 1;
//                boolean rr = biblioteca.parOrImp(restDiv);
//        System.out.println(rr+"");
//
//        String retornoDa = biblioteca.compVal(9,9);
//        System.out.println(retornoDa);

        int array[] = {biblioteca.gerarValores(9678)};
        int valMaior = biblioteca.maiorValor(array);
        int vetorzao []= biblioteca.gerarVetor(100,436);
        System.out.println(valMaior);
        System.out.println(vetorzao);

    }

}
