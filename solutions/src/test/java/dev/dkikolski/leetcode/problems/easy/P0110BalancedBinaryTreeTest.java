package dev.dkikolski.leetcode.problems.easy;

import dev.dkikolski.leetcode.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static dev.dkikolski.leetcode.TreeNodes.treeNode;
import static dev.dkikolski.leetcode.problems.easy.P0110BalancedBinaryTree.isBalanced;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P0110BalancedBinaryTreeTest {

    private static Stream<Arguments> testcases() {
        return Stream.of(
                arguments(
                        treeNode(3,
                                treeNode(9),
                                treeNode(20, treeNode(15), treeNode(7))
                        ),
                        true
                ),
                arguments(
                        treeNode(1,
                                treeNode(2,
                                        treeNode(3,
                                                treeNode(4),
                                                treeNode(4)),
                                        treeNode(3)
                                ),
                                treeNode(2)
                        ),
                        false
                )
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verify(final TreeNode root, final boolean expected) {
        assertThat(isBalanced(root)).isEqualTo(expected);
    }
}