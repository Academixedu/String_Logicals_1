public class Palindrome {
    public static boolean pal(String str) {
        String rev = "";
        boolean ans = false;
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        if (str.equals(rev)) {
            ans = true;
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
        return ans;
    }

    public static void main(String[] args) {
        String s = "SOP";
        System.out.println(pal(s));
    }
}
