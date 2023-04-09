package git.example.easy;

import java.util.Arrays;

/***
 *
 * [Level]:             Easy
 *
 * [Link]:              https://leetcode.com/problems/plus-one/
 *
 * [Description]:       You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
 *                      The digits are ordered from most significant to least significant in left-to-right order.
 *                      The large integer does not contain any leading 0's.
 *
 *                      Increment the large integer by one and return the resulting array of digits.
 *
 ***/

public class PlusOne {

    public static void main(String[] args) {
        int[] arr = {9};
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 3, 2, 1};
        int[] arr3 = {8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        int[] arr4 = {6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,3};
        System.out.println(Arrays.toString(plusOne(arr)));
        System.out.println(Arrays.toString(plusOne(arr1)));
        System.out.println(Arrays.toString(plusOne(arr2)));
        System.out.println(Arrays.toString(plusOne(arr3)));
        System.out.println(Arrays.toString(plusOne(arr4)));
    }

    // 0 ms, 41 MB
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    // 0 ms, 40.7 MB
//    public static int[] plusOne(int[] digits) {
//        StringBuilder builder = new StringBuilder();
//        for (int i = 0; i < digits.length; i++) {
//            builder.append(digits[i]);
//        }
//        char[] chars = builder.toString().toCharArray();
//        for (int i = chars.length - 1; i >= 0; i--) {
//            if (Character.getNumericValue(chars[i]) == 9) {
//                chars[i] = '0';
//                continue;
//            }
//            int numericValue = Character.getNumericValue(chars[i]);
//            int newInt = numericValue + 1;
//            chars[i] = (char) (newInt + '0');
//            break;
//        }
//        int[] newArr = new int[Character.getNumericValue(chars[0]) == 0 ? chars.length + 1 : chars.length];
//        for (int i = 0; i < chars.length; i++) {
//            if (newArr.length > chars.length) {
//                newArr[i+1] = Character.getNumericValue(chars[i]);
//            } else {
//                newArr[i] = Character.getNumericValue(chars[i]);
//            }
//        }
//        if (newArr.length > chars.length) {
//            newArr[0] = 1;
//        }
//        return newArr;
//    }
}
