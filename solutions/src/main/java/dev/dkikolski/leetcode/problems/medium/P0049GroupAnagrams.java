package dev.dkikolski.leetcode.problems.medium;

import java.util.*;
import java.util.stream.Collectors;

public class P0049GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {
        final Map<String, List<String>> groupedAnagrams = new HashMap<>();
        for (final String s : strs) {
            final var keyChars = s.toCharArray();
            Arrays.sort(keyChars);
            final var key = String.valueOf(keyChars);
            final var anagrams = groupedAnagrams.getOrDefault(key, new LinkedList<>());
            anagrams.add(s);
            groupedAnagrams.put(key, anagrams);
        }
        return new ArrayList<>(groupedAnagrams.values());
    }

    public static List<List<String>> groupAnagramsStreams(final String[] strs) {
        return Arrays
                .stream(strs)
                .collect(Collectors.collectingAndThen(Collectors.groupingBy(s -> sortCharacters(s)), map -> new LinkedList<>(map.values())));
    }

    private static String sortCharacters(final String s) {
        final var sa = s.toCharArray();
        Arrays.sort(sa);
        return String.valueOf(sa);
    }
}
