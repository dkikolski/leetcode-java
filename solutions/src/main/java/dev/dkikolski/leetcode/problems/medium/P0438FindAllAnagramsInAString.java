package dev.dkikolski.leetcode.problems.medium;

import dev.dkikolski.leetcode.annotations.Medium;
import dev.dkikolski.leetcode.annotations.SlidingWindow;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

@SlidingWindow
@Medium
public class P0438FindAllAnagramsInAString {
    public static List<Integer> findAnagrams(String s, String p) {
        if (p.length() > s.length()) {
            return Collections.emptyList();
        }
        final var pMap = new HashMap<Character, Integer>();
        final var sMap = new HashMap<Character, Integer>();
        for (int i = 0; i < p.length(); i++) {
            final var pc = p.charAt(i);
            final var sc = s.charAt(i);
            pMap.put(pc, pMap.getOrDefault(pc, 0) + 1);
            sMap.put(sc, sMap.getOrDefault(sc, 0) + 1);
        }
        final var result = new LinkedList<Integer>();
        var left = 0;
        if (pMap.equals(sMap)) {
            result.add(left);
        }
        var right = p.length();
        while (right < s.length()) {
            final var rc = s.charAt(right);
            final var lc = s.charAt(left);
            sMap.put(rc, sMap.getOrDefault(rc, 0) + 1);
            sMap.put(lc, sMap.get(lc) - 1);
            if (sMap.get(lc) == 0) {
                sMap.remove(lc);
            }
            left++;
            if (pMap.equals(sMap)) {
                result.add(left);
            }
            right++;
        }
        return result;
    }

}
