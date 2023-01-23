package dev.dkikolski.leetcode.problems.easy;

import dev.dkikolski.leetcode.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static dev.dkikolski.leetcode.TreeNodes.treeNode;
import static dev.dkikolski.leetcode.problems.easy.P0112PathSum.hasPathSumIterative;
import static dev.dkikolski.leetcode.problems.easy.P0112PathSum.hasPathSumRecursive;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P0112PathSumTest {

    private static Stream<Arguments> testcases() {
        return Stream.of(
                arguments(
                        treeNode(1, 2, 3),
                        5,
                         false
                ),
                arguments(
                        treeNode(5, treeNode(4, treeNode(11, 7, 2), null), treeNode(8, treeNode(13), treeNode(4, null, treeNode(1)))),
                        22,
                        true
                )
        );

    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verifyRecursiveSolution(final TreeNode root, final int target, final boolean expected) {
        assertThat(hasPathSumRecursive(root, target)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verifyIterativeSolution(final TreeNode root, final int target, final boolean expected) {
        assertThat(hasPathSumIterative(root, target)).isEqualTo(expected);
    }
}