package git.example.medium;

/***
 *
 * [Level]:         Medium
 *
 * [Link]:          https://leetcode.com/problems/longest-palindromic-substring/
 *
 * [Description]:   Given a string s, return the longest palindromic substring in s
 *
 * [Constraints]:   1 <= s.length <= 1000
 *                  s consist of only digits and English letters.
 ***/

public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("aaaa"));            //bb
        System.out.println(longestPalindrome("aaa"));            //bb
        System.out.println(longestPalindrome("hjimij"));        //jimij
        System.out.println(longestPalindrome("babad"));         //bab or aba
        System.out.println(longestPalindrome("babbad"));         //abba
        System.out.println(longestPalindrome("cbbd"));          //bb
        System.out.println(longestPalindrome("bb"));            //bb
        System.out.println(longestPalindrome("abc"));           //a
        System.out.println(longestPalindrome("q"));             //q
        System.out.println(longestPalindrome("kjhjimmijk"));    //jimmij
    }

    private static String longestPalindrome(String s) {
        if (s.length() == 1)
            return s;
        char[] chars = s.toCharArray();
        String max = s.substring(0, 1);

        for (int i = 0; i < s.length(); i++) {

            if (i + 1 <= s.length() - 1 && i - 1 >= 0 && chars[i-1] == chars[i+1]) {
                String tmp =  getPalindromeTwoCenter(chars, i-1, i+1);
                if (tmp.length() > max.length())
                    max = tmp;
            }
            if (i + 1 != s.length() && chars[i] == chars[i+1]) {
                String tmp =  getPalindromeTwoCenter(chars, i, i+1);
                if (tmp.length() > max.length())
                    max = tmp;
            }

        }
        return max;
    }

    private static String getPalindromeTwoCenter(char[] chars, int frst, int scnd) {
        int one = frst;
        int two = scnd;
        while (true) {
            if (scnd <= chars.length - 1 && frst >= 0 ) {
                if (chars[scnd] == chars[frst]) {
                    one = frst;
                    two = scnd;
                    frst--;
                    scnd++;
                    continue;
                }
            }
            return new String(chars).substring(one, two + 1);
        }
    }


}
