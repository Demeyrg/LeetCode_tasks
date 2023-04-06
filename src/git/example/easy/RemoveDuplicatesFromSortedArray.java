package git.example.easy;

import java.util.Arrays;

/***
 *
 * [Level]:             Easy
 *
 * [Link]:              https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 *
 * [Description]:       Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place
 * such that each unique element appears only once. The relative order of the elements should be kept the same.
 * Then return the number of unique elements in nums.
 *
 * [Constraints]:       1 <= nums.length <= 3 * 104
 *                      -100 <= nums[i] <= 100
 *                      nums is sorted in non-decreasing order.
 *
 ***/

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] arr1 = {1,1,2};
        int[] arr2 = {1,2};
        int[] arr3 = {1,2,3,4,5};
        int[] arr4 = {0,0,1,1,1,2,2,3,3,4}; //  [0,1,2,3,4,_,_,_,_,_]
        System.out.println(removeDuplicates(arr1));
        System.out.println(removeDuplicates(arr2));
        System.out.println(removeDuplicates(arr3));
        System.out.println(removeDuplicates(arr4));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
    }

    public static int removeDuplicates(int[] nums) {
        int pivot = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[pivot] < nums[i]) {
                nums[++pivot] = nums[i];
            }
        }
        return pivot + 1;
    }


    //      If you make an array with only unique numbers

//    public static int removeDuplicates(int[] nums) {
//         int pivot = 0;
//         for (int i = 1; i < nums.length; i++) {
//             if (pivot + 1 == i && nums[pivot] < nums[i]) {
//                 pivot++;
//                 continue;
//             }
//             if (nums[pivot] < nums[i]) {
//                 pivot++;
//                 nums[pivot] = nums[i];
//             }
//             nums[i] = -100000;
//         }
//         return pivot + 1;
//    }
}