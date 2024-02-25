package git.example.complex.arrayandstring;


import java.util.Arrays;

/***
 *
 * [Level]:         MEDIUM
 *
 * [Link]:          https://leetcode.com/problems/rotate-array/description/?envType=study-plan-v2&envId=top-interview-150
 *
 ***/
public class RotateArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotate(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 2)));
        System.out.println(Arrays.toString(rotate(new int[]{1, 2, 3, 4, 5}, 2)));
        System.out.println(Arrays.toString(rotate(new int[]{1, 2, 3, 4, 5}, 3)));
        System.out.println(Arrays.toString(rotate(new int[]{1, 2, 3, 4, 5, 6}, 2)));
        System.out.println(Arrays.toString(rotate(new int[]{1, 2, 3, 4, 5, 6}, 3)));
    }

    public static int[] rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
        return nums;
    }

    private static void reverse(int[] nums, int start, int end) {

        while (start < end) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }

    }

}
