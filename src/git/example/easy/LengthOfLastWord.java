package git.example.easy;

/***
 *
 * [Level]:             Easy
 *
 * [Link]:              https://leetcode.com/problems/length-of-last-word/
 *
 * [Description]:       Given a string s consisting of words and spaces, return the length of the last word in the string.
 *                      A word is a maximal substring consisting of non-space characters only.
 *
 * [Constraints]:       1 <= s.length <= 104
 *                      s consists of only English letters and spaces ' '.
 *                      There will be at least one word in s.
 *
 ***/


public class LengthOfLastWord {

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
        System.out.println(lengthOfLastWord("Hello World"));
    }

    //1 ms, 41.3 mb
//    public static int lengthOfLastWord(String s) {
//        String[] arr = s.trim().split(" ");
//        return arr[arr.length - 1].length();
//    }

    //0 ms, 41 mb
    public static int lengthOfLastWord(String s) {
        String trim = s.trim();
        int idx = trim.lastIndexOf(" ");
        return trim.substring(idx + 1).length();
    }
}
