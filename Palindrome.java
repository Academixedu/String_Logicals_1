import java.util.Scanner;
public class Palindrome{
// prepare a Code to findout whether a String is Palindrome or not
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your string");
    String n=sc.nextLine();
    String rev="";
      for(int i=n.length()-1;i>=0;i--){
    rev =rev+n.charAt(i);
}
    if(n.equals(rev)){
    System.out.println("Given String is a palindrome:");
    }
    else{
        System.out.println("Given String is a not a palindrome");
    }
}
}
