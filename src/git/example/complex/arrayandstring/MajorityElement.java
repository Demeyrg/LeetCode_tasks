package git.example.complex.arrayandstring;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/***
 *
 * [Level]:         Easy
 *
 * [Link]:          https://leetcode.com/problems/majority-element/description/?envType=study-plan-v2&envId=top-interview-150
 *
 ***/
public class MajorityElement {


    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{1, 2, 3, 0, 0, 0, 0}));
        System.out.println(majorityElement(new int[]{3, 2, 3, 2, 3}));
        System.out.println(majorityElement(new int[]{6, 6, 6, 7, 7}));
    }

//    public static int majorityElement(int[] nums) {
//        Arrays.sort(nums);
//        int n = nums.length;
//        return nums[n / 2];
//    }

    public static int majorityElement(int[] nums) {
        int count = 0;
        int consider = 0;

        for (int num : nums) {

            if (count == 0)
                consider = num;

            if (consider == num)
                count++;
            else
                count--;

        }

        return consider;

    }


//      my
//    public static int majorityElement(int[] nums) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//
//            if (map.get(nums[i]) == null)
//                map.put(nums[i], 1);
//            else
//                map.put(nums[i], map.get(nums[i]) + 1);
//
//        }
//
//        int result = 0;
//        int count = 0;
//        for (var entry : map.entrySet()) {
//            if (entry.getValue() > count) {
//                result = entry.getKey();
//                count = entry.getValue();
//            }
//        }
//
//        return result;
//    }

//      my
//    public static int majorityElement(int[] nums) {
//        Arrays.sort(nums);
//        int max = 0;
//        int tmpMax = 0;
//        int prev = nums[0];
//        int result = nums[0];
//
//        for (int i = 1; i < nums.length; i++) {
//            if (prev == nums[i]) {
//                tmpMax++;
//                if (tmpMax > max) {
//                    result = nums[i];
//                    max = tmpMax;
//                }
//            } else {
//                prev = nums[i];
//                tmpMax = 0;
//            }
//
//        }
//
//        return result;
//    }
}
