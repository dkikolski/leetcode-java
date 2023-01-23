package dev.dkikolski.leetcode.problems.medium;

import dev.dkikolski.leetcode.annotations.Medium;
import dev.dkikolski.leetcode.annotations.SlidingWindow;

import java.util.*;

@SlidingWindow
@Medium
public class P0187RepeatedDNASequences {

    public static List<String> findRepeatedDnaSequences(String s) {
        if (s.length() < 10) {
            return Collections.emptyList();
        }
        final var dnaSeqCounter = new HashMap<String, Integer>();
        int left = 0;
        int right = 9;

        while (right < s.length()) {
            var dnaSeq = s.substring(left, right + 1);
            dnaSeqCounter.put(dnaSeq, dnaSeqCounter.getOrDefault(dnaSeq, 0) + 1);
            left++;
            right++;
        }
        final var result = new LinkedList<String>();
        for (final var dnaSeq : dnaSeqCounter.keySet()) {
            if (dnaSeqCounter.get(dnaSeq) >= 2) {
                result.add(dnaSeq);
            }
        }
        return result;
    }
}
