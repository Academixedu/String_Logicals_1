public class PrintingEven{  
// Write the Code to printEven Length Words With  their Length\
public void dunamic(String s){

    String []words=s.split(" ");
    int[] wordlength=new int[words.length];

    for(int i=0;i<words.length;i++){
        wordlength[i]=words[i].length();
    }
        for(int i=0;i<words.length;i++)
        {
            if(wordlength[i]%2==0){
            System.out.println(words[i]+" "+words[i].length());}
		}
        }
    
public static void main(String[] args) {
    System.out.println("Even length words");
    String s="Oppenhimmer introduced Atomic Bomb";
    PrintingEven p=new PrintingEven();
    p.dunamic(s);

}
}
