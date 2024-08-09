public class PrintingEven{  
// Write the Code to printEven Length Words With  their Length
    public void dynamic(String s){
     String words[]=s.split(" ");
     int wordsLength[] = new int[words.length];
     for(int i=0;i<words.length;i++) {
         wordsLength[i]=words[i].length();
         if(wordsLength[i]%2 == 0 ){
             System.out.println(wordsLength[i]+"  :  "+words[i]);
         }
     }
    }  
    public static void main(String[] args) {
     System.out.println("Even Length words");
     String s="Oppenhimmer introduced Atomic Bomb";
     PrintingEven p=new PrintingEven();
    p.dynamic(s);
    }
 }

