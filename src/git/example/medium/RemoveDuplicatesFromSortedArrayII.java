package git.example.medium;

/***
 *
 * [Level]:         Medium
 *
 * [Link]:          https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/
 *
 ***/
public class RemoveDuplicatesFromSortedArrayII {

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3}));
        System.out.println(removeDuplicates(new int[]{1, 1, 1, 2, 2, 3}));
        System.out.println(removeDuplicates(new int[]{1, 2, 3, 4, 5}));
        System.out.println(removeDuplicates(new int[]{1}));
    }

    private static int removeDuplicates(int[] nums) {
        int count = 0;
        int point = 0;
        int saveNumber = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count >= 2 && nums[i] == saveNumber && i != 0) {
                nums[i] = -1;
                continue;
            } else if (count != 0 && saveNumber !=  nums[i]) {
                count = 0;
            }
            saveNumber = nums[i];
            nums[point] = nums[i];
            point++;
            count++;
        }
        return point;
    }

//    public static int removeDuplicates(int[] nums) {
//        int i = 0;
//        for (int n : nums)
//            if (i < 2 || n > nums[i-2])
//                nums[i++] = n;
//        return i;
//    }

}
