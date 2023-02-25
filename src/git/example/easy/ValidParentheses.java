package git.example.easy;

/***
 *
 * [Level]:     Easy
 *
 * [Link]:      https://leetcode.com/problems/valid-parentheses/
 *
 * [Description]:       20. Valid Parentheses
 *
 *  Given a string s containing just the characters '(', ')', '{', '}', '[' and ']'
 *  determine if the input string is valid.
 *
 * [Constraints]:
 *
 * 1 <= s.length <= 104
 * s consists of parentheses only '()[]{}'.
 *
 * ***/


public class ValidParentheses {

    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("[()]"));
        //false
        System.out.println(isValid("[(]"));
        System.out.println(isValid("[(])"));
        System.out.println(isValid("(])"));
    }

    public static boolean isValid(String s) {
        //Runtime = 100 % (0 ms)
        //Memory = 87%
        // Code is terrible, but most effective
        char[] chars = s.toCharArray();
        int roundDiff = ')' - '(';
        int squareDiff = ']' - '[';
        int curlyDiff = '}' - '{';
        int count = 0;
        int[] counter = new int[s.length() + 1];
        for (char chr : chars) {
            if (chr == '(' || chr == '[' || chr == '{') {
                count++;
                counter[count] = chr;
                continue;
            }

            if (count == 0)
                return false;

            if (counter[count] == chr - roundDiff
                    || counter[count] == chr - squareDiff
                    || counter[count] == chr - curlyDiff) {
                counter[count] = 0;
                count--;
                continue;
            }
            return false;
        }

        return count == 0;
    }
}
