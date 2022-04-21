package git.example.easy;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(140%10);
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(123));
        System.out.println(isPalindrome(1212));
    }

//    static boolean isPalindrome(int x){
//        char[] numbers = String.valueOf(x).toCharArray();
//        List<Character> listNumbers = new ArrayList<>();
//        for (char number:numbers)
//            listNumbers.add(number);
//        for (int i = 0; i < listNumbers.size()/2; i++) {
//            if (listNumbers.get(i) != listNumbers.get(listNumbers.size()-i-1))
//                return false;
//        }
//        return true;
//    }

    static boolean isPalindrome(int x){
        int revertedNumber = 0;
        while(x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        return x == revertedNumber || x == revertedNumber/10;
    }
}
