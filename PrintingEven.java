public class PrintingEven{  
// Write the Code to printEven Length Words With  their Length
public static void dynamic(String s){
String words[]=s.split(" ");
int []wordslength=new int[words.length];
for(int i=0;i<=words.length;i++){
    wordslength[i]=words[i].length();
    if(wordslength[i]%2==0){
        System.out.println(words[i]+"length is "+wordslength[i]);
    }
}
}
public static void statical(String s){
    for(String word:s.split(" ")){
        if(word.length()%2==0){
          System.out.println(word+""+word.length());
        }
    }
}
public static void main(String args[]){
    String s="he is a pilot";
    dynamic(s);
    statical(s);
}
}
