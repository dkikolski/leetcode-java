package dev.dkikolski.leetcode.problems.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class P0036ValidSudoku {

    public static boolean isValidSudokuN3(final char[][] board) {
        final var foundDigits = new HashSet<Character>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                final var c = board[i][j];
                if (c != '.' && !foundDigits.add(c)){
                    return false;
                }
            }
            foundDigits.clear();
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                final var c = board[j][i];
                if (c != '.' && !foundDigits.add(c)) {
                    return false;
                }
            }
            foundDigits.clear();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = i * 3; k < i * 3 + 3; k++) {
                    for (int l = j * 3; l < j * 3 + 3; l++) {
                        final var c = board[k][l];
                        if (c != '.' && !foundDigits.add(c)) {
                            return false;
                        }
                    }
                }
                foundDigits.clear();
            }
        }
        return true;
    }

    public static boolean isValidSudokuN2(final char[][] board) {
        final Set<Character> foundDigitsRows = new HashSet<>(9);
        final Set<Character> foundDigitsColumns = new HashSet<>(9);
        final Map<Integer, Set<Character>> squares = new HashMap<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                final var colChar = board[i][j];
                final var rowChar = board[j][i];
                if (alreadyExists(colChar, foundDigitsColumns)) {
                    return false;
                }
                if (alreadyExists(rowChar, foundDigitsRows)) {
                    return false;
                }
                final var squareId = i / 3 * 3 + j / 3;
                final var foundDigitsInSquare = squares.getOrDefault(squareId, new HashSet<>());
                if (alreadyExists(colChar, foundDigitsInSquare)) {
                    return false;
                }
                squares.put(squareId, foundDigitsInSquare);
            }
            foundDigitsRows.clear();
            foundDigitsColumns.clear();
        }
        return true;
    }

    public static boolean alreadyExists(final char c, final Set<Character> set) {
        return c != '.' && !set.add(c);
    }
}
