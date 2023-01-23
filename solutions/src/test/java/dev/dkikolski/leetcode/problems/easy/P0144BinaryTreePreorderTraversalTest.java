package dev.dkikolski.leetcode.problems.easy;

import dev.dkikolski.leetcode.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static dev.dkikolski.leetcode.TreeNodes.treeNode;
import static dev.dkikolski.leetcode.problems.easy.P0144BinaryTreePreorderTraversal.preorderTraversalIterative;
import static dev.dkikolski.leetcode.problems.easy.P0144BinaryTreePreorderTraversal.preorderTraversalRecursive;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P0144BinaryTreePreorderTraversalTest {

    private static Stream<Arguments> testcases() {
        return Stream.of(
                arguments(treeNode(1, null, treeNode(2, treeNode(3), null)), List.of(1,2,3)),
                arguments(null, Collections.emptyList()),
                arguments(treeNode(1), List.of(1))
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verifyRecursiveSolution(final TreeNode root, final List<Integer> expectedValues) {
        assertThat(preorderTraversalRecursive(root)).isEqualTo(expectedValues);
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verifyIterativeSolution(final TreeNode root, final List<Integer> expectedValues) {
        assertThat(preorderTraversalIterative(root)).isEqualTo(expectedValues);
    }
}