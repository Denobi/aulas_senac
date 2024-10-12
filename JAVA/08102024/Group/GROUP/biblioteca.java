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
        ano = ano*365;
        mes = mes*31;
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
}
