package git.example.easy;

/***
 *
 * [Level]:             Easy
 *
 * [Link]:              https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
 *
 * [Description]:       Given two strings needle and haystack, return the index of the first occurrence
 *                      of needle in haystack, or -1 if needle is not part of haystack.
 *
 * [Constraints]:       1 <= haystack.length, needle.length <= 104
 *                      haystack and needle consist of only lowercase English characters.
 ***/

public class FindTheIndexOfTheFirstOccurrenceInString {

    public static void main(String[] args) {
        String haystack1 = "sadbutsad", needle1 = "sad";
        String haystack2 = "leetcode", needle2 = "leeto";
        String haystack3 = "mississippi", needle3 = "issip";
        String haystack4 = "mississippi", needle4 = "issi";
        System.out.println(strStr(haystack1, needle1));
        System.out.println(strStr(haystack2, needle2));
        System.out.println(strStr(haystack3, needle3));
        System.out.println(strStr(haystack4, needle4));
    }

//                      It's easy and works. I do not like it. I don't use Leetcode for that.

//    public static int strStr(String haystack, String needle) {
//        return haystack.indexOf(needle);
//    }


    public static int strStr(String haystack, String needle) {
        char[] haystackChars = haystack.toCharArray();
        char[] needleChars = needle.toCharArray();
        int index = 0;
        for (int i = 0; i < haystackChars.length; i++) {
            if (haystackChars[i] == needleChars[index]) {
                index++;
                if (index == needleChars.length) {
                    return i + 1 - index;
                }
                continue;
            }
            i = i - index;
            index = 0;
        }
        return -1;
    }
}
