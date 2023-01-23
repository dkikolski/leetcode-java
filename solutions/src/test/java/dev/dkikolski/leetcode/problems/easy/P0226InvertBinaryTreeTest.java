package dev.dkikolski.leetcode.problems.easy;

import dev.dkikolski.leetcode.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static dev.dkikolski.leetcode.TreeNodes.treeNode;
import static dev.dkikolski.leetcode.assertions.predicates.TreeNodeMatcher.expectedTreeMatcher;
import static dev.dkikolski.leetcode.problems.easy.P0226InvertBinaryTree.invertTreeIterative;
import static dev.dkikolski.leetcode.problems.easy.P0226InvertBinaryTree.invertTreeRecursive;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P0226InvertBinaryTreeTest {

    private static Stream<Arguments> testcases() {
        return Stream.of(
                arguments(treeNode(2, 1, 3), treeNode(2, 3, 1)),
                arguments(
                        treeNode(4,
                                treeNode(2, 1, 3),
                                treeNode(7, 6, 9)),
                        treeNode(4,
                                treeNode(7, 9, 6),
                                treeNode(2, 3, 1))
                        )
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verifyRecursiveSolution(final TreeNode given, final TreeNode expected) {
        assertThat(invertTreeRecursive(given)).matches(expectedTreeMatcher(expected));
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verifyIterativeSolution(final TreeNode given, final TreeNode expected) {
        assertThat(invertTreeIterative(given)).matches(expectedTreeMatcher(expected));
    }
}