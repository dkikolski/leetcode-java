package dev.dkikolski.leetcode.problems.easy;

import dev.dkikolski.leetcode.annotations.Easy;

@Easy
public class P0168ExcelSheetColumnTitle {
    public static String convertToTitle(final int columnNumber) {
        StringBuilder sb = new StringBuilder();
        int current = columnNumber;
        while (current > 0) {
            current--;
            final var mod = current % 26;
            current /= 26;
            sb.append(i2letter(mod));
        }
        return sb.reverse().toString();
    }

    private static char i2letter(final int i) {
        return (char) ('A' + i);
    }
}
