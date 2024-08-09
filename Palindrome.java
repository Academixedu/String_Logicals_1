import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str =sc.nextLine();
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
                rev+=str.charAt(i);
                if(str.equals(rev)){
                    System.out.println("The Given String is Palindrome: "+rev);
                }
            }
             if(!str.equals(rev)){
                System.out.println("The Given String is not a Palindrome: "+str);
            }
    }
}
