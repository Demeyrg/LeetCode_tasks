package git.example.complex.arrayandstring;


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
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        return nums1;
    }

//    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
//        for (int j = 0, i = m; j < n; j++) {
//            nums1[i] = nums2[j];
//            i++;
//        }
//        Arrays.sort(nums1);
//        return nums1;
//    }

}
