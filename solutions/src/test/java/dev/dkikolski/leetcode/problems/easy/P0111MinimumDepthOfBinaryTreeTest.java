package dev.dkikolski.leetcode.problems.easy;

import dev.dkikolski.leetcode.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static dev.dkikolski.leetcode.TreeNodes.treeNode;
import static dev.dkikolski.leetcode.problems.easy.P0111MinimumDepthOfBinaryTree.minDepthIterative;
import static dev.dkikolski.leetcode.problems.easy.P0111MinimumDepthOfBinaryTree.minDepthRecursive;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P0111MinimumDepthOfBinaryTreeTest {

    private static Stream<Arguments> testcases() {
        return Stream.of(
                arguments(
                        treeNode(3,
                                treeNode(9),
                                treeNode(20, 15, 7)
                        ),
                        2
                ),
                arguments(
                        treeNode(2, null, treeNode(3, null, treeNode(4, null, treeNode(5, null, treeNode(6))))),
                        5
                )
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verifyRecursiveSolution(final TreeNode root, final int expected) {
        assertThat(minDepthRecursive(root)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verifyIterativeSolution(final TreeNode root, final int expected) {
        assertThat(minDepthIterative(root)).isEqualTo(expected);
    }
}