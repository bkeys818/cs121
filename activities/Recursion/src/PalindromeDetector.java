//******************************************************************
//  Activity 23
//  Name: Ben Keys
//  Data Structures Date: 03/15/2023
//******************************************************************
//  An example of a recursive function that looks for a palindrome.
//******************************************************************

public class PalindromeDetector {
    public static void main(String[] args) {
        String[] words = {"Tenet", "Runway", "Hannah", "Baseball"};
        for (String word : words) {
            if (isPalindrome(word)) {
                System.out.println(word + " IS a palindrome.");
            } else {
                System.out.println(word + " IS NOT a palindrome.");
            }
        }
    }

    public static boolean isPalindrome(String word) {
        int length = word.length();
        if (length <= 1) {
            return true;
        } else if (Character.toLowerCase(word.charAt(0)) == Character.toLowerCase(word.charAt(length - 1))) {
            return isPalindrome(word.substring(1, length - 1));
        } else {
            return false;
        }
    }
}
