public class PrintingEven{  
// Write the Code to printEven Length Words With  their Length
    public static void main(String[] args) {
        String sentence = "Java is a powerful programming language";
        
        String[] words = sentence.split(" ");
        
        for (String word : words) {
            if (word.length() % 2 == 0) {
                System.out.println("Word: " + word + ", Length: " + word.length());
            }
        }
    }
}