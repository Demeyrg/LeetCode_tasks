package git.example.easy;

/***
 *
 * [Level]:         Easy
 *
 * [Link]:          https://leetcode.com/problems/sqrtx/
 *
 * [Description]:   Given a non-negative integer x, return the square root of x rounded down to the nearest integer.
 *                  The returned integer should be non-negative as well.
 *
 * [Constraints]:   0 <= x <= 231 - 1
 *
 ***/


public class Sqrt {
    public static void main(String[] args) {
        System.out.println(mySqrt(4));
        System.out.println(mySqrt(5));
        System.out.println(mySqrt(519));
        System.out.println(mySqrt(2147483647));
    }

//    public static int mySqrt(int x) {
//        return (int) Math.sqrt(x);
//    }

    public static int mySqrt(int x) {
        long pow = 1;
        while (true) {
            if (pow*pow < x)
                pow++;
            else if (pow*pow == x)
                return (int) pow;
            else
                return (int) --pow;
        }
    }
}
