package dev.dkikolski.leetcode.problems.easy;

import dev.dkikolski.leetcode.annotations.Easy;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

@Easy
class P0118PascalsTriangle {
    static List<List<Integer>> generate(int numRows) {
        if (numRows == 0) {
            return Collections.emptyList();
        }
        final List<List<Integer>> triangle = new LinkedList<>();
        final List<Integer> row = List.of(1);
        triangle.add(row);
        for (int i = 1; i < numRows; i++) {
            final var prevRow = triangle.get(i - 1);
            final var currentRow = new LinkedList<Integer>();
            currentRow.add(1);
            for (int j = 1; j < prevRow.size(); j++) {
                final var a = prevRow.get(j - 1);
                final var b = prevRow.get(j);
                currentRow.add(a + b);
            }
            currentRow.add(1);
            triangle.add(currentRow);
        }
        return triangle;
    }
}
