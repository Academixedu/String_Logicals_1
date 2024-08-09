public class PrintingEven{  
// Write the Code to printEven Length Words With  their Length

    public static void printEvenLengthWords(String sentence) {
        int length = sentence.length();
        int wordStart = 0;
        int wordLength = 0;

        for (int i = 0; i <= length; i++) {
            if (i < length && sentence.charAt(i) != ' ') {
                wordLength++;
            } else {
                if (wordLength % 2 == 0 && wordLength > 0) {
                    System.out.println(sentence.substring(wordStart, wordStart + wordLength) + " - Length: " + wordLength);
                }
                wordStart = i + 1;
                wordLength = 0;
            }
        }
    }

    public static void main(String[] args) {
        String sentence = "in this world evry thing is possible"; // Example sentence
        printEvenLengthWords(sentence);
    }


}
