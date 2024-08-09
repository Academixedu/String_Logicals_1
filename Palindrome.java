public class Palindrome{
// prepare a Code to findout whether a String is Palindrome or not
    public static void main(String[] args) {
        String a="wow";
        String rev="";
        for(int i=a.length()-1;i>=0;i--)
        {
            rev+=a.charAt(i);
        }
        if(a.equals(rev)){
            System.err.println("it ia a palindrome :"+rev);
        }else{
            System.out.println("it is not a palindrome"+rev);
        }
       

    }
}
