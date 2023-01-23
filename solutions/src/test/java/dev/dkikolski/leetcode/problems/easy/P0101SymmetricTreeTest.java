package dev.dkikolski.leetcode.problems.easy;

import dev.dkikolski.leetcode.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static dev.dkikolski.leetcode.TreeNodes.treeNode;
import static dev.dkikolski.leetcode.problems.easy.P0101SymmetricTree.isSymmetricIterative;
import static dev.dkikolski.leetcode.problems.easy.P0101SymmetricTree.isSymmetricRecursive;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class P0101SymmetricTreeTest {

    private static Stream<Arguments> testcases() {
        return Stream.of(
                arguments(
                        treeNode(1,
                                treeNode(2, treeNode(3), treeNode(4)),
                                treeNode(2, treeNode(4), treeNode(3))
                        ),
                        true
                ),
                arguments(
                        treeNode(1,
                                treeNode(2, null, treeNode(3)),
                                treeNode(2, null, treeNode(3))
                        ),
                        false
                )
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verifyRecursiveSolution(final TreeNode root, final boolean expected) {
        assertThat(isSymmetricRecursive(root)).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verifyIterativeSolution(final TreeNode root, final boolean expected) {
        assertThat(isSymmetricIterative(root)).isEqualTo(expected);
    }
}