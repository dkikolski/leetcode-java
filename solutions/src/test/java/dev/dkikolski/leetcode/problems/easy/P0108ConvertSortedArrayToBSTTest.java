package dev.dkikolski.leetcode.problems.easy;

import dev.dkikolski.leetcode.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static dev.dkikolski.leetcode.TreeNodes.treeNode;
import static dev.dkikolski.leetcode.assertions.predicates.TreeNodeMatcher.expectedTreeMatcher;
import static dev.dkikolski.leetcode.problems.easy.P0108ConvertSortedArrayToBST.sortedArrayToBST;
import static org.assertj.core.api.Assertions.assertThat;

class P0108ConvertSortedArrayToBSTTest {

    private static Stream<Arguments> testcases() {
        return Stream.of(
                Arguments.arguments(
                        new int[]{-10, -3, 0, 5, 9},
                        treeNode(0,
                                treeNode(-10, null, treeNode(-3)),
                                treeNode(5, null, treeNode(9))
                        )
                )
        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verify(final int[] nums, final TreeNode root) {
        assertThat(sortedArrayToBST(nums)).matches(expectedTreeMatcher(root));
    }
}