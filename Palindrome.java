public class Palindrome{
// prepare a Code to findout whether a String is Palindrome or not

public static boolean pal(String str){

    String rev="";
    boolean ans=false;

    for(int i=str.length()-1;i>=0;i--){
        rev=rev+str.charAt(i);
    }
    if(str.equals(rev)){
        ans=true;
        System.out.println("palindrom");
        System.out.println(rev);
    }
    return ans;

}
public static void main(String[] args) {
    String str="sos";

    System.out.println(pal(str));
}

}
