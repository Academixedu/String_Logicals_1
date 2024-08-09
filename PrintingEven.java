import java.util.Scanner;
public class PrintingEven{  
// Write the Code to printEven Length Words With  their Length
public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("enter a string sentence");
    String a=s.nextLine();
    for(String i:a.split(" ")){
        if(i.length()%2==0){
            System.out.println(i);

        }
    }

}
}
