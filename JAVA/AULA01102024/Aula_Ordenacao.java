public class Aula_Ordenacao {

    public static void main(String[] args) {
        
       final int TAM = 250;
       final int COLOCADO = 10;
       
       String cand[] = new String[TAM];
       double port[] = new double[TAM];
       double mate[] = new double[TAM];
       double conh[] = new double[TAM];
       double medi[] = new double[TAM];
       
       for(int i = 0;i<cand.length;i++){
           cand[i] = "candidato"+i;
           port[i] = (Math.random()*100)+10;
           mate[i] = (Math.random()*100)+10;
           conh[i] = (Math.random()*100)+10;
           medi[i] = (port[i]*2 + mate[i]*3 + conh[i]*4)/9;
       }
       
        for(int i = 0;i<TAM-1; i++) 
        {
           for(int j = 0; j < TAM - 1 - i; j++) 
           {
              if(medi[j]<medi[j + 1]) //if(b[j].compareTo(b[j + 1])<0)
              {
                 double aux = medi[j];
                 String auxT = cand[j];
                    
                 medi[j] = medi[j+1];
                 cand[j] = cand[j+1];
                              
                 medi[j+1] = aux;
                 cand[j+1] = auxT;             
           }
      }
    }
    
    System.out.println("--- Classificados do concurso ----");
    for(int i =0;i<COLOCADO;i++)
         System.out.println(cand[i]+"\t"+medi[i]);
}