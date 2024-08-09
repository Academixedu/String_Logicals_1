import java.util.Scanner;
public class Palindrome{
// prepare a Code to findout whether a String is Palindrome or not
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your String");
    String s = sc.nextLine();
    String temp ="";
    for(int i=s.length()-1; i>=0;i--){
        temp+=s.charAt(i);
    }
       if(s.equals(temp)){
        System.out.println("palindrome is: "+temp);
       }
       else{
        System.out.println("it is not palindrome");
       }
    }
     
}

