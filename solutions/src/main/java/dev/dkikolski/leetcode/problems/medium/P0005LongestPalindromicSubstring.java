package dev.dkikolski.leetcode.problems.medium;

import dev.dkikolski.leetcode.annotations.DynamicProgramming;
import dev.dkikolski.leetcode.annotations.Medium;

@Medium
@DynamicProgramming
public class P0005LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            final var oddSubstringCandidate = expand(s, i, i);
            final var evenSubstringCandidate = expand(s, i, i + 1);
            final var longerCandidate = oddSubstringCandidate.length() > evenSubstringCandidate.length()
                    ? oddSubstringCandidate
                    : evenSubstringCandidate;
            if (longerCandidate.length() > result.length()) {
                result = longerCandidate;
            }
        }
        return result;
    }

    private static String expand(final String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}
