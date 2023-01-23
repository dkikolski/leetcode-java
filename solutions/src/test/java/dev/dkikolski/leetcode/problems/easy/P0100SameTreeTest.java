package dev.dkikolski.leetcode.problems.easy;

import dev.dkikolski.leetcode.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static dev.dkikolski.leetcode.TreeNodes.treeNode;
import static dev.dkikolski.leetcode.problems.easy.P0100SameTree.isSameTreeIterative;
import static dev.dkikolski.leetcode.problems.easy.P0100SameTree.isSameTreeRecursive;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P0100SameTreeTest {

    private static Stream<Arguments> testcases() {
        return Stream.of(
                arguments(
                        treeNode(1, treeNode(2), treeNode(3)),
                        treeNode(1, treeNode(2), treeNode(3)),
                        true
                ),
                arguments(
                        treeNode(1, treeNode(2), null),
                        treeNode(1, null, treeNode(2)),
                        false
                ),
                arguments(
                        treeNode(1, treeNode(2), treeNode(1)),
                        treeNode(1, treeNode(1), treeNode(2)),
                        false
                )
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verifyRecursiveSolution(final TreeNode p, final TreeNode q, final boolean expected) {
        assertThat(isSameTreeRecursive(p, q)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verifyIterativeSolution(final TreeNode p, final TreeNode q, final boolean expected) {
        assertThat(isSameTreeIterative(p, q)).isEqualTo(expected);
    }
}