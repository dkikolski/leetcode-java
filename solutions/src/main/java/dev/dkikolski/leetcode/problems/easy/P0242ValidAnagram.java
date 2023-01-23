package dev.dkikolski.leetcode.problems.easy;

import dev.dkikolski.leetcode.annotations.Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Easy
public class P0242ValidAnagram {

    public static boolean isAnagramUsingHashmap(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        final Map<Character, Integer> lettersCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            lettersCount.put(c, lettersCount.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            if (!lettersCount.containsKey(c)) {
                return false;
            }
            int countdown = lettersCount.get(c) - 1;
            if (countdown == 0) {
                lettersCount.remove(c);
            } else {
                lettersCount.put(c, countdown);
            }
        }
        return true;
    }

    public static boolean isAnagramUsingSorting(final String s, final String t) {
        if (s.length() != t.length()) {
            return false;
        }
        final var sa = s.toCharArray();
        final var ta = t.toCharArray();
        Arrays.sort(sa);
        Arrays.sort(ta);
        return Arrays.equals(sa, ta);
    }
}
