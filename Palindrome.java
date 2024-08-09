public class palin {
        public static void main(String[] args) {
            String str = "madam"; // You can change this string to test other cases
            
            if (isPalindrome(str)) {
                System.out.println(str + " is a palindrome.");
            } else {
                System.out.println(str + " is not a palindrome.");
            }
        }
    
        public static boolean isPalindrome(String str) {
            int n = str.length();
    
            // Compare characters from the start and end moving towards the center
            for (int i = 0; i < n / 2; i++) {
                if (str.charAt(i) != str.charAt(n - i - 1)) {
                    return false; // If any characters don't match, it's not a palindrome
                }
            }
    
            return true; // If all characters match, it's a palindrome
        }
    }
    

