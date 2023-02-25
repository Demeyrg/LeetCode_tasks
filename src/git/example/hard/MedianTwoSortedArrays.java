package git.example.hard;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/***
 *
 * [Level]:         Hard
 *
 * [Link]:          https://leetcode.com/problems/median-of-two-sorted-arrays/
 *
 * [Description]:   Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median
 * of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 *
 ***/
public class MedianTwoSortedArrays {

    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
        System.out.println(findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
        System.out.println(findMedianSortedArrays(new int[]{2, 7}, new int[]{5, 10}));
        System.out.println(findMedianSortedArrays(new int[]{2, 7}, new int[]{}));
    }

//    Worst case scenario, But it's clearer.:
    public static double findMedianSortedArraysTwoOption(int[] nums1, int[] nums2) {
        int[] ints = IntStream.concat(Arrays.stream(nums1), Arrays.stream(nums2)).sorted().toArray();
        if (ints.length % 2 == 0) {
            return ((double) ints[(ints.length / 2) - 1] + (double) ints[(ints.length / 2)]) / 2;
        } else {
            return ints[ints.length/2];
        }
    }

//    Better case scenario:
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] resultArr = new int[nums1.length + nums2.length];
        int counterOne = 0;
        int counterTwo = 0;
        for (int i = 0; i < resultArr.length; i++) {
            Integer first;
            Integer second;

            if (i - counterOne < nums1.length) {
                first = nums1[i - counterOne];
            } else {
                first = null;
            }

            if (i - counterTwo < nums2.length) {
                second = nums2[i - counterTwo];
            } else {
                second = null;
            }

            if (first != null && second != null) {
                if (first < second) {
                    resultArr[i] = first;
                    counterTwo++;
                } else {
                    resultArr[i] = second;
                    counterOne++;
                }
            } else if (first != null) {
                resultArr[i] = first;
            } else if (second != null) {
                resultArr[i] = second;
            }
        }
        int length =resultArr.length;
        int indexMid = (length-1)/2;
        if (length % 2 == 0) {
            return ((double) resultArr[indexMid] + (double) resultArr[indexMid + 1]) / 2;
        } else {
            return resultArr[indexMid];
        }
    }
}
