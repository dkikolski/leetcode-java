package dev.dkikolski.leetcode.problems.easy;

import java.util.HashSet;
import java.util.Set;

public class P0202HappyNumber {
    public static boolean isHappy(final int n) {
        final Set<Integer> visited = new HashSet<>();
        int candidate = n;
        while (candidate != 1) {
            visited.add(candidate);
            int sumofsqrs = 0;
            while (candidate > 0) {
                sumofsqrs += Math.pow(candidate % 10, 2);
                candidate /= 10;
            }
            candidate = sumofsqrs;
            if (visited.contains(candidate)) {
                return false;
            }
        }
        return true;
    }
}
