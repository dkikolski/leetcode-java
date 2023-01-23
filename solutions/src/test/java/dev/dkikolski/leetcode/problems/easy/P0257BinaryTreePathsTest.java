package dev.dkikolski.leetcode.problems.easy;

import dev.dkikolski.leetcode.TreeNode;
import dev.dkikolski.leetcode.problems.easy.P0257BinaryTreePaths;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static dev.dkikolski.leetcode.TreeNodes.treeNode;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import java.util.List;
class P0257BinaryTreePathsTest {

    private static Stream<Arguments> testcases() {
        return Stream.of(
                arguments(treeNode(1, null, null), List.of("1")),
                arguments(treeNode(1, null, treeNode(2)), List.of("1->2")),
                arguments(
                        treeNode(1,
                                treeNode(2, null, treeNode(5)),
                                treeNode(3)),
                        List.of("1->2->5","1->3")
                )

        );
    }

    @ParameterizedTest
    @MethodSource("testcases")
    void verify(final TreeNode root, final List<String> paths) {
        assertThat(P0257BinaryTreePaths.binaryTreePaths(root)).isEqualTo(paths);
    }
}