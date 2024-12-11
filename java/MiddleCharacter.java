public class MiddleCharacter {
    public static String getMiddle(String word) {
        int tamanho = word.length();
        
        if (tamanho % 2 == 0) {
            int meio = tamanho / 2; 
            return word.substring(meio - 1, meio + 1);
        } else { 
            int meio = tamanho / 2; 
            return Character.toString(word.charAt(meio)); 
        }
    }
}
