package dev.dkikolski.leetcode.problems.medium;

import dev.dkikolski.leetcode.annotations.Medium;
import dev.dkikolski.leetcode.annotations.SlidingWindow;

import java.util.HashMap;

@SlidingWindow
@Medium
public class P0567PermutationInString {

    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        final var permutationCharsCount = new HashMap<Character, Integer>();
        for (final var c : s1.toCharArray()) {
            permutationCharsCount.put(c, permutationCharsCount.getOrDefault(c, 0) + 1);
        }
        var left = 0;
        var right = 0;
        final var permutationLen = s1.length();
        final var currentPermCount = new HashMap<Character, Integer>();
        while (right < s2.length()) {
            // adc dcda
            final var c = s2.charAt(right);
            final var currentLen = right - left +1;
            currentPermCount.put(c, currentPermCount.getOrDefault(c, 0) + 1);
            if (currentLen == permutationLen && currentPermCount.equals(permutationCharsCount)) {
                return true;
            } else if (currentLen == permutationLen){
                currentPermCount.put(s2.charAt(left), currentPermCount.get(s2.charAt(left)) - 1);
                if (currentPermCount.get(s2.charAt(left)) == 0) {
                    currentPermCount.remove(s2.charAt(left));
                }
                left++;
            }

            right++;
        }
        return false;
    }
}
