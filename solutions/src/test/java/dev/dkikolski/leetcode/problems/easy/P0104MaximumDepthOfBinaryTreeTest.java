package dev.dkikolski.leetcode.problems.easy;

import dev.dkikolski.leetcode.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static dev.dkikolski.leetcode.TreeNodes.treeNode;
import static dev.dkikolski.leetcode.problems.easy.P0104MaximumDepthOfBinaryTree.maxDepthIterative;
import static dev.dkikolski.leetcode.problems.easy.P0104MaximumDepthOfBinaryTree.maxDepthRecursive;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P0104MaximumDepthOfBinaryTreeTest {

    private static Stream<Arguments> testcases() {
        return Stream.of(
                arguments(
                        treeNode(3,
                                treeNode(9),
                                treeNode(20,
                                        treeNode(15),
                                        treeNode(7))
                        ),
                        3
                ),
                arguments(
                        treeNode(1,
                                null,
                                treeNode(2)
                        ),
                        2
                )
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verifyRecursiveSolution(final TreeNode root, final int expected) {
        assertThat(maxDepthRecursive(root)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verifyIterativeSolution(final TreeNode root, final int expected) {
        assertThat(maxDepthIterative(root)).isEqualTo(expected);
    }


}