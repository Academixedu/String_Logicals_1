public class Palindrome{
// prepare a Code to findout whether a String is Palindrome or not


    public static boolean pal(String str){
        String rev ="";
        boolean ans = false;
        for (int i=str.length()-1;i>=0;i--){
            rev = rev+str.charAt(i); // EYE -1 = E
        }
        if (str.equals(rev)){
            ans = true;
            System.out.println("Palindrome: " + rev);
        }
        return ans;
    }
    public static void main(String[] args) throws Exception {
        String s = "EYE";
        System.out.println(pal(s));
    }

}
