package git.example.easy;

/*
Description:

Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

Constraints:

    1) 1 <= strs.length <= 200
    2) 0 <= strs[i].length <= 200
    3) strs[i] consists of only lowercase English letters.
 */

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] firstArray = new String[]{"flower", "flow", "flight"};     // Output: "fl"
        String[] secondArray = new String[]{"dog","racecar","car"};         // output = ""

        printCommonPrefix(firstArray);
        printCommonPrefix(secondArray);
    }

    private static void printCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (prefix.length() == 0)
                break;
            if (strs[i].startsWith(prefix))
                continue;
            prefix = substring(strs[i], prefix);
        }
        System.out.println(prefix);
    }

    private static String substring(String str, String prefix) {
        if (prefix.length() == 0)
            return "";
        if (!str.startsWith(prefix))
            prefix = substring(str, prefix.substring(0, prefix.length() - 1));
        return prefix;
    }
}
