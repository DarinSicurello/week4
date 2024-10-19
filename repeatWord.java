
public class repeatWord{

   public static String repeatWord(String word, int n) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < n; i++) {
            result.append(word); // Append the word to the result
        }
        
        return result.toString(); // Convert StringBuilder to String and return
    }
}
