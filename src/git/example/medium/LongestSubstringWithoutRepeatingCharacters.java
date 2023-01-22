package git.example.medium;

import java.util.ArrayList;

/***
 *  [Link]      https://leetcode.com/problems/longest-substring-without-repeating-characters/
 *
 *  Given a string s, find the length of the longest substring without repeating characters.
 *
 ***/

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("dvdf"));       // 3
        System.out.println(lengthOfLongestSubstring("abcdbag"));    // 5
        System.out.println(lengthOfLongestSubstring("aab"));        // 2
        System.out.println(lengthOfLongestSubstring("abcabcbb"));   // 3
        System.out.println(lengthOfLongestSubstring("bbbbb"));      // 1
        System.out.println(lengthOfLongestSubstring("pwwkew"));     // 3
    }

    private static int lengthOfLongestSubstring(String str) {
        int count = 0;
        int max = 0;
        int preMax = 0;
        char[] chars = str.toCharArray();
        int[] symbols = new int[257];

        for (int i = 1; i <= str.length(); i++) {

            if (symbols[chars[i - 1]] != 0) {
                i = symbols[chars[i - 1]] + 1;
                symbols = new int[256];
                symbols[chars[i - 1]] = i - 1;
                preMax = count = 1;
            } else {
                count++;
            }
            symbols[chars[i - 1]] = i;
            if (count > preMax)
                preMax = count;

            if (preMax > max)
                max = preMax;
        }
        return max;

    }

}
