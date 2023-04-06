package git.example.easy;

import java.util.Arrays;

/***
 *
 * [Level]:             Easy
 *
 * [Link]:              https://leetcode.com/problems/remove-element/
 *
 * [Description]:       Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
 *                      The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
 *
 *                      Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
 *
 *                      Change the array nums such that the first k elements of nums contain the elements which are not equal to val.
 *                      The remaining elements of nums are not important as well as the size of nums.
 *                      Return k.
 *
 * [Constraints]:       0 <= nums.length <= 100
 *                      0 <= nums[i] <= 50
 *                      0 <= val <= 100
 *
 *
 ***/

public class RemoveElement {

    public static void main(String[] args) {
        int[] arr1 = {3,2,2,3};
        int[] arr2 = {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(arr1, 3));
        System.out.println(removeElement(arr2, 2));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    //      Solution without repeating numbers after index and without number val in array.
    public static int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                nums[i] = -1;
                continue;
            }
            if (i > index) {
                nums[index] = nums[i];
                nums[i] = -1;
            }
            index++;

        }
        return index;
    }
}
