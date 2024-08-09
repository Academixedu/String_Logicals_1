public class PrintingEven{
    public void even(String s){
        String []words=s.split(" ");
        int[]wordslength= new int[words.length];
        for(int i=0;i<=words.length;i++){
            wordslength[i]=words[i].length();
            if(wordslength[i]%2==0){
                System.out.println(words[i]+" "+wordslength[i]);
            }
        }

    }
    public  void Static(String s){
        for(String word:s.split(" ")){

        
        if(word.length()%2==0){
            System.out.println(word+""+word.length());

        }
    }
}
    public static void main(String[] args) {
        String s="MY NAME IS PAVANI";
        PrintingEven p=new PrintingEven();
        p.even(s);
        p.Static(s);
    }
    

// Write the Code to printEven Length Words With  their Length
}
