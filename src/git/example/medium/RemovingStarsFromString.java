package git.example.medium;

/***
 *
 * [Level]:         Medium
 *
 * [Link]:          https://leetcode.com/problems/removing-stars-from-a-string/
 *
 * [Description]:   You are given a string s, which contains stars *.
 *                  In one operation, you can:
 *                  Choose a star in s.
 *                  Remove the closest non-star character to its left, as well as remove the star itself.
 *                  Return the string after all stars have been removed.
 *
 * [Constraints]:   1 <= s.length <= 105
 *                  s consists of lowercase English letters and stars *.
 *                  The operation above can be performed on s.
 *
 ***/

public class RemovingStarsFromString {

    public static void main(String[] args) {
        System.out.println(removeStars("")); // "lecoe"
        System.out.println(removeStars("leet**cod*e")); // "lecoe"
        System.out.println(removeStars("abb*cdfg*****x*")); // a
        System.out.println(removeStars("abcdefghijklmnopqrstuvwxabcdefghijklmnopqrstuvwxz*z*z*z*z*z*z*z*z*z*z*z*z*" +
                "z*z*z*z*z*z*z*z*z*z*z*z*z*z*z*z*z*z*z*z*z*z*z*z*z*z*z*z*z*z*z*z*z*z*z*z*z*z*z*z*z*z*z*z*z*z*z*z*z*z*z*z*"));
        System.out.println(removeStars("a*a*a*a*"));
    }

    public static String removeStars(String s) {
        if (s.equals(""))
            return "";
        int count = 0;
        int cutIdx = 0;
        String str = s;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '*') {
                count++;
                if (cutIdx == 0) {
                    cutIdx = i;
                }
                continue;
            }
            if (count != 0) {
                count--;
                if (count == 0) {
                    String before = str.substring(0, i);
                    String after = str.substring(cutIdx + 1);
                    str = before + after;
                    cutIdx = 0;
                }
            }
        }
        return str;
    }

//    public static String removeStars(String s) {
//        while (true) {
//            int i = s.indexOf("*");
//            if (i < 0)
//                break;
//            String before = s.substring(0, i - 1);
//            String after = s.substring(i + 1);
//            s = before + after;
//        }
//        return s;
//    }
}
