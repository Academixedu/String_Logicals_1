 import java.util.Scanner;
 public class PrintingEven{  
// Write the Code to printEven Length Words With  their Length
 public static void dynamic(String s){
    String [] s_words=s.split(" ");
    int s_length[]=new int[s_words.length];
    for(int i=0;i<s_words.length;i++){
            s_length[i]=s_words[i].length();
            if(s_length[i]%2==0){
                System.out.println(s_words[i]+ " "+s_words[i].length());
            }
    }

 }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("give your sentence");
    String s=sc.nextLine();
    PrintingEven p=new PrintingEven();
    p.dynamic(s);
}
}
