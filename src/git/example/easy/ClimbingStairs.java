package git.example.easy;

/***
 *
 * [Level]:             Easy
 *
 * [Link]:              https://leetcode.com/problems/climbing-stairs/
 *
 * [Description]:       You are climbing a staircase. It takes n steps to reach the top.
 *                      Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 * [Constraints]:       1 <= n <= 45
 *
 ***/


public class ClimbingStairs {

    public static void main(String[] args) {
        System.out.println(climbStairs(1));
        System.out.println(climbStairs(2));
        System.out.println(climbStairs(3));
        System.out.println(climbStairs(4));
        System.out.println(climbStairs(5));
        System.out.println(climbStairs(6));
        System.out.println(climbStairs(45));
        }

    public static int climbStairs(int n) {
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        int pow = (n / 2) + 1;
        if (n % 2 == 0) {
            return (int) Math.pow(n, pow) + 1;
        } else {
            return (int) Math.pow(n, pow);
        }
    }
}
