package dev.dkikolski.leetcode.problems.easy;

import dev.dkikolski.leetcode.annotations.Easy;

@Easy
public class P0171ExcelSheetColumnNumber {

    public static int titleToNumber(String columnTitle) {
        int acc = 0;
        int len = columnTitle.length();
        for (int i = len - 1; i >= 0; i--) {
            int charValue = columnTitle.charAt(i) - 'A' + 1;
            acc += charValue * Math.pow(26, len - i - 1);
        }
        return acc;
    }
}
