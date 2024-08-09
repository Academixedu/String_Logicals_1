public class PrintingEven{  
// Write the Code to printEven Length Words With  their Length
public static void main(String[] args) {
    String a="my self sai";
    String words[]=a.split(" ");
    int length[]=new int [words.length];
    for(int i=0;i<words.length;i++){
        length[i]=words[i].length();
    }
    for(int i=0;i<words.length;i++){
        if(length[i]%2==0){
            System.out.println(+length[i]+ " it's even :"+words[i]);
        }else{
            System.out.println(+length[i]+ " it's not even :"+words[i]);
        }
    }


}
}
