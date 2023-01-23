package dev.dkikolski.leetcode.problems.medium;

import dev.dkikolski.leetcode.annotations.Medium;
import dev.dkikolski.leetcode.annotations.SlidingWindow;

import java.util.HashSet;
import java.util.Set;

@Medium
@SlidingWindow
public class P0003LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(final String s) {
        final Set<Character> visited = new HashSet<>();
        int max = 0;
        int left = 0;
        int right = 0;
        while (right < s.length()) {
            var c = s.charAt(right);
            if (visited.contains(c)) {
                max = Math.max(max, right - left);
                visited.remove(s.charAt(left));
                left++;
            } else {
                visited.add(c);
                right++;
            }
        }
        return Math.max(max, right - left);
    }
}
