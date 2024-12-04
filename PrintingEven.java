public class PrintingEven{  
  import java.util.Scanner;
// Write the Code to printEven Length Words With  their Length
public class printEven {  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        
        String[] words = input.split(" ");

        for (String word : words) {
            if (word.length() % 2 == 0) {
                System.out.println(word + " (Length: " + word.length() + ")");
            }
        }
        scanner.close();
    }
}
