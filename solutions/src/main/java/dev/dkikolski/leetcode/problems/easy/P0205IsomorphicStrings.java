package dev.dkikolski.leetcode.problems.easy;

import java.util.HashMap;
import java.util.Map;

public class P0205IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        final Map<Character, Character> s2tMapping = new HashMap<>();
        final Map<Character, Character> t2sMapping = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            final var sc = s.charAt(i);
            final var tc = t.charAt(i);
            if (s2tMapping.containsKey(sc) && s2tMapping.get(sc) != tc) {
                return false;
            } else if (t2sMapping.containsKey(tc) && t2sMapping.get(tc) != sc) {
                return false;
            } else {
                s2tMapping.put(sc, tc);
                t2sMapping.put(tc, sc);
            }
        }
        return true;
    }
}
