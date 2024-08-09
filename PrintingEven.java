public class PrintingEven{  
// Write the Code to printEven Length Words With  their Length
public class Main {
    public static void main(String[] args)
    {
        String str = "Hello World Java Programming";
        String[] words = str.split(" ");
        for (String word : words) {
            int length = word.length();
            if (length % 2 == 0 && length > 0)
            {
                System.out.printf("%s - Length: %d%n", word, length);
            }
        }
    }
}
}
