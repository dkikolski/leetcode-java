package dev.dkikolski.leetcode.problems.easy;

import dev.dkikolski.leetcode.annotations.Easy;

@Easy
class P0125ValidPalindrome {
    static boolean isPalindrome(String s) {
        final var chars = s.toLowerCase().replaceAll("[\\W_]", "").toCharArray();
        var left = 0;
        var right = chars.length - 1;
        while (left < right) {
            if (chars[left] != chars[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
