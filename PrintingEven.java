public class PrintingEven{  
// Write the Code to printEven Length Words With  their Length
public void printEvenLengthWords(String s) {
    for (String word : s.split(" ")) {
        if (word.length() % 2 == 0) {
            System.out.println(word + " " + word.length());
        }
    }
}

public static void main(String[] args) {
    System.out.println("Even Length words");
    PrintingEven p = new PrintingEven();
    p.printEvenLengthWords("Hii Iam Swarupa From Andhra");
}

}


