public class Palindrome{
// prepare a Code to findout whether a String is Palindrome or not

public static boolean isPalindrome(String str) {
    int left = 0;
    int right = str.length() - 1;

    // Compare characters from both ends moving towards the center
    while (left < right) {
        if (str.charAt(left) != str.charAt(right)) {
            return false; // Not a palindrome if characters don't match
        }
        left++;
        right--;
    }
    return true; // it is a pelandrum if it match
}

public static void main(String[] args) {
    String testStr = "odiya"; 

    // Checking  the string is a palindrome and print the result
    if (isPalindrome(testStr)) {
        System.out.println(testStr + " is a palindrome.");
    } else {
        System.out.println(testStr + " is not a palindrome.");
    }
}
}
