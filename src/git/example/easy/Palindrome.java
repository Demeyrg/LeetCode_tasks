package git.example.easy;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();

        System.out.println(palindrome.isPalindrome(121));
        System.out.println(palindrome.isPalindrome(1221));
        System.out.println(palindrome.isPalindrome(123));
        System.out.println(palindrome.isPalindrome(1212));
    }

    private boolean isPalindrome(int x) {
        char[] numbers = String.valueOf(x).toCharArray();
        List<Character> listNumbers = new ArrayList<>();
        for (char number : numbers)
            listNumbers.add(number);
        for (int i = 0; i < listNumbers.size() / 2; i++) {
            if (listNumbers.get(i) != listNumbers.get(listNumbers.size() - i - 1))
                return false;
        }
        return true;
    }
}
