package JAVA.AULA24092024;

/**
 * rotina
 */
public class rotina {

    public static void main(String[] args) {
        String Nome = "Fernanda de Oliveira Gomes";
        String Iniciais = "";
        
        String vt[] = Nome.split(" ");
        int tamanho = vt.length;
        for (int i = 0; i < vt.length; i++) {
            String Temp = vt[i];
            if (vt[i].length() > 3) {

                Iniciais = Iniciais + Temp.substring(0, 1);
            }
        }
        String nomeNovo = vt[vt.length-1]+",";
        for (int i = 0; i < vt.length-1; i++) {
            nomeNovo+=" " + vt[i];
            
        }
        System.out.println(nomeNovo);
    }
}