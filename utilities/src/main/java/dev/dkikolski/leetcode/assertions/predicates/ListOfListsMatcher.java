package dev.dkikolski.leetcode.assertions.predicates;

import java.util.List;
import java.util.function.Predicate;

public class ListOfListsMatcher implements Predicate<List<? extends List<Integer>>> {

    private final List<? extends List<Integer>> expected;

    private ListOfListsMatcher(List<? extends List<Integer>> expected) {
        this.expected = expected;
    }

    public static ListOfListsMatcher expectedListOfListsMatcher(List<? extends List<Integer>> expected) {
        return new ListOfListsMatcher(expected);
    }

    @Override
    public boolean test(List<? extends List<Integer>> actual) {
        if (expected.size() != actual.size()) {
            return false;
        }
        for (int i = 0; i < expected.size(); i++) {
            if (expected.get(i).size() != actual.get(i).size()) {
                return false;
            }
            for (int j = 0; j < expected.get(i).size(); j++) {
                if (expected.get(i).get(j).compareTo(actual.get(i).get(j)) != 0) {
                    return false;
                }
            }
        }
        return true;
    }

}
