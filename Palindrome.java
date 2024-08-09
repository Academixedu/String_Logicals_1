import java.util.Scanner;
 class Palindrome{
    public static void main(String[] args) {
        // prepare a Code to findout whether a String is Palindrome or not
        Scanner s=new Scanner(System.in);
        System.out.println("enter string");
        String a=s.nextLine();//sos
        System.out.println(a.length());

        String rev="";
        for(int i=a.length()-1;i>=0;i--){
            rev=rev+a.charAt(i);//
        }
        if(a.equals(rev)){
            System.out.println("Pallindrome");
        }
        else{
            System.out.println("not a pallindrome");
        }

        
    }}

