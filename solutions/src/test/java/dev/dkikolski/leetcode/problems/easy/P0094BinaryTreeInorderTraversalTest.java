package dev.dkikolski.leetcode.problems.easy;

import dev.dkikolski.leetcode.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static dev.dkikolski.leetcode.TreeNodes.treeNode;
import static dev.dkikolski.leetcode.problems.easy.P0094BinaryTreeInorderTraversal.inorderTraversalIterative;
import static dev.dkikolski.leetcode.problems.easy.P0094BinaryTreeInorderTraversal.inorderTraversalRecursive;
import static org.assertj.core.api.Assertions.assertThat;

class P0094BinaryTreeInorderTraversalTest {

    private static Stream<Arguments> testcases() {
        return Stream.of(
                Arguments.arguments(
                        treeNode(1, null, treeNode(2, treeNode(3), null)),
                        List.of(1, 3, 2)
                ),
                Arguments.arguments(
                        null,
                        Collections.emptyList()
                ),
                Arguments.arguments(
                        treeNode(1),
                        List.of(1)
                )

        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verifyRecursiveSolution(final TreeNode givenRoot, final List<Integer> expected) {
        assertThat(inorderTraversalRecursive(givenRoot)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verifyIterativeSolution(final TreeNode givenRoot, final List<Integer> expected) {
        assertThat(inorderTraversalIterative(givenRoot)).isEqualTo(expected);
    }
}