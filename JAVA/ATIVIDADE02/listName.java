public class listName {
    public static void main(String[] args) {
         String fraseVerif = "ananda Ana Banana";
         String verifString = "Ana";

         fraseVerif = fraseVerif.toUpperCase();
         verifString = verifString.toUpperCase();
        
         int qtdRepet = 0;
        

         String tempString = fraseVerif.replace(" ","");
         
         for(int i = 0; i<=tempString.length()-3;i++){
            String fraseLimp = tempString.substring(i,i+3);
            if(fraseLimp.equals(verifString)){
                qtdRepet++;
            }
            
        }
        System.out.println("Quantidade de vezes que apareceu a palavra "+verifString +" = "+qtdRepet);

    }
}
