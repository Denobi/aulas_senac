public class palindro{
    public static void main(String[] args) {
        String originalText = "Socorramme subi no onibus em Marrocos";
        originalText = originalText.toUpperCase();
        String tempString = originalText.replace(" ","");
        int stringLength = tempString.length();
        String invertText = "";

        for(int i = stringLength-1;i >= 0 ;i--){
            invertText += tempString.charAt(i);

            
        }
           
        if (invertText.equals(tempString)) {
            System.out.println("As frase são iguais!!!");
        }else{
            System.out.println("As frase são diferentes!!!");

        }
    }
}