package git.example.easy;

/***
 *
 * [Level]:         Easy
 *
 * [Link]:          https://leetcode.com/problems/add-binary/
 *
 * [Description]:   Given two binary strings a and b, return their sum as a binary string.
 *
 ***/

public class AddBinary {

    public static void main(String[] args) {
        System.out.println(addBinary("101111", "10"));      //110001
        System.out.println(addBinary("11", "1"));           //100
        System.out.println(addBinary("1010", "1011"));      //10101
        System.out.println(addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
                "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));      //10101
    }

    /*
     *  2 ms, 42.4 mb.
     */
    public static String addBinary(String a, String b) {
        StringBuilder builder = new StringBuilder();
        boolean remainder = false;
        String larger = a.length() > b.length() ? a : b;
        String lesser = a.length() > b.length() ? b : a;
        for (int i = larger.length() - 1, j = lesser.length() - 1; i >= 0; i--, j--) {
            char iSymbol = larger.charAt(i);
            if (j >= 0) {
                char jSymbol = lesser.charAt(j);
                if (iSymbol == '1' & jSymbol == '1') {
                    if (remainder)
                        builder.append("1");
                    else
                        builder.append("0");
                    remainder = true;
                    continue;
                }
                if (iSymbol == '0' & jSymbol == '0') {
                    if (remainder) {
                        builder.append("1");
                        remainder = false;
                    } else {
                        builder.append("0");
                    }
                    continue;
                }
                if (remainder) {
                    builder.append("0");
                } else {
                    builder.append("1");
                }
            } else {
                if (remainder & iSymbol == '1') {
                    builder.append("0");
                } else if (remainder) {
                    builder.append("1");
                    remainder= false;
                } else {
                    builder.append(iSymbol);
                }
            }
        }
        if (remainder) {
            return "1" + builder.reverse();
        }
        return builder.reverse().toString();
    }
}
