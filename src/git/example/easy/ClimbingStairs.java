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
        System.out.println(climbStairs(40));
    }

    /***
     *  0 ms, 39.2 MB
     *
     * @param n as int
     * @return int
     */
    public static int climbStairs(int n) {
        int previous = 1;
        int prePrevious = 0;
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result = previous + prePrevious;
            prePrevious = previous;
            previous = result;
        }
        return result;
    }

    /*
        It works, but it takes quite a long time.
     */
//    public static int climbStairs(int n) {
//        if (n == 1)
//            return 1;
//        if (n == 2)
//            return 2;
//        if (n == 3)
//            return 3;
//        int result = climbStairs(n - 1) + climbStairs(n - 2);
//        return result;
//    }
    
}

