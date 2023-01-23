package dev.dkikolski.leetcode.problems.medium;

import dev.dkikolski.leetcode.annotations.Medium;
import dev.dkikolski.leetcode.annotations.SlidingWindow;

import java.util.HashSet;

@SlidingWindow
@Medium
public class P0424LongestRepeatingCharacterReplacement {

    public static int characterReplacement(final String s, final int k) {
        int maxLength = 0;
        final var uniqueLetters = new HashSet<Character>();
        for (char c : s.toCharArray()) {
            uniqueLetters.add(c);
        }
        for (char c : uniqueLetters) {
            var start = 0;
            var count = 0;
            var end = 0;
            while (end < s.length()) {
                if (s.charAt(end) == c) {
                    count++;
                }
                while(!isWindowValid(start, end, count, k)) {
                    if (s.charAt(start) == c) {
                        count--;
                    }
                    start++;
                }
                maxLength = Math.max(maxLength, end - start + 1);
                end++;
            }
        }
        return maxLength;
    }

    private static boolean isWindowValid(final int start, final int end, final int count, final int k) {
        return end + 1 - start - count <= k;
    }
}
