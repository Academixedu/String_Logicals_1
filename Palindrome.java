public class Palindrome{
// prepare a Code to findout whether a String is Palindrome or not
public static Boolean rev(String s){
    String rev="";
    boolean a=false;
    for(int i=s.length()-1;i>=0;i-- ){
        rev=rev+s.charAt(i);

    }
    if(s.equals(rev)){
        System.out.println("palindrome");
        a=true;
    
    }
    return a;
   
}
public static void main(String[] args) {
    String s="wow";
    System.out.println(rev(s));
}
}
