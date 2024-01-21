package git.example.easy;


import java.util.Arrays;

/***
 *
 * [Level]:         Easy
 *
 * [Link]:          https://leetcode.com/problems/merge-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
 *
 ***/
public class MergeSortedArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3)));
    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        for (int j = 0, i = m; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
        return nums1;
    }

//    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
//        int countNums1 = m - 1;
//        int countNums2 = n - 1;
//        for (int i = nums1.length - 1; i >= 0; i--) {
//            if (countNums2 >= 0) {
//                if (countNums1 >= 0 && nums1[countNums1] > nums2[countNums2]) {
//                    nums1[i] = nums1[countNums1];
//                    nums1[countNums1--] = 0;
//                } else {
//                    nums1[i] = nums2[countNums2--];
//                }
//            } else {
//                nums1[i] = nums1[countNums1--];
//            }
//        }
//        return nums1;
//    }

//
//    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
//        int[] arr= new int[m+n];
//        int countNums1 = 0;
//        int countNums2 = 0;
//
//        for(int i = 0; i < arr.length; i++) {
//
//            if (countNums2 < n) {
//
//                if (countNums1 < m) {
//
//                    if (nums1[countNums1] > nums2[countNums2]) {
//                        arr[i] = nums2[countNums2];
//                        countNums2++;
//                    } else if (nums1[countNums1] == nums2[countNums2]) {
//                        arr[i] = nums1[countNums1];
//                        arr[i + 1] = nums2[countNums2];
//                        i++;
//                        countNums2++;
//                        countNums1++;
//
//                    } else {
//                        arr[i] = nums1[countNums1];
//                        countNums1++;
//                    }
//
//
//                } else {
//                    arr[i] = nums2[countNums2];
//                    countNums2++;
//                }
//
//            } else {
//                arr[i] = nums1[countNums1];
//                countNums1++;
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            nums1[i] = arr[i];
//        }
//        return nums1;
//    }


}
