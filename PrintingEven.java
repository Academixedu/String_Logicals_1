import java.util.Scanner;
public class PrintingEven{  
// Write the Code to printEven Length Words With  their Length
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your String here :");// ex: my name is fayaz
    String s = sc.nextLine();
    String words[] = s.split("-");// splitting the words with this -
    int length[]=  new int [words.length];// calculating the words length my is 2 length
    for(int i=0;i<words.length;i++){
        length[i]= words[i].length();//0 =m,1=y
    }
    for (int i=0;i<words.length;i++){
        if(length[i]%2==0){
            System.out.println("even String is : "+words[i]);
    }
}
}
}







