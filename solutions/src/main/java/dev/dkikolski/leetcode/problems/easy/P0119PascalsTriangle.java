package dev.dkikolski.leetcode.problems.easy;

import java.util.LinkedList;
import java.util.List;

public class P0119PascalsTriangle {
    public static List<Integer> getRow(int rowIndex) {
        final var row = new LinkedList<Integer>();
        row.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            for (int j = i - 1; j >= 1; j--) {
                row.set(j, row.get(j - 1) + row.get(j));
            }
            row.add(1);
        }
        return row;
    }
}
