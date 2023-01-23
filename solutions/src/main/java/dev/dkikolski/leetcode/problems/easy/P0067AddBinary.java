package dev.dkikolski.leetcode.problems.easy;

import dev.dkikolski.leetcode.annotations.Easy;

@Easy
class P0067AddBinary {
    static String addBinary(final String a, final String b) {
        var i = a.length() - 1;
        var j = b.length() - 1;
        var current = 0;
        var reminder = 0;
        final var sb = new StringBuilder();

        while (i >= 0 || j >= 0) {
            if (i >= 0 && j >= 0) {
                current = binToInt(a.charAt(i)) + binToInt(b.charAt(j)) + reminder;
            }
            else if (i >= 0) {
                current = binToInt(a.charAt(i)) + reminder;
            }
            else {
                current = binToInt(b.charAt(j)) + reminder;
            }
            reminder = current / 2;
            sb.append(current % 2);
            i--;
            j--;
        }
        if (reminder > 0) {
            sb.append('1');
        }
        return sb.reverse().toString();
    }

    private static int binToInt(final char c) {
        return switch (c) {
            case '1' -> 1;
            case '0' -> 0;
            default -> throw new IllegalArgumentException("Unsupported binary value: " + c);
        };
    }

}
